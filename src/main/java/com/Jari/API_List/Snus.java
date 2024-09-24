package com.Jari.API_List;

import java.util.ArrayList;

public class Snus {

    String name;
    int grade;

    ArrayList<Snus> snusList = new ArrayList<Snus>();

    public Snus(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void AddSnus(String name, int grade){
        Snus nySnus = new Snus(name, grade);
        snusList.add(nySnus);
    }

    public ArrayList<Snus> getSnus(){
        return snusList;
    }

}
