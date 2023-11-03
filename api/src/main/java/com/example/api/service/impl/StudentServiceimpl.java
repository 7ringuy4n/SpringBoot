package com.example.api.service.impl;

import com.example.api.Entity.Student;
import com.example.api.Repository.StudentRepository;
import com.example.api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceimpl extends AbstractBaseSevice<Student> implements StudentService {
    @Autowired
    StudentRepository repository;
    @Override
    public JpaRepository setBaseService() {
        return repository;
    }
}
