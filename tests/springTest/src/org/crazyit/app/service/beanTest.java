package org.crazyit.app.service;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.crazyit.app.service.*;
public class beanTest {

	public static void main(String[] args) throws Exception{
		ApplicationContext ctx =new ClassPathXmlApplicationContext("beans.xml");
		Person p =ctx.getBean("person", Person.class);
		p.useAxe();
	}

}
