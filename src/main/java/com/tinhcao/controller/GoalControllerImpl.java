package com.tinhcao.controller;

import javax.validation.Valid;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tinhcao.model.Goal;

@Controller
@SessionAttributes("goal")
public class GoalControllerImpl implements GoalController{


	@PostMapping(value = "addGoal")
	public String updateGoal(@Valid @ModelAttribute("goal") Goal goal, BindingResult bindingResult) {
		System.out.println("result has errors: " + bindingResult.hasErrors());
		System.out.println("Goal set: " + goal.getMinutes());

		if (bindingResult.hasErrors()) {
			return "addGoal";
		}
		return "redirect:index.jsp";
	}

	@GetMapping(value = "addGoal")
	@Secured(value = { "ROLE_VIP" })
	@Override
	public String addGoal(Model model) {
		Goal goal = new Goal();
		goal.setMinutes(10);
		model.addAttribute("goal", goal);
		return "addGoal";
	
	}
}
