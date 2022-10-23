package com.example.observer.services.impl;

import com.example.observer.Student;
import com.example.observer.services.Observer;
import com.example.observer.services.Subject;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements Subject {

    private final Student student;
    private final List<Observer> observers = new ArrayList<>();

    public StudentService(Student student) {
        this.student = student;
    }

    @Override
    public void attach(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update(student);
        }
    }

    public void changePoint(Double point) {
        student.setPoint(point);
        System.out.printf("%s's point is changed. Point current is %.2f.\n", student.getName(), student.getPoint());
        this.notifyAllObserver();
    }

    public void display() {
        System.out.printf("Student name %s has point is %.2f.\n", student.getName(), student.getPoint());
        this.notifyAllObserver();
    }
}
