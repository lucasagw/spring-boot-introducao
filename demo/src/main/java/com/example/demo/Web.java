package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Web {
	
	@GetMapping("/helloworld")
	public String hello(@RequestParam (required = false) Integer id) {
		return "Hello World!" + id;
	
		//Como seria em servlet na maão, sem framework.
		//req.getParameterMap().containsKey("id");
		//String id = req.getParameter("id");
		//int idi = Integer.parseInt(id);
		// resp.getWriter().append("Hello World!"+ id);
	
	}
}
