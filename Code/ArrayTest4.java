/*
	数组的查找操作

	练习：有一个有序的数组，想要将一个元素插入数组中
	      还要保证该数组是有序的（意思就是：如何获取该元素在数组中的位置）
	【练习没写】
*/
class  ArrayTest4
{
	public static void main(String[] args) 
	{
		/*
		int[] arr = {3,2,1,5,4,2,9};
		int index = getIndex(arr,2);
		System.out.println("index="+index);
		*/

		int [] arr = {2,3,4,6,7,32,54,66};

		int index = halfsearch(arr,32);
		System.out.println("index="+index);

		 index = halfsearch_2(arr,32);
		System.out.println("index="+index);
	}
	/*
		折半查找。可以提高效率，但前提是有序数组才行
	*/
	public static int halfsearch(int [] arr, int key)
	{
		int min,max,mid;
		min = 0;
		max = arr.length-1;
		mid = (min+max)/2;

		while(arr[mid] != key)
		{
			if (key>arr[mid])
			{
				min = mid + 1;
			}
			else if(key<arr[mid])
				max = mid - 1;

			if (min>max)
			{
				return -1;
			}

			mid = (min+max)/2;
		}
		return mid;
	}
	/*
		折半的第二种方式
	*/
	public static int halfsearch_2(int [] arr, int key)
	{
		int min = 0, max = arr.length-1, mid;

		 while (min<=max)
		 {
			 mid = (min+max)>>1;  //>>等价于/2

			 if (key>arr[mid])
			 {
				 min = mid + 1;
			 }
			 else if (key<arr[mid])
			 {
				 max = mid - 1;
			 }
			 else 
				 return mid;
		 }
		 return -1;
	}



	//定义功能，获取key第一次出现在数组的位置。如果返回是-1，代表着该key在数组中不存在
	public static int getIndex(int [] arr, int key)
	{
		for (int x=0; x<arr.length; x++)
		{
			if (arr[x] == key)
			{
				return x;
			}
		}
		return -1; //数组角标都是从0开始，都是正数，负数角标是不存在的。没有找到就用负数代表着不存在的也就是代表这个数不存在
	}
}
