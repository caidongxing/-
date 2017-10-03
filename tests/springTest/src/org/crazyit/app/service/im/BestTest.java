package org.crazyit.app.service.im;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BestTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Person  person =ctx.getBean("chinese",Person.class);
		person.useAxe();
	}

}
