package com.example.observer;

import lombok.Data;

@Data
public class Student {
    private String name;
    private Double point;

    public Student(String name, Double point) {
        this.name = name;
        this.point = point;
    }
}


