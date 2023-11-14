package com.pageable.example.domain.response;

import com.pageable.example.domain.entity.StudentEntity;
import lombok.Data;

@Data
public class StudentResponse {

    private Long registration;
    private String name;
    private String lastName;

    public static StudentResponse fromEntity(StudentEntity entity) {
        StudentResponse response = new StudentResponse();
        response.setRegistration(entity.getRegistration());
        response.setName(entity.getName());
        response.setLastName(entity.getLastName());
        return response;
    }

}
