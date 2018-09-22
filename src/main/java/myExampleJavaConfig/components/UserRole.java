package myExampleJavaConfig.components;

import java.util.List;

import org.springframework.stereotype.Component;

@Component("userRole")
public interface UserRole {
	
   public String getName();
   public int getId();
   public List<ObjectType> getObjectTypes();

}
