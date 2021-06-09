package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Workout;

import java.util.List;
public interface WorkoutRepository extends JpaRepository<Workout, Long>{

	List<Workout> findAllByName(String name);
}
