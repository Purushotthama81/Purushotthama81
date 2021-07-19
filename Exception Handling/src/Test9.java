import java.util.*;
  
public class Test9 {
  
    public Object obj;
  
    public static void main(String[] args)
        throws ClassNotFoundException, NoSuchFieldException
    {
  
       
        Class myClass = Class.forName("Test");
  
        System.out.println("Class represented by myClass: "
                           + myClass.toString());
  
        String fieldName = "obj";
  
       
        System.out.println(
            fieldName + " Field of myClass: "
            + myClass.getField(fieldName));
    }
}