package com.projekat.Projekat1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projekat.Projekat1.entity.dto.RegisterUserDTO;
import com.projekat.Projekat1.entity.dto.RegisterResponseDTO;
import com.projekat.Projekat1.entity.User;
import com.projekat.Projekat1.repository.UseraRepository;



import java.util.List;
@Service
public class UseraService {

	@Autowired
	private UseraRepository useraRepository;
	
	public List<User> findUsers(String s1) {
        return this.useraRepository.findByRole(s1);
    }

	public void delete(Long id) {
        this.useraRepository.deleteById(id);
    }
	
	public List<User> findCoach(String s1) {
        return this.useraRepository.findByRole(s1);
    }
	
	public void save(User usera) {
        this.useraRepository.save(usera);
    }

    public User findByUsername(String s1){
        return this.useraRepository.findByUsername(s1);
    }

    
	public User findOne(Long id) {
        return this.useraRepository.getOne(id);
    }

    public List<User> findAll(){
    	List<User> users = this.useraRepository.findAll();
    	return users;
    }

    public RegisterResponseDTO registerUser(RegisterUserDTO registerUserDTO) throws Exception {
	    if(isUserExist(registerUserDTO.getUsername())) {
            throw new Exception("User already exist!");
        }

        User user = new User();
        user.setUsername(registerUserDTO.getUsername());
        user.setDateOfBirth(registerUserDTO.getDateOfBirth());
        user.setEmailAddress(registerUserDTO.getEmailAddress());
        user.setFirstName(registerUserDTO.getFirstName());
        user.setLastName(registerUserDTO.getLastName());
        user.setPassword(registerUserDTO.getPassword());
        user.setPhoneNumber(registerUserDTO.getContact());
        user.setRole(registerUserDTO.getRole());
        useraRepository.save(user);
        return new RegisterResponseDTO();
	}

    public boolean isUserExist(String username) {
	    User user = useraRepository.findByUsername(username);
	    if(user != null) {
            return true;
        }
	    return false;
    }
}
