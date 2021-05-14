package com.projekat.Projekat1.entity;

import com.projekat.Projekat1.entity.Usera;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Coach extends Usera{

	@OneToMany(mappedBy = "coach", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	    private Set<Workout> workouts = new HashSet<>();
	 
	 @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	    private FitnessCentar fitnessCentar;
	
}