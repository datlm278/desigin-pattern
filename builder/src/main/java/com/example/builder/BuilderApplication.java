package com.example.builder;

import com.example.builder.entity.Subject;
import com.example.builder.service.SubjectBuilder;
import com.example.builder.service.impl.HoChiMinhThoughtBuilder;
import com.example.builder.service.impl.SoftwareSpecificationBuilder;
import com.example.builder.service.impl.SubjectDirector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuilderApplication.class, args);

        SubjectBuilder subjectBuilder = new SoftwareSpecificationBuilder();
        SubjectDirector director = new SubjectDirector(subjectBuilder);
        director.build();
        Subject subject = subjectBuilder.getSubject();
        System.out.println(subject);

        subjectBuilder = new HoChiMinhThoughtBuilder();
        director = new SubjectDirector(subjectBuilder);
        director.build();
        subject = subjectBuilder.getSubject();
        System.out.println(subject);
    }

}
