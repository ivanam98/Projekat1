package com.example.demo.entity;

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCapacity() {
		return capacity;
	}

	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}

	public FitnessCentar getFitnessCentar() {
		return fitnessCentar;
	}

	public void setFitnessCentar(FitnessCentar fitnessCentar) {
		this.fitnessCentar = fitnessCentar;
	}
	
	
}
