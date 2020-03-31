package com.testproject.jpa.entity;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String brand;
    private String type; //auto/manual

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Person person;

    public Car() {
    }

    public Car(Long id, String brand, String type, Person person) {
        id = id;
        this.brand = brand;
        this.type = type;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
