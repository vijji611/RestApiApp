package com.finastra.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class DisplayController {

	@RequestMapping(value = "/test",method = RequestMethod.GET)
    public String getinitialchangerequest(){
		System.out.println("Welcome..");
		return "welcome..";
	}
}
