package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Employee;
import com.service.EmpService;

@Controller
public class UserController {

	@Autowired
	EmpService empService;

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView();
		Employee emp = new Employee();
		model.addObject("emp", emp);
		model.setViewName("index");
		return model;
	}

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView model = new ModelAndView();
		model.addObject("data", empService.allEmp());
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/addEmp", method = RequestMethod.POST)
	public String addEmp(@ModelAttribute("emp") Employee e) {
		empService.addEmp(e);
		return "index";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deletemp(@RequestParam("uid") int uid) {
		empService.deleteEmp(uid);
		return "redirect:view";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView updateemp(@RequestParam("uid") int uid) {
		ModelAndView model = new ModelAndView();
		Employee emp = empService.empbyId(uid);
		model.addObject("emp", emp);
		model.setViewName("index");
		return model;
	}

}