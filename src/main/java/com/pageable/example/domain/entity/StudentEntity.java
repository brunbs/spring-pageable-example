package com.pageable.example.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "students")
@Data
public class StudentEntity {

    @Id
    @Column(name = "registration")
    private Long registration;

    private String name;
    private String lastName;


}
