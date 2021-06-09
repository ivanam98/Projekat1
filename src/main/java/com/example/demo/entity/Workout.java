package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;
<<<<<<< HEAD:src/main/java/com/projekat/Projekat1/entity/Workout.java
=======

>>>>>>> 6ecd0c16736c6d7f93c07c179f49fc6e1e248954:src/main/java/com/example/demo/entity/Workout.java

import javax.persistence.*;

@Entity
public class Workout implements Serializable {
	
	@Id
	private long id;
	
	private String name;
	
	private String description;
	
	private String typeOfWorkout;
	
	private long workoutDuration;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Coach coach;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Member member;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ScheduleWorkout> scheduleWorkout;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTypeOfWorkout() {
		return typeOfWorkout;
	}

	public void setTypeOfWorkout(String typeOfWorkout) {
		this.typeOfWorkout = typeOfWorkout;
	}

	public long getWorkoutDuration() {
		return workoutDuration;
	}

	public void setWorkoutDuration(long workoutDuration) {
		this.workoutDuration = workoutDuration;
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}
	 
}
