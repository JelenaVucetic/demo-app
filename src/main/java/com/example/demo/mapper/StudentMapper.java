package com.example.demo.mapper;

import com.example.demo.model.Student;
import com.example.demo.dto.StudentRequestDTO;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    public Student toEntity(StudentRequestDTO studentCreateDto) {
        return Student.builder()
                .name(studentCreateDto.getName())
                .email(studentCreateDto.getEmail())
                .dob(studentCreateDto.getDob())
                .build();
    }
}
