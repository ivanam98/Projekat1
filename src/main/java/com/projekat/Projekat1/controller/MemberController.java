package com.projekat.Projekat1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.projekat.Projekat1.entity.Member;
import com.projekat.Projekat1.service.MemberService;

@Controller
public class MemberController {

	@Autowired
    private MemberService memberService;
	@GetMapping("/SignIn")
    public String signin(Model model)
    {
        Member member = new Member();
        model.addAttribute("member", member);
        return "signin";
    }
	
	@PostMapping("/save")
    public String saved(@Validated @ModelAttribute Member member, BindingResult error, Model model) throws Exception
    {
        this.memberService.create(member);
        return "Home";
    }
}
