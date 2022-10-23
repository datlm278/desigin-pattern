package com.example.builder.entity;

import lombok.Data;

import java.util.List;

@Data
public class Subject {
    private String name;
    private String outline;
    private String document;
    private List<String> lessons;
    private List<String> practices;
    private String ingredientPoint;
    private String examForm;

    public Subject(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "-------------" + name + "------------------" +
                "\n De cuong: " + outline +
                "\n Tai lieu: " + document +
                "\n Cac bai giang: " + lessons +
                "\n Cac bai thuc hanh: " + practices +
                "\n Cach cham diem thanh phan: " + ingredientPoint +
                "\n Hinh thuc thi: " + examForm;
    }
}
