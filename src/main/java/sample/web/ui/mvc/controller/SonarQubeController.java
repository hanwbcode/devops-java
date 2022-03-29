package sample.web.ui.mvc.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableMap;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class SonarQubeController {

	@GetMapping("/sonarqube")
	public Map<String, Object> webhooks(@RequestParam Map<String, Object> data) {

		log.info("sonarqube :{}", data);

		String a = null;


		return ImmutableMap.<String, Object>builder().put("status", "OK").build();
	}

}