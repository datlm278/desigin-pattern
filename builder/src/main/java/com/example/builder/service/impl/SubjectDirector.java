package com.example.builder.service.impl;

import com.example.builder.service.SubjectBuilder;

public class SubjectDirector {

    private SubjectBuilder subjectBuilder;

    public SubjectDirector(SubjectBuilder subjectBuilder) {
        this.subjectBuilder = subjectBuilder;
    }

    public void build() {
        subjectBuilder.buildOutline();
        subjectBuilder.buildDocument();
        subjectBuilder.buildLessons();
        subjectBuilder.buildPractices();
        subjectBuilder.buildIngredientPoint();
        subjectBuilder.buildExamForm();
    }
}
