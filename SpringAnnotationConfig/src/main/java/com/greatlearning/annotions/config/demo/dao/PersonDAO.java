package com.greatlearning.annotions.config.demo.dao;

import com.greatlearning.annotions.config.demo.models.Person;

public interface PersonDAO {

    Person getPersonById(Long id);

    Person create(Person person);
}
