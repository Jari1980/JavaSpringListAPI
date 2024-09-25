package com.Jari.API_List;

import java.util.ArrayList;

public class Snus {

    String name;
    int grade;

    ArrayList<Snus> snusList = new ArrayList<Snus>();

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

    public Snus(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}
