package org.suganthan.springBootExample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping("/sample")
	public String sampleIt() {
		return "Hello! Welcome to Spring Boot Sample";
	}
	
}
