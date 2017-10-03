package lee;


import org.crazyit.app.service.Chinese;
import org.crazyit.app.service.Hello;
import org.crazyit.app.service.Person;
import org.crazyit.app.service.World;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest { 
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		Hello hello   =applicationContext.getBean("hello",Hello.class);
		hello.foo();
		hello.addUser("ËïÎò¿Õ" , "7788");
		World world = applicationContext.getBean("world" , World.class);
		world.bar();
		
		
	}

}
