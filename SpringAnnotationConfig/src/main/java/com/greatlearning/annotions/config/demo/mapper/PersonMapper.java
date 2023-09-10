package com.greatlearning.annotions.config.demo.mapper;

import com.greatlearning.annotions.config.demo.constants.EntityConstants;
import com.greatlearning.annotions.config.demo.models.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class PersonMapper implements RowMapper<Person> {

    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person=new Person();
        person.setId(rs.getLong(EntityConstants.PersonEntity.id));
        person.setFirstName(rs.getString(EntityConstants.PersonEntity.firstName));
        person.setLastName(rs.getString(EntityConstants.PersonEntity.lastName));
        person.setAge(rs.getInt(EntityConstants.PersonEntity.age));
        return person;
    }
}
