package com.projekat.Projekat1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

import com.projekat.Projekat1.entity.User;
import com.projekat.Projekat1.entity.dto.UseraDTO;
import com.projekat.Projekat1.service.UseraService;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
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
		User usera = new User();
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
        List<User> coachs = this.useraService.findCoach("coach");
        model.addAttribute("users", coachs);

        return "users";
    }
	
	@GetMapping()
    public ResponseEntity<List<UseraDTO>> getUsers() {
		List<User> useraList = this.useraService.findAll();
        List<UseraDTO> useraDTOS = new ArrayList<>();

        for (User usera : useraList) {
            UseraDTO useraDTO = new UseraDTO(usera.getId(), usera.getUsername(),
                    usera.getEmailAddress(), usera.getRole());
            useraDTOS.add(useraDTO);
        }
        return new ResponseEntity<>(useraDTOS, HttpStatus.OK);
    }
	
	@GetMapping("/Users/{id}")
	public String getUsera(@PathVariable(name = "id") Long id, Model model) {
		User usera = this.useraService.findOne(id);
		model.addAttribute("usera", usera);
		return "Users.html";
		
	}

}
