package com.example.builder.service.impl;

import com.example.builder.entity.Subject;
import com.example.builder.service.SubjectBuilder;

import java.util.ArrayList;
import java.util.List;

public class SoftwareSpecificationBuilder implements SubjectBuilder {

    private final Subject subject = new Subject("Software Specification");

    @Override
    public void buildOutline() {
        subject.setOutline("De Cuong dac ta phan mem.docx");
    }

    @Override
    public void buildDocument() {
        subject.setDocument("Tai lieu mon dac ta phan mem.docx");
    }

    @Override
    public void buildLessons() {
        List<String> lessons = new ArrayList<>();
        lessons.add("Bài 1: Design Pattern 1");
        lessons.add("Bài 2: Design Pattern 2");
        lessons.add("Bài 3: Design Pattern 3");
        subject.setLessons(lessons);
    }

    @Override
    public void buildPractices() {
        List<String> practices = new ArrayList<>();
        practices.add("Bài 1: Practices Design Pattern 1");
        practices.add("Bài 2: Practices Design Pattern 2");
        practices.add("Bài 3: Practices Design Pattern 3");
        subject.setPractices(practices);
    }

    @Override
    public void buildIngredientPoint() {
        subject.setIngredientPoint("(Diem diem danh + Diem tich cuc tren lop + Diem kiem tra) / 3");
    }

    @Override
    public void buildExamForm() {
        subject.setExamForm("Bao cao bai tap lon vao ngay thi do nha truong sap xep!\n");
    }

    @Override
    public Subject getSubject() {
        return subject;
    }
}
