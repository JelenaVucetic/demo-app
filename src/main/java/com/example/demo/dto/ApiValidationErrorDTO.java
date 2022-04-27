package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiValidationErrorDTO {
    private String object;
    private String field;
    private Object rejectedValue;
    private String message;

    public ApiValidationErrorDTO(String object, String message) {
        this.object = object;
        this.message = message;
    }
}
