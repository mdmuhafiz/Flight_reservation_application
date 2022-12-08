package com.flightreservationapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flightreservationapp.entity.User;
import com.flightreservationapp.repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepo;
	@RequestMapping("/viewloginpage")
	public String viewloginpage() {
		
		return "login/login";
	}
	@RequestMapping("/viewregistrationpage")
	public String viewRegistrationPage() {
		
		return "login/reg_info";
	}
	@RequestMapping("/saveRegistration")
	public String saveRegistration(User user) {
		userRepo.save(user);
		return "login/login";
	}
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("email") String email,@RequestParam("password") String password,ModelMap model) {
		User user = userRepo.findByEmail(email);
		if(user != null) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return "findFlight";
			}else {
				model.addAttribute("error", "Invalid Credential");
				return "login/login";
			}
		}
			
		model.addAttribute("error", "Invalid Credential");
		return "login/login";
	}

}
