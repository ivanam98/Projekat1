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

@RestController
@RequestMapping(value = "/api/users")
public class UseraController {
	
	@Autowired
	private UseraService useraService;
	
	@GetMapping("/")
    public String welcome(){
        return "Home.html";
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
	
	@GetMapping("/Login")
    public String log(Model model) {
		User user = new User();
		model.addAttribute("Usera", user);
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
	
	@GetMapping(value = "/{id}")
    public ResponseEntity<UseraDTO> getUser(@PathVariable("id") Long id) {
		System.out.println("usao sam");
        User user = this.useraService.findOne(id);

        UseraDTO useraDTO = new UseraDTO();
        useraDTO.setId(user.getId());
        useraDTO.setUsername(user.getUsername());
        useraDTO.setEmailAddress(user.getEmailAddress());
        useraDTO.setRole(user.getRole());

    
        return new ResponseEntity<>(useraDTO, HttpStatus.OK);
    }
	
	@PostMapping()
    public ResponseEntity<UseraDTO> createUser(@RequestBody UseraDTO useraDTO) throws Exception {
        User user = new User(useraDTO.getUsername(), useraDTO.getEmailAddress(), useraDTO.getRole());
        User newUser = useraService.create(user);
        UseraDTO newUseraDTO = new UseraDTO(newUser.getId(), newUser.getEmailAddress(),
                newUser.getUsername(), newUser.getRole());
        
        return new ResponseEntity<>(newUseraDTO, HttpStatus.CREATED);
    }
	@DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        this.useraService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
