package com.example.demo.service;

import com.example.demo.repository.StudentRepository;
import com.example.demo.dto.StudentRequestDTO;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.Student;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    private final StudentMapper studentMapper;
    @Autowired

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(StudentRequestDTO studentRequestDTO) {
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(studentRequestDTO.getEmail());

        if(studentOptional.isPresent()) {
            throw new IllegalStateException("email taken");
        }

        Student student = studentMapper.toEntity(studentRequestDTO);
        studentRepository.save(student);
    }
}
