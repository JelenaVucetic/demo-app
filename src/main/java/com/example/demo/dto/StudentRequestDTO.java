package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentRequestDTO {

    @NotNull(message = "student name must not be null")
    @NotBlank
    private String name;

    @NotNull(message = "student email must not be null")
    @Email(message = "email address not valid")
    @Size(min=5,max=50, message = "email length must be between 5 and 50 characters")
    private String email;

    @NotNull(message = "student date of birth must not be null")
    private LocalDate dob;
}
