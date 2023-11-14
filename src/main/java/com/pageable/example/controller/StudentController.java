package com.pageable.example.controller;

import com.pageable.example.domain.request.StudentRequest;
import com.pageable.example.domain.response.StudentResponse;
import com.pageable.example.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
@Tag(name = "Student Controller", description = "Endpoint for creating and listing pageable students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    @Operation(summary = "create new student")
    ResponseEntity<StudentResponse> createStudent(@RequestBody StudentRequest studentRequest) {
        return ResponseEntity.ok().body(studentService.createStudent(studentRequest));
    }

    @GetMapping("all")
    @Operation(summary = "list all students")
    ResponseEntity<List<StudentResponse>> getAllStudents() {
        return ResponseEntity.ok().body(studentService.getStudents());
    }

    @GetMapping
    @Operation(summary = "list students using filter with pageable")
    ResponseEntity<Page<StudentResponse>> getFilteredStudent(@RequestParam(value = "page", defaultValue = "0") Integer page,
                                             @RequestParam(value = "size", defaultValue = "3") Integer size,
                                             @RequestParam(value = "orderBy", defaultValue = "lastName") String orderBy,
                                             @RequestParam(value = "direction", defaultValue = "ASC") String direction) {
        return ResponseEntity.ok().body(studentService.getFilteredStudent(page, size, orderBy, direction));
    }

}
