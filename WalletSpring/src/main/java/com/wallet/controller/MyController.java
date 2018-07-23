package com.wallet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@RequestMapping("/login")
	public String validateLogin(ModelMap map, @RequestParam("username")String username, @RequestParam("password")String password) {
		if(username.equals("shafeeq") && password.equals("shafeeq123")) {
			return "mainPage";
		}
		return "redirect:/";
}
	
	@RequestMapping("/createAccount")
	public String showCreateAccountPage() {

		return "createAccount";
		
	}
	
	@RequestMapping("/showbalance")
	public String showbalancePage() {

		return "showbalance";
		
	}
	
	@RequestMapping("/deposit")
	public String depositPage() {

		return "deposit";
		
	}
	
	@RequestMapping("/withdraw")
	public String withdrawPage() {

		return "withdraw";
		
	}
	
	@RequestMapping("/transfer")
	public String fundTransferPage() {

		return "transfer";
		
	}
	
	@RequestMapping("/logout")
	public String logout() {

		return "redirect:/index";
		
	}
}