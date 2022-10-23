package com.example.builder.service.impl;

import com.example.builder.entity.Subject;
import com.example.builder.service.SubjectBuilder;

import java.util.ArrayList;
import java.util.List;

public class HoChiMinhThoughtBuilder implements SubjectBuilder {

    private final Subject subject = new Subject("Ho Chi Minh Thought");

    @Override
    public void buildOutline() {
        subject.setOutline("De cuong hoc phan tu tuong Ho Chi Minh.docx");
    }

    @Override
    public void buildDocument() {
        subject.setDocument("Tai lieu tham khao hoc phan tu tuong Ho Chi Minh.docx");
    }

    @Override
    public void buildLessons() {
        List<String> lessons = new ArrayList<>();
        lessons.add("Bài 1: Ho Chi Minh Thought 1");
        lessons.add("Bài 2: Ho Chi Minh Thought 2");
        lessons.add("Bài 3: Ho Chi Minh Thought 3");
        subject.setLessons(lessons);
    }

    @Override
    public void buildPractices() {
        List<String> practices = new ArrayList<>();
        practices.add("Bài 1: Practices Ho Chi Minh Thought 1");
        practices.add("Bài 2: Practices Ho Chi Minh Thought 2");
        practices.add("Bài 3: Practices Ho Chi Minh Thought 3");
        subject.setPractices(practices);
    }

    @Override
    public void buildIngredientPoint() {
        subject.setIngredientPoint("(Diem diem danh + Diem tich cuc tren lop + Diem kiem tra) / 3");
    }

    @Override
    public void buildExamForm() {
        subject.setExamForm("Bao cao bai tap lon vao ngay thi do nha truong sap xep");
    }

    @Override
    public Subject getSubject() {
        return subject;
    }
}
