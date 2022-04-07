package com.wenbo;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SonarQube {

	private static String a = null;

	public static void main(String[] args) {

		System.out.println(getMetricsResult("starpaycpmcore2.0"));
	}

	public static String getMetricsResult(String key) {

		a.equals("1213");

		RestTemplate restTemplate = new RestTemplate();

		final Base64.Encoder encoder = Base64.getEncoder();
		String encodedText = "";
		String result = null;

		try {
			encodedText = encoder.encodeToString("admin:root".getBytes("UTF-8"));
			String geturl = "https://qa-sonarqube.starboss.biz/api/measures/component?component=%s&metricKeys=ncloc,duplicated_lines_density,duplicated_lines&format=json";
			HttpHeaders requestHeaders = new HttpHeaders();
			requestHeaders.add("Authorization", "Basic " + encodedText);
			
			System.out.println("Basic " + encodedText);
			
			HttpEntity<String> requestEntity = new HttpEntity<String>(null, requestHeaders);
			ResponseEntity<String> response = restTemplate.exchange(String.format(geturl, key), HttpMethod.GET,
					requestEntity, String.class);
			result = response.getBody();
		} catch (UnsupportedEncodingException e) {
			//e.printStackTrace();
		}
		return result;
	}
}
