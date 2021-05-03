
/*
	都给定数组进行排序。
	{ 5, 1, 6, 4, 2, 9};
*/
class ArrayTest2  
{
	/*
		选择排序特点：
					  内循环结束一次后，最值出现头角标位置上
	*/
	public static void selectSort(int [] arr)
	{
		for (int x=0; x<arr.length-1; x++)
		{
			for (int y=x+1; y<arr.length; y++)
			{
				if (arr[x] > arr[y])   //从小到大
				{
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}

	public static void printArray(int [] arr)
	{
		System.out.print("[");
		for (int x=0; x<arr.length; x++)
		{
			if (x!=arr.length-1)
			{
				System.out.print(arr[x]+"，");
			}
			else
				System.out.println(arr[x]+"]");
		}
	}
	public static void main(String[] args) 
	{
		int [] arr = {5, 1, 6, 4, 2, 9};

		//排序前
		System.out.print("排序前：");
		printArray(arr);
		//排序
		selectSort(arr);
		//排序后
		System.out.print("排序后：");
		printArray(arr);
	}
}
