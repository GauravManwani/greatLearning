package client;

import org.springframework.context.ApplicationContext;

import context.ContextProvider;
import dao.StudentDao;
import entity.Student;

public class Update {

	public static void main(String[] args) {
		ApplicationContext ctx=ContextProvider.provideContext();
		StudentDao studentDao=ctx.getBean("stDao",StudentDao.class);
		StudentDao studentDao2=ctx.getBean("stDao",StudentDao.class);
		System.out.println("OLD: "+studentDao);
		System.out.println("New: "+studentDao2);
		
//		Student s= studentDao.getStudent(1);
//		System.out.println(s.getName());
//		s.setName("karan");
//		
//		studentDao.update(s);
//		
//		System.out.println(studentDao.getStudent(1).getName());
		
		
	}
}
