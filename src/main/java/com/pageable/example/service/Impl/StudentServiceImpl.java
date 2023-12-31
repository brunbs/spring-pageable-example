package com.pageable.example.service.Impl;

import com.pageable.example.domain.entity.StudentEntity;
import com.pageable.example.domain.request.StudentRequest;
import com.pageable.example.domain.response.StudentResponse;
import com.pageable.example.repository.StudentRepository;
import com.pageable.example.service.StudentService;
import com.pageable.example.util.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentResponse createStudent(StudentRequest studentRequest) {

        StudentEntity studentToSave = studentMapper.requestToEntity(studentRequest);

        StudentEntity savedStudent = studentRepository.save(studentToSave);

        return studentMapper.entityToResponse(savedStudent);
    }

    @Override
    public List<StudentResponse> getStudents() {
        List<StudentEntity> students = studentRepository.findAll();
        return studentMapper.entityToResponseList(students);
    }

    @Override
    public Page<StudentResponse> getFilteredStudent(Integer page, Integer size, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, size, Sort.Direction.valueOf(direction), orderBy);
        Page<StudentEntity> foundStudents = studentRepository.findAll(pageRequest);
        return foundStudents.map(StudentResponse::fromEntity);
    }
}
