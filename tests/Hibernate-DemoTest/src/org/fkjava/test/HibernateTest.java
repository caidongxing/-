package org.fkjava.test;

import static org.junit.Assert.*;

import org.fkjava.bean.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HibernateTest {
	Session session=null;
	SessionFactory sessionFactory=null;
	Transaction tx=null;

	@Before
	public void setUp() throws Exception {
		System.out.println("------setUp---初始化测试资源-----");
		Configuration config=new Configuration().configure();
		ServiceRegistry sr=new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		SessionFactory sessionFactory=config.buildSessionFactory(sr);
		Session session=sessionFactory.openSession();
		
	}

	@Test
	public void testAdd()  {
		Person p = new Person();
		p.setName("tomddfd2");
		p.setPassword(123456);
		p.setBirthday(new java.util.Date());
		tx = session.beginTransaction();
		session.persist(p);
		tx.commit();
	}
	@After
	public void tearDown() throws Exception {
		System.out.println("------tearDown---释放测试资源-----");
	}

	@Test
	public void test() {
		System.out.println("------test---测试资源-----");
		session.close();
		sessionFactory.close();
	}

}
