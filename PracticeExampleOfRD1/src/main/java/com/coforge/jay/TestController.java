package com.coforge.jay;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	 @PostMapping(path = "/doSomething", consumes = "application/json", produces = "application/json")
	    public void post(@Valid @RequestBody Employees request) {
	        //code
		 System.out.println("emp" +request);
	    }

}
