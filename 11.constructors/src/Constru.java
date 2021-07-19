
public class Constru {
 
	Constru()
	{
		System.out.println("o arg constr");
	}
	
	Constru(int a)
	{
		System.out.println("1 arg constr");
	}
	Constru(int a ,int b)
	{
		System.out.println("2 arg constr");
	}
	public static void main(String[] args) {
	     Constru c=new Constru();
	     Constru c1=new Constru(10);
	     Constru c2=new Constru(10,20);
	    

	}

}
