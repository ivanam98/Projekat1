package com.projekat.Projekat1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projekat.Projekat1.entity.User;

import java.util.List;


@Repository
public interface UseraRepository extends JpaRepository<User, Long>{
	
	
	User findByUsernameAndPassword(String username, String password);
	List<User> findByRole(String role);
	User findByUsername(String username);
	

}

