package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Member extends User {

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DoneWorkout> doneWorkout;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Workout> checkInWorkout;
}

