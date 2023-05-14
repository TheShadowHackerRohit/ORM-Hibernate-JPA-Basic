package com.example.jpabasics.repository;

import com.example.jpabasics.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {


    List<Student> findByAge(int age);
    List<Student> findByAgeAndMarks(int age , int marks);

    @Query(value = "select * from student_info as s where s.age > :age",nativeQuery = true)
    List<Student> getAllStudentGreaterThanAge(int age);
}
