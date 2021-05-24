package com.projekat.Projekat1.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class FitnessCentar implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String name;
	
	@Column
	private String address;
	
	@Column
	private String numberOfCentar;
	
	@Column
	private String eMailOfCentar;
	
	@OneToMany(mappedBy = "fitnessCentar", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Coach> coachs = new HashSet<>();
	
	@OneToMany(mappedBy = "fitnessCentar", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Hall> halls = new HashSet<>();
	
	@Column
	private String rasporedOdrzavanja;
	
}
