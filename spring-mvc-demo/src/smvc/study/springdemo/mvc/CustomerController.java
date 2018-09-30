package smvc.study.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller @RequestMapping("/customer")
public class CustomerController {
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
		// Condition to show confirmation page
		if (bindingResult.hasErrors()) {
			return "customer-form";
		}else {
			return "customer-confirmation";
		}
	}
}
