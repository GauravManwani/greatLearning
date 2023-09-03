package dao;

import entity.Student;

import java.util.List;

//Data Access Object
public interface StudentDao {

    public int insert(Student s);
    public void delete(Student s);
    public void delete(int id);
    public void update(Student s);
    public Student getStudent(int id);
    public List<Student> getAllStudents();


}
