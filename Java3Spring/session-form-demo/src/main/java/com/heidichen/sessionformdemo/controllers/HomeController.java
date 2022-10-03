package com.heidichen.sessionformdemo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	// ---------sessions ----------
	@GetMapping("/sessions/home")
	public String sessionHome(HttpSession session) {		
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}else {
			// get count from session
			Integer tempCount = (Integer) session.getAttribute("count");
			session.setAttribute("count", tempCount+1);
			
		}
		
		return "/sessions/home.jsp";
	}
	
	@GetMapping("/sessions/getcount")
	public String getCount() {
		return "/sessions/getCount.jsp";
	}
	
	// ---------Search form ----------
	// show the form
	@GetMapping("/search")
	public String showSearchForm() {
		return "/searchForm/searchForm.jsp";
	}
	
	
	// process + display the form // localhost:8080/searchResult?keyword=whatever
	@GetMapping("/searchResult")
	public String displaySearchResult(
			@RequestParam("keyword") String keyword,
			Model model) {
		model.addAttribute("keyword", keyword);
		return "/searchForm/searchResult.jsp";
	}
	
	// ---------Review form ----------
	// 1. show the form
	@GetMapping("/review")
	public String showReviewForm() {
		return "/reviewForm/reviewForm.jsp";
	}
	
	
	// 2. process the form -- 
	// 2.1 get the info from form (requestParam) 
	// 2.2 save the result in session
	@PostMapping("/process/review")
	public String processReviewForm(
			@RequestParam("product") String product,
			@RequestParam("rating") Integer rating,
			@RequestParam("comments") String comments,
			HttpSession session
			) {
		session.setAttribute("product", product);
		session.setAttribute("rating", rating);
		session.setAttribute("comments", comments);
		return "redirect:/review/result";
	}
	
	// 3. display the result
	@GetMapping("/review/result")
	public String displayReviewResult() {
		return "/reviewForm/reviewResult.jsp";
	}
	
	
	
	
}









