package myExampleLesson1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	
	private ApplicationContext context;
	
	@Before
	public void init() {
		context = new ClassPathXmlApplicationContext("myExampleLesson1/applicationContext.xml");
	}

	@Test
    public void createEngineeringObject() {
	    EngineeringObject engineeringObject = context.getBean("engineeringObject", EngineeringObject.class);
	    engineeringObject.setId(1);
	    engineeringObject.setName("Проект обустройства скважины");
        Assert.assertEquals(engineeringObject.getId(), 1);
	}
	
	
	@Test
    public void createUser() {
	    EngineeringObject engineeringObject = context.getBean("engineeringObject", EngineeringObject.class);
	    engineeringObject.setId(1);
	    engineeringObject.setName("456 Проект обустройства скважины");	  
	    
	    EngineeringObject engineeringObject2 = context.getBean("engineeringObject", EngineeringObject.class);
	    engineeringObject2.setId(2);
	    engineeringObject2.setName("0750 Проект ликвидации скважины");	 
	    
	    List<ObjectType> engineeringObjects = new ArrayList<ObjectType>();
	    engineeringObjects.add(engineeringObject);
	    engineeringObjects.add(engineeringObject2);
	    engineeringObjects.set(0, engineeringObject);
	    engineeringObjects.set(1, engineeringObject2);

	    EngineerRole engineerRole = context.getBean("engineerRole", EngineerRole.class);
	    engineerRole.setId(10);
	    engineerRole.setName("Главный инженер проекта");
	    engineerRole.setObjectTypes(engineeringObjects);
	    
	    Assert.assertEquals(engineerRole.getObjectTypes().get(0).getName(), "456 Проект обустройства скважины");
	    Assert.assertEquals(engineerRole.getObjectTypes().get(1).getName(), "0750 Проект ликвидации скважины");
	
	    List<UserRole> userRoles = new ArrayList<UserRole>();
	    
    	User user = context.getBean("user", User.class);
    	user.setId(1);
    	user.setName("Пётр");
    	user.setPhone("122-32342424");
    	user.setEmail("test333@email.ru");    	
    	user.setRoles(userRoles);    	
    	Assert.assertEquals(user.getId(), 1);
	}
	

}
