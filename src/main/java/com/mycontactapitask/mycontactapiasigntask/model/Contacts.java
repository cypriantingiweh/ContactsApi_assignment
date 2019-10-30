package com.mycontactapitask.mycontactapiasigntask.model;

import javax.persistence.*;

@Entity
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private  int id;

    @Column(name = "name")
    private String name;

    @Column(name = "PhoneNumber")
    private  String phonnumber;

    protected Contacts() {
    }

    public Contacts(int id, String name, String phonnumber) {
        this.name = name;
        this.phonnumber = phonnumber;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Contacts setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Contacts setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhonnumber() {
        return phonnumber;
    }

    public Contacts setPhonnumber(String phonnumber) {
        this.phonnumber = phonnumber;
        return this;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phonnumber='" + phonnumber + '\'' +
                '}';
    }
}
