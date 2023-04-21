package com.edutepuy.college.service;

import com.edutepuy.college.entity.TestEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestService {

    List<TestEntity> getTests();
}
