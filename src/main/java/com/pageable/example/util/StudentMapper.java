package com.pageable.example.util;

import com.pageable.example.domain.entity.StudentEntity;
import com.pageable.example.domain.request.StudentRequest;
import com.pageable.example.domain.response.StudentResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentMapper {

    StudentResponse requestToResponse(StudentRequest studentRequest);
    StudentEntity requestToEntity(StudentRequest request);
    StudentResponse entityToResponse(StudentEntity entity);
    List<StudentResponse> entityToResponseList(List<StudentEntity> entities);

}
