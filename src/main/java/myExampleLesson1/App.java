package myExampleLesson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	
	public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("myExampleLesson1/applicationContext.xml");
        EngineerRole engineerRole = context.getBean("engineerRole", EngineerRole.class);
        engineerRole.setName("администратор");
        System.out.println(engineerRole.getName());
    }

}
