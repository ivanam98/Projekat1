package com.projekat.Projekat1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projekat.Projekat1.entity.Workout;

import java.util.List;


public interface WorkoutRepository extends JpaRepository<Workout, Long>{
	
	List<Workout> findAllByName(String name);

}
