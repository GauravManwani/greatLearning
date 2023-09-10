package com.greatlearning.annotions.config.demo.mapper;

import com.greatlearning.annotions.config.demo.constants.EntityConstants;
import com.greatlearning.annotions.config.demo.models.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentMapper implements RowMapper<Student> {
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student=new Student();
        student.setId(rs.getLong(EntityConstants.StudentEntity.id));
        student.setName(rs.getString(EntityConstants.StudentEntity.name));
        return student;
    }
}
