package lee;

import org.crazyit.app.domain.User;
import org.crazyit.app.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		UserService us=applicationContext.getBean("userservice",UserService.class);
		User u1=us.getUsersByNameAndAge("孙悟空", 34);
		User u2=us.getAnotherUser("美猴王", 34);
		us.evictUser("美猴王",34);
		User u3=us.getAnotherUser("美猴王", 34);
		System.out.println(u1==u3);
		User u5=us.getAnotherUser("美王", 34);
		System.out.println(u3==u5);
		us.evictAll();
		User u6=us.getAnotherUser("孙悟空", 34);
		User u7=us.getAnotherUser("美王", 34);
		System.out.println(u6==u1);
	}

}
