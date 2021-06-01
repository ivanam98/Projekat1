package com.projekat.Projekat1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projekat.Projekat1.entity.User;
import com.projekat.Projekat1.repository.UseraRepository;


import java.util.List;
@Service
public class UseraService {

	@Autowired
	private UseraRepository useraRepository;
	
	public void create(User usera) throws Exception{
		if(usera.getId() !=null) {
			throw new Exception("Id is not null");
		}
		this.useraRepository.save(usera);
	}
	
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
}
