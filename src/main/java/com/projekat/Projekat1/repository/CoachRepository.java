package com.projekat.Projekat1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projekat.Projekat1.entity.Coach;

@Repository
public interface CoachRepository {
	
	Coach findByUsername(String username);
}
