package com.projekat.Projekat1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.projekat.Projekat1.entity.Usera;
import com.projekat.Projekat1.service.UseraService;

import java.util.List;

@Controller
public class UseraController {
	
	@Autowired
	private UseraService useraService;
	
	@GetMapping("/")
    public String welcome(){
        return "Home.html";
    }
	@GetMapping("/Login")
    public String log(Model model) {
		Usera usera = new Usera();
		model.addAttribute("Usera", usera);
		return "Login";
	}
	
	@GetMapping("/member/{user}")
    public String memberProfile(@PathVariable(name = "user") String user, Model model){
        model.addAttribute("loged in",this.useraService.findByUsername(user));
        return "member";
    }
	@GetMapping("/admin/coach")
    public String findCoach(Model model){
        List<Usera> coachs = this.useraService.findCoach("coach");
        model.addAttribute("users", coachs);

        return "users";
    }

}
