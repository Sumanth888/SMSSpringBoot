package com.spring.smsspringboot;

import com.spring.smsspringboot.entity.Student;
import com.spring.smsspringboot.repository.StudentRepository;
import com.spring.smsspringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsSpringBootApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SmsSpringBootApplication.class, args);
    }
    @Autowired
    private StudentRepository studentrepository;


    @Override
    public void run(String... args) throws Exception {
        /*Student student1 = new Student(1L,"Sumanth","prasad","spav88@gmail.com");
        studentrepository.save(student1);
        Student student2 = new Student(2L,"Sumanth","prasad","spav88@gmail.com");
        studentrepository.save(student2);
         */
    }
}
