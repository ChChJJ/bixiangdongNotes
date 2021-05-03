class Array2Demo 
{
	public static void main(String[] args) 
	{
		//int [] arr = new int[3]; //一维数组
/*
		int[][] arr = new int [3][4]; //定义了一个名称为 arr的二维数组。二维数组中有 3个一维数组（二维数组的长度）
									  //每一个一维数组中有 四个元素  （二维数组中每一个一维数组的长度）
		System.out.println(" arr[0][1] = " + arr[0][1]);
*/



			//不规则数组
/*
		int[][] arr = new int[3][];
      //System.out.println(arr[0]);   默认初始化值

		//对二维数组中每一个一维数组进行手动初始化值
		arr[0] = new int[3];
		arr[1] = new int[1];
		arr[2] = new int[2];


		System.out.println("二维数组的长度是：" + arr.length);  //打印二维数组的长度：3
		System.out.println("二维数组中第一个小数组的长度：" + arr[0].length);  //打印二维数组中第一个一维数组的长度

*/
		int[][] arr = {{3,5,1,7},{2,3,5,8},{6,1,8,2}};  //大圈套小圈，循环嵌套
		
		int sum = 0;
		for (int x=0; x<arr.length; x++)
		{
			for (int y=0; y<arr[x].length; y++)
			{
				sum += arr[x][y];
			}
		}
		System.out.println("sum = " + sum);
	}
}
