package smvc.study.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	// need a controller method to show initial html form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	// need a controller method to process the html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// method to read data and add to the model
	@RequestMapping("/processFormVersionTwo")
	public String letShoutDude(HttpServletRequest request, Model model) {
		// read the request parameter from the html form
		String theName = request.getParameter("studentName");
		// convert the data to all caps
		theName = theName.toUpperCase();
		// create the message
		String result = "Yo! " + theName;
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	// Method to add @RequestParamenter that is the request behind scenes
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String theName, Model model) {
		// convert the data to all caps
		theName = theName.toUpperCase();
		// create the message
		String result = "Hey, you are the guy! " + theName;
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
