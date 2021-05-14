package com.projekat.Projekat1.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Hall implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private long capacity;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private FitnessCentar fitnessCentar;
}
