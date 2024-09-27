package com.Jari.API_List;

import com.fasterxml.jackson.annotation.JsonTypeId;

import java.util.ArrayList;


public class Snus {

    int id;
    String name;
    int grade;


    ArrayList<Snus> snusList = new ArrayList<Snus>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Snus(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}
