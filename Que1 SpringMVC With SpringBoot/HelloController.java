/*
Write an application using SpringMVC with SpringBoot.

You need to read data dynamically from Customer (customerid,customername,customerphone,customeraddress,customerloginid,customerpassword)

 and then display on webpage.
*/


package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HelloController {
	
		 @RequestMapping("/get")
	 public String addCustomer(@RequestParam("customerId") int customerId,@RequestParam("customerName") String customerName
			 															,@RequestParam("customerPhone") String customerPhone
			 															,@RequestParam("customerAddress") String customerAddress
			 															,@RequestParam("customerLoginId") String customerLoginId
			 															,@RequestParam("customerPassword") String customerPassword,Model m)
	 {
		
		 	m.addAttribute("customerId",customerId);
		 	m.addAttribute("customerName",customerName);
		 	m.addAttribute("customerPhone", customerPhone);
		 	m.addAttribute("customerAddress", customerAddress);
		 	m.addAttribute("customerLoginId", customerLoginId);
		 	m.addAttribute("customerPassword", customerPassword);
	
	 return "viewPage";
	 
		 
	 }
	
	 
	 @RequestMapping("/xx")
	 public String xx()
	 {
	 	return "index";
	 }

	}


