package spring_search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileUploadController {
	
	@RequestMapping("/uform")
	public String uform() {
		return "fileForm";
	}
}
