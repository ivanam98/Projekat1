package com.projekat.Projekat1.entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue("admin")
public class Admin extends Usera{

}
