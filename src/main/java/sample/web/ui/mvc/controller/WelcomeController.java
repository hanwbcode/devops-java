package sample.web.ui.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping("/")
	public String welcome() {

		Integer a = null;
		int b = 1;

		if(a == b){
			System.out.println("a==b");
		}

		return "Hello DevOps!";
	}

}