package com.pageable.example.domain.request;

import lombok.Data;

@Data
public class StudentRequest {

    private Long registration;
    private String name;
    private String lastName;

}
