package com.techinstinct.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.time.ZonedDateTime;

@Entity
public class Person extends PanacheEntity {

    public String name;

    public ZonedDateTime birthDate;

}
