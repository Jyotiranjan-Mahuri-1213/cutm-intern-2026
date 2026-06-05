package org.example;

public class Student {

    private int id;
    private String name;

    public Student() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}