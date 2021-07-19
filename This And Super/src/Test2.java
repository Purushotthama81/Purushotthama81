class Ani{  
Ani(){System.out.println("animal is created");}  
}  
class Dg extends Ani{  
Dg(){  
super();  
System.out.println("dog is created");  
}  
}  
class Test2{  
public static void main(String args[]){  
Dg d=new Dg();  
}}  