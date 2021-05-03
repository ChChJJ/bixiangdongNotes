class ArrayDemo3 
{
	public static void println()
	{
		System.out.println();
	}

	
	//定义一个功能，用于打印数组中的元素。元素间用逗号隔开
	public static void printArray(int [] arr)
	{
		System.out.print("[");
		for (int x = 0; x<arr.length; x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+"，");
			else
				System.out.println(arr[x]+"]");
		}
	}

	public static void main(String[] args) 
	{
		//数组的操作
		//获取数组中的元素。通常会用到遍历

		//int [] arr = new int[3];		
		//int [] arr = new int[]{3,5,2,6,8,7,9,10};

		int [] arr = {3,5,2,6,8,7,9,10,43,13,32,34};

		println();

		System.out.println("length="+arr.length);
		int sum = 0;//求数组元素的和
		for (int x=0; x<arr.length; x++)
		{
			sum+=arr[x];
			System.out.println("arr["+x+"]"+" = "+arr[x]+";");
		}
		System.out.println("sum = "+sum);

		println();
		System.out.println("HelloWorld");
		println();

		printArray(arr);
		printArray(arr);

		println();
		System.out.println(arr);  //输出数组在没啥意义内存中方的地址，
	}
	
}
