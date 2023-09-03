package dao;

import entity.Student;

import java.util.List;
//import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDaoImpl implements StudentDao{

	private HibernateTemplate hTemp;


	public void sethTemp(HibernateTemplate hTemp) {
		this.hTemp = hTemp;
	}

	@Transactional
	public int insert(Student s) {
        return (int) hTemp.save(s);
    }

	@Transactional
    public void delete(Student s) {
    	hTemp.delete(s);
    }

	@Transactional
    public void delete(int id) {
    	Student s=hTemp.get(Student.class, id);
    	hTemp.delete(s);
    }

	@Transactional
    public void update(Student s) {
    	hTemp.update(s);;
    }

    public Student getStudent(int id) {
        return hTemp.get(Student.class, id);
    }

    public List<Student> getAllStudents() {
        return hTemp.loadAll(Student.class);
    }
}
