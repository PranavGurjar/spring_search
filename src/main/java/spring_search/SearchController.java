package spring_search;

import java.lang.management.MemoryType;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Home View.");
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {

		RedirectView redirectView = new RedirectView();
		
		if(query.isBlank()) {
			redirectView.setUrl("home");
			return redirectView;
		}
		
		String url = "https://www.google.com/search?q=" + query;
		
		
		redirectView.setUrl(url);
		
		return redirectView;
	}
}
