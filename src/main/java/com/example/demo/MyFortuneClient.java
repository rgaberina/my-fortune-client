/**
 * 
 */
package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author berina
 *
 */
@RestController
public class MyFortuneClient {

	@RequestMapping("/getFortune")
	public String getFortune() {
		RestTemplate template = new RestTemplate();
		return template.getForObject("http://www.yerkee.com/api/fortune", String.class);
	}
	
}
