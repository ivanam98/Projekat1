package com.projekat.Projekat1.entity;

import javax.persistence.*;

@Entity
public class DoneWorkout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Workout doneWorkout;

    private double mark;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Member member;
}
