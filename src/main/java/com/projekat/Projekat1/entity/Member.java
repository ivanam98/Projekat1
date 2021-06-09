package com.projekat.Projekat1.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Member extends User {
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DoneWorkout> doneWorkout;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Workout> checkInWorkout;
}

