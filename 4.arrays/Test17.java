class Test17 
{

public static void main(String[] args) 
{  
	int arr[]={12,2,3,4,23};
	int num1=12;
	int num2=23;
	boolean found1=false;
	boolean found2=false;

	for (int i=0; i<arr.length;i++ )
	{
		if(i==num1)
		{
			found1=true;
		
		     break;
	     }
	}
	

	for (int i=0; i<arr.length;i++ )
	{
		if(i==num2)
		{
			found2=true;
		
		     break;
	     }
	}
	
   if(found1&&found2)

	System.out.println(" specified number found ");
	else
		System.out.println(" specified number not found ");
}
}