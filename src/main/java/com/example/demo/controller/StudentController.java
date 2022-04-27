package com.example.demo.controller;

import com.example.demo.service.StudentService;
import com.example.demo.dto.StudentRequestDTO;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        System.out.println("here");
        return studentService.getStudents();
    }

    @PostMapping
    public void create(@RequestBody @Valid StudentRequestDTO studentCreateDTO) {
         studentService.addNewStudent(studentCreateDTO);
    }

}
