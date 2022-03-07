package sample.web.ui.mvc.controller;

import com.google.common.collect.ImmutableMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class WebhooksController {

	@PostMapping("/webhooks")
	public Map<String,Object> webhooks(@RequestBody Map<String,Object> data) {

		log.info("GitHub Webhooks :{}", data);

		return ImmutableMap.<String, Object> builder()
				.put("status", "OK")
				.build();
	}

}