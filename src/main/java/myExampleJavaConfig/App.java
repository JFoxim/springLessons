package myExampleJavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import myExampleJavaConfig.components.EngineerRole;


public class App {
	
	public static void main(String[] args)
    {
	      ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
	      EngineerRole engineerRole = context.getBean("engineerRole", EngineerRole.class);
	      engineerRole.setName("инженер");
	      System.out.println(engineerRole.getName());

         //((AnnotationConfigApplicationContext)context).close();
    }

}
