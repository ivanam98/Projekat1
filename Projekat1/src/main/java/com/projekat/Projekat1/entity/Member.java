package com.projekat.Projekat1.entity;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("member")
public class Member extends Usera {
	
}

