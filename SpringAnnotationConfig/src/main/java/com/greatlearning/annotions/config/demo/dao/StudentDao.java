package com.greatlearning.annotions.config.demo.dao;

import com.greatlearning.annotions.config.demo.models.Person;
import com.greatlearning.annotions.config.demo.models.Student;

public interface StudentDao {

    Student getStudentById(Long id);
}
