/**
 * 
 */
package com.sudheer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sudheer.bindings.User;

/**
 * @author Sudheer
 *
 */
@Controller
public class StudentController {

	@GetMapping("/student")
	public String getStudent(Model model) {
		model.addAttribute("student", new User());

		return "index";
	}

	@PostMapping("/saveStudent")
	public String Register(User user, Model model) {
		System.out.println(user);
		String name = user.getName();

		String msgTxt = name + "Your Registration Successfully Completed";
		model.addAttribute("msg", msgTxt);
		return "success";
	}
}
