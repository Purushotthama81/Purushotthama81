class Test4 

{
	public static void main(String[] args) 
	{  
		int arr[]={1,2,3,4,5};
		int num=5;
		boolean found=false;

		for (int i=0; i<arr.length;i++ )
		{
			if(i==num)
			{
				found=true;
			
			     break;
		     }
		}
		
       if(found)

		System.out.println(" specified number found ");
		else
			System.out.println(" specified number not found ");
	}
}
