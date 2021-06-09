package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

import java.util.List;

@Repository
public interface UseraRepository extends JpaRepository<User, Long>{
	
	
	User findByUsernameAndPassword(String username, String password);
	List<User> findByRole(String role);
	User findByUsername(String username);

}

