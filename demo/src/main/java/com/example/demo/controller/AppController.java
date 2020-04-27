package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AppService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(path = "/main")
@RestController
public class AppController {
	
	@Autowired
	private AppService appService;
	
	@GetMapping(path = "/callApi")
	public String callApi() {	
		log.info("########## - INFO");
		log.debug("########### - DEBUG");
		return appService.callApi(); 
	}
}