package com.pageable.example.service;

import com.pageable.example.domain.request.StudentRequest;
import com.pageable.example.domain.response.StudentResponse;

import java.util.List;

public interface StudentService {

    StudentResponse createStudent(StudentRequest studentRequest);
    List<StudentResponse> getStudents();

}
