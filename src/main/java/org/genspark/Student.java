package org.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;

    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPH() {
        return ph;
    }
    public void setPH(List<Phone> ph) {
        this.ph = ph;
    }
    public Address getAddress() {
        return add;
    }
    public void setAddress(Address add) {
        this.add = add;
    }
    public void showStudent(){
        System.out.println("Student ID: "+id);
        System.out.println("Student Name: "+name);
        System.out.println("Student Number(s):");
        for (Phone p : ph)
        {
            System.out.println(p.getNumber());
        }
        System.out.println("Student Address: "+ add.toString());
    }




}
