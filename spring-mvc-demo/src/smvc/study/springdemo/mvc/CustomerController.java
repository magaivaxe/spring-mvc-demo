package smvc.study.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.context.Theme;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller @RequestMapping("/customer")
public class CustomerController {
	// Add a initBinder to convert trim input strings
	// remove leading and trailing whitespace
	// resolve issue for our validation
	@InitBinder
	public void InitBinder(WebDataBinder dataBinder) {
		//
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		//
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	//
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		// Add attribute to the model as Customer object
		theModel.addAttribute("customer", new Customer());
		// return the page
		return "customer-form";
	}
	//
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer customer,
			BindingResult bindingResult) {
		
		System.out.println("Binding result: " + bindingResult);
		System.out.println("\n\n\n\n");
		
		// Condition to show confirmation page
		if (bindingResult.hasErrors()) {
			return "customer-form";
		}else {
			return "customer-confirmation";
		}
	}
}





























