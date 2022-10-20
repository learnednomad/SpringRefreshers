package com.learnednomad.sms;

import com.learnednomad.sms.entity.Student;
import com.learnednomad.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public void run(String... args) throws Exception {
//        Student studentOne = new Student("Nabil","Ibrahim","saninabil@yahoo.co.uk");
//        studentRepository.save(studentOne);
//
//        Student studentTwo = new Student("Umar","Sani","saniumar@yahoo.co.uk");
//        studentRepository.save(studentTwo);
//
//        Student studentThree = new Student("Tony","Stark","starkenterprise@gmail.com");
//        studentRepository.save(studentThree);
//
//


    }
}
