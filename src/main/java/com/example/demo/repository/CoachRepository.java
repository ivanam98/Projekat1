package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Coach;

@Repository
public interface CoachRepository extends JpaRepository<Coach, Long> {
	
	Coach findByUsername(String username);
}
