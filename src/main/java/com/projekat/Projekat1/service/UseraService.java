package com.projekat.Projekat1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projekat.Projekat1.entity.Usera;
import com.projekat.Projekat1.repository.UseraRepository;

import java.util.List;

@Service
public class UseraService {

	@Autowired
	private UseraRepository useraRepository;
	
	public void create(Usera usera) throws Exception{
		if(usera.getId() !=null) {
			throw new Exception("Id is not null");
		}
		this.useraRepository.save(usera);
	}
	
	public List<Usera> findUsers(String s1) {

        return this.useraRepository.findByRole(s1);
    }
	public void delete(Long id) {
        this.useraRepository.deleteById(id);
    }
	
	public List<Usera> findCoach(String s1) {
        return this.useraRepository.findByRole(s1);
    }
	
	public void save(Usera usera) {
        this.useraRepository.save(usera);
    }

    public Usera findByUsername(String s1){
        return this.useraRepository.findByUsername(s1);
    }
}
