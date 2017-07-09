package com.mss.swagger2.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mss.swagger2.Message;

@RestController
@RequestMapping("/messenger")
public class MessengerController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/{name}")
	public Message sayHello(Map map, @PathVariable String name) {
		return new Message(name);
	}

}
