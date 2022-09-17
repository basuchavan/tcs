package com.apple.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apple.demo.service.std;

@RestController

public class Student {

@Autowired
std e;

@RequestMapping("/sedam")
public String sedam()
{
	return e.sedam();
	
}
}
