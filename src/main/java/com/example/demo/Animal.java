package com.example.demo;

public class Animal {
private int id;
private String name;
private String kind;
private int age;

    public Animal(int id, String name, String kind, int age) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    public Animal() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
