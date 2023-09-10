package com.greatlearning.annotions.config.demo.dao;

import com.greatlearning.annotions.config.demo.mapper.PersonMapper;
import com.greatlearning.annotions.config.demo.mapper.StudentMapper;
import com.greatlearning.annotions.config.demo.models.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class StudentDaoImpl implements StudentDao{

    JdbcTemplate jdbcTemplate;

    public StudentDaoImpl(DataSource dataSource) {
        jdbcTemplate=new JdbcTemplate(dataSource);
    }

    public Student getStudentById(Long id) {
        return jdbcTemplate.queryForObject("Select * from student where id = ?",new Object[]{id}, new StudentMapper());
    }
}
