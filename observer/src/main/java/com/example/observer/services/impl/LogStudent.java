package com.example.observer.services.impl;

import com.example.observer.Student;
import com.example.observer.services.Observer;

public class LogStudent implements Observer {

    @Override
    public void update(Student student) {
        System.out.println("Logger: " + student);
    }
}
