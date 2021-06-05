package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class ScheduleWorkout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Workout workout;

    private LocalDate date;

    private double price;
}
