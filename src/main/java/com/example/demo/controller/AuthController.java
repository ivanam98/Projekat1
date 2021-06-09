package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.entity.dto.request.RegisterUserDTO;
import com.example.demo.entity.dto.response.RegisterResponseDTO;
import com.example.demo.service.UseraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/auth")
public class AuthController {

    @Autowired
    private UseraService useraService;

    @GetMapping("/login")
    public String log(Model model) {
        User user = new User();
        model.addAttribute("Usera", user);
        return "Login";
    }

    @PostMapping("/register")
    public ResponseEntity<RegisterResponseDTO> registerUser(@RequestBody RegisterUserDTO registerUserDTO) throws Exception {
        return new ResponseEntity<>(useraService.registerUser(registerUserDTO), HttpStatus.CREATED);
    }
}
