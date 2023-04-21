package com.edutepuy.college.service.impl;

import com.edutepuy.college.entity.TestEntity;
import com.edutepuy.college.repository.TestRepository;
import com.edutepuy.college.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepository;

    @Override
    public List<TestEntity> getTests() {
        return testRepository.findAll();
    }
}
