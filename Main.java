package co.sinheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student parent = context.getBean("parent",Student.class);
		System.out.println(parent);
		
		Student sub = context.getBean("sub",Student.class);
		System.out.println(sub);
		
		Student sub1 = context.getBean("sub1",Student.class);
		System.out.println(sub1);//using Spring bean Inheritance
		
	}

}
