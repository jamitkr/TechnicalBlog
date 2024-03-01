package com.rise.springboot.learnspringbootwebrest.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rise.springboot.learnspringbootwebrest.model.Post;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String getAllPosts(Model model) {
		
		List<Post> posts=Arrays.asList(new Post("Post 1","Post Body1",LocalDate.now()),new Post("Post 2","Post Body2",LocalDate.now()),new Post("Post 3","Post Body3",LocalDate.now()));
		model.addAttribute("posts", posts);
		return "index";
	}

}
