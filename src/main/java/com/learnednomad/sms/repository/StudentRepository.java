package com.learnednomad.sms.repository;

import com.learnednomad.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Long> {


}
