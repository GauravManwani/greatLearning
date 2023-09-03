package client;

import org.springframework.context.ApplicationContext;

import context.ContextProvider;
import dao.StudentDao;
import entity.Student;

public class Insert {
	public static void main(String[] args) {
		ApplicationContext ctx=ContextProvider.provideContext();
		
		StudentDao studentDao=ctx.getBean("stDao",StudentDao.class);
		
		Student s=new Student(2,"Shivam");
		studentDao.insert(s);
		
		
	}
}
