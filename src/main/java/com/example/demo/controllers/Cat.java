package com.example.demo.controllers;

public class Cat {

    public Cat() {
    }

    public Cat(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    private Long id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
