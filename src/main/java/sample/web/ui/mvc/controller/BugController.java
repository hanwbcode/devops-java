package sample.web.ui.mvc.controller;

import com.google.common.collect.ImmutableMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class BugController {

	@GetMapping("/bug")
	public String bug(@RequestParam Map<String, Object> data) {

		Object a = 0;
		String b = "1";

		if(a == b){
			System.out.println("aaa");
		}

		Integer count = null;

		if(count.equals(b)){

		}

		return "OK";
	}

}