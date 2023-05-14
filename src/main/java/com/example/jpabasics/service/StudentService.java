package com.example.jpabasics.service;

import com.example.jpabasics.Department;
import com.example.jpabasics.repository.LibraryCardRepository;
import com.example.jpabasics.repository.StudentRepository;
import com.example.jpabasics.models.LibraryCard;
import com.example.jpabasics.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {


    @Autowired
    StudentRepository studentRepository;

    @Autowired
    LibraryCardRepository libraryCardRepository;

    public String add(Student student, Department department){

        LibraryCard libraryCard = new LibraryCard();
        libraryCard.setDepartment(department);
        libraryCard.setStudent(student);

        student.setLibraryCard(libraryCard);

        studentRepository.save(student);
        //libraryCardRepository.save(libraryCard);

        return "Student added successfully";
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

    public List<String> getAllByAge(int age) {
//        List<Student> students = studentRepository.findAll();
        List<Student> students = studentRepository.findByAge(age);

        List<String> names = new ArrayList<>();

        for(Student student : students){
            names.add(student.getName());
        }
        return names;

    }

    public List<String> getByAgeMarks(int age,int marks) {
        List<Student> students = studentRepository.findByAgeAndMarks(age,marks);

        List<String> names = new ArrayList<>();

        for(Student student : students){
            names.add(student.getName());
        }
        return names;

    }

    public List<String> getAllByAgeGreater(int age) {
        List<Student> students = studentRepository.getAllStudentGreaterThanAge(age);

        List<String> names = new ArrayList<>();

        for(Student student : students){
            names.add(student.getName());
        }
        return names;
    }
}
