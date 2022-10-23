package com.example.builder.service;

import com.example.builder.entity.Subject;

public interface SubjectBuilder {
    void buildOutline();
    void buildDocument();
    void buildLessons();
    void buildPractices();
    void buildIngredientPoint();
    void buildExamForm();
    Subject getSubject();
}
