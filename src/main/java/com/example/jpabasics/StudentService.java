package com.example.jpabasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class StudentService {


    @Autowired
    StudentRepository studentRepository;

    public String add(Student student){
        studentRepository.save(student);
        return "student added successfully";
    }


    public String deleteAll() {
        studentRepository.deleteAll();
        return "All student deleted successfully";
    }

    public Student getStudent(int id) {
        return studentRepository.findById(id).get();
    }

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public String deleteStudentById(int id) {
        studentRepository.deleteById(id);
        return "deleted Student with Id "+id;
    }

    public String updateStudent(int id, String name) {
        Student student = studentRepository.findById(id).get();
        student.setName(name);

        studentRepository.save(student);
        return "Update Successfully";
    }
}
