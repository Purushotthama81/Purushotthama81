class Test6
{
	public static void main(String[] args) 
	{
		int[]arr1={10,20,30,40,50};
		int[]arr2=new int[arr1.length];
		int index=3;
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.println("original array");
		for(int i=0;i<arr1.length;i++)
		{

        System.out.print(arr1[i]+" ");
		}
		System.out.println();

		System.out.println("new array");
		for(int i=0;i<arr2.length;i++)
		{

        System.out.print(arr2[i]+" ");
		}

	}
}
