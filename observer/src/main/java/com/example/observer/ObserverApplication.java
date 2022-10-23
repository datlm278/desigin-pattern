package com.example.observer;

import com.example.observer.services.impl.LogStudent;
import com.example.observer.services.impl.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ObserverApplication.class, args);

        Student student1 = new Student ("Le Minh Dat", 10.0);
        StudentService service1 = createStudent(student1);
        service1.display();
        service1.changePoint(9.0);

        Student student2 = new Student ("Le Tien Anh", 9.0);
        StudentService service2 = createStudent(student2);
        service2.display();
    }


    private static StudentService createStudent (Student student) {
        StudentService studentService = new StudentService(student);
        studentService.attach(new LogStudent());
        return studentService;
    }

}
