package org.ruanwei.demo.user.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/hello")
	public String sayHelloWorld() {
		return "Hello World!!!";
	}
}
