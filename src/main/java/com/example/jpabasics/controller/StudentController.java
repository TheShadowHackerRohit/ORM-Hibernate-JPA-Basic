package com.example.jpabasics.controller;

import com.example.jpabasics.Department;
import com.example.jpabasics.service.StudentService;
import com.example.jpabasics.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student, @RequestParam Department department){
        return studentService.add(student,department);
    }

    @GetMapping("/get-student-by-id/{id}")
    public Student getStudent(@PathVariable int id){
        return studentService.getStudent(id);
    }


    //not found bta rha hai
    @GetMapping("/get-all-student")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @PutMapping("update-students-name-by-id/{id}")
    public String updateStudent(@PathVariable int id,@RequestParam String name){
        return studentService.updateStudent(id,name);
    }

    @DeleteMapping("/delete-student-by-id/{id}")
    public String deleteById(@PathVariable int id){
        return studentService.deleteStudentById(id);
    }

    @DeleteMapping("/delete-all-student")
    public String deleteAll(){
        return studentService.deleteAll();
    }

    @GetMapping("/get-student-by-age")
    public List<String> getAllByAge(@RequestParam int age){
        return studentService.getAllByAge(age);
    }


    @GetMapping("/get-student-by-age_and_marks")
    public List<String> getByAgeMarks(@RequestParam int age,@RequestParam int marks){
        return studentService.getByAgeMarks(age,marks);
    }

    @GetMapping("/get-age_greater")
    public List<String> getAllByAgeGreater(@RequestParam int age){
        return studentService.getAllByAgeGreater(age);
    }
}
