package org.aryan.springdatajpa;

import org.aryan.springdatajpa.Repository.StudentRepo;
import org.aryan.springdatajpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);

        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);

//        s1.setEnrollmentNo(101);
//        s1.setName("Aryan");
//        s1.setMarks(98);
//
        s2.setEnrollmentNo(102);
        s2.setName("Abhishek");
        s2.setMarks(77);
//
        s3.setEnrollmentNo(103);
        s3.setName("Abhyud");
        s3.setMarks(56);
//
//        repo.save(s1);
//        repo.save(s2);
//        repo.save(s3);
//
//        System.out.println("Save Done");
//
//        System.out.println(repo.findAll());
//
//        System.out.println("Find All Done");
//
//        System.out.println(repo.findById(103));
//
//        System.out.println("find By EnrollmentNo Done");
//
//        Optional<Student> s = repo.findById(104);
//        System.out.println(s.orElse(new Student()));
//
//        System.out.println(repo.findByName("Aryan"));
//        System.out.println(repo.findByMarks(98));
//        System.out.println(repo.findByMarksGreaterThan(18));

        repo.save(s2);
        repo.delete(s3);

    }

}
