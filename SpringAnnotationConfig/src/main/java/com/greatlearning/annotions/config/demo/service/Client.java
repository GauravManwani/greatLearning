package com.greatlearning.annotions.config.demo.service;

import com.greatlearning.annotions.config.demo.configurations.AppConfig;
import com.greatlearning.annotions.config.demo.configurations.DatabaseConfig;
import com.greatlearning.annotions.config.demo.dao.PersonDAO;
import com.greatlearning.annotions.config.demo.dao.StudentDao;
import com.greatlearning.annotions.config.demo.models.Person;
import com.greatlearning.annotions.config.demo.models.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {


    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(DatabaseConfig.class, AppConfig.class);

        PersonDAO personDAO= context.getBean(PersonDAO.class);
        StudentDao studentDao= context.getBean(StudentDao.class);
//        personDAO.create(new Person(2l, 21, "Karan","G"));

        Person person=personDAO.getPersonById(2l);
        System.out.println("Person Details");
            System.out.println(person.getId());
            System.out.println(person.getFirstName()+" "+ person.getLastName());
            System.out.println(person.getAge());

        Student student=studentDao.getStudentById(1l);

        System.out.println();
        System.out.println("Student Details");
        System.out.println(student.getId());
        System.out.println(student.getName());
    }
}
