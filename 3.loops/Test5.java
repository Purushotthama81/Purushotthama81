class Test5 
{
	public static void main(String[] args) 
	{
		int arr[]={2,3,4};

		
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
		
		

		if (arr[i]>max)
			max=arr[i];

		}
		
		System.out.println("laegest= "+max);
	

	}
}

/*
class Test5 
{
	public static void main(String[] args) 
	{
		int a=2;
		int b=4;
		int c=6;
		
		if(a>b&&a>c)
        System.out.println(a+" is the largest number");

		else if (b>a&&b>c)
		System.out.println(b+" is the largest number");

		else
		System.out.println(c+" is the largest number");

}
}
*/ 