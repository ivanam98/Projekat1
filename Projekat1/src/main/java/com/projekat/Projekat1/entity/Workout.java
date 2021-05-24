package com.projekat.Projekat1.entity;



import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
public class Workout implements Serializable {
	
	@Id
	private String name;
	
	@Column
	private String description;
	
	@Column
	private String typeOfWorkout;
	
	@Column
	private long workoutDuration;
	

	 @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	    private Coach coach;
	 

	 
}
