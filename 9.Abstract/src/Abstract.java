
 abstract class Abstract1 {
		 void m1() 
		 {
			 System.out.println("non abstract method");
		 }
		 abstract void m2();
		 
 }
     
     class Abstract extends Abstract1
     {
    	

    	 void m2()
    	 {
    		 System.out.println("implementation in child class");
    	 }
     
    	 
    public static void main(String[] args) 
	{
		Abstract a=new Abstract();
		a.m1();
		a.m2();
	
		
			
	}		
}


