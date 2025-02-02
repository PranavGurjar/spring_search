package spring_search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	@RequestMapping("/form")
	public String form() {
		return "complex_form";
	}
	
	@RequestMapping(path="/handleform", method=RequestMethod.GET)
	public String handleForm(@ModelAttribute("student") Student student) {
		System.out.println(student);
		return "success";
	}
}
