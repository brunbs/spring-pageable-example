package com.pageable.example.service;

import com.pageable.example.domain.request.StudentRequest;
import com.pageable.example.domain.response.StudentResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface StudentService {

    StudentResponse createStudent(StudentRequest studentRequest);
    List<StudentResponse> getStudents();
    Page<StudentResponse> getFilteredStudent(Integer page, Integer size, String orderBy, String direction);

}
