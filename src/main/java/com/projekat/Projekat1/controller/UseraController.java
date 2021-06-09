package com.projekat.Projekat1.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projekat.Projekat1.entity.dto.RegisterUserDTO;
import com.projekat.Projekat1.entity.dto.UseraDTO;
import com.projekat.Projekat1.service.UseraService;
import com.projekat.Projekat1.entity.User;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/users")
public class UseraController {
	
	@Autowired
	private UseraService useraService;

    @GetMapping("/welcome")
    public String welcome(){
        return "Home.html";
    }

	@GetMapping()
    public ResponseEntity<List<RegisterUserDTO>> getUsers() {
		List<User> useraList = this.useraService.findAll();
        List<RegisterUserDTO> registerUserDTOS = new ArrayList<>();

        for (User usera : useraList) {
            RegisterUserDTO registerUserDTO = new RegisterUserDTO();
            registerUserDTOS.add(registerUserDTO);
        }
        return new ResponseEntity<>(registerUserDTOS, HttpStatus.OK);
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
    public ResponseEntity<RegisterUserDTO> getUser(@PathVariable("id") Long id) {
		System.out.println("usao sam");
        User user = this.useraService.findOne(id);

        RegisterUserDTO registerUserDTO = new RegisterUserDTO();
//        registerUserDTO.setId(user.getId());
        registerUserDTO.setUsername(user.getUsername());
        registerUserDTO.setEmailAddress(user.getEmailAddress());
        registerUserDTO.setRole(user.getRole());

    
        return new ResponseEntity<>(registerUserDTO, HttpStatus.OK);
    }
	
	@DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        this.useraService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
	@GetMapping(value = "/api/existuser")
	public boolean userExist(String username) {
		return this.useraService.isUserExist(username);
	}


}