package com.projekat.Projekat1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projekat.Projekat1.entity.Usera;

import java.util.List;


@Repository
public interface UseraRepository extends JpaRepository<Usera, Long>{
	
	Usera findByUsernameAndPassword(String username, String password);
	List<Usera> findByRole(String Role);
	Usera findByUsername(String username);
	

}

