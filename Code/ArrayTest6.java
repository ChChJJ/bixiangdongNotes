class ArrayTest6 
{
	public static void main(String[] args) 
	{
		toHex(60);
	}

	
	/*
		0 1 2 3 4 5 6 7 8 9 A  B  C  D  E  F ==十六进制中的元素。
		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15

		查表法：将所有的元素临时存储起来。建立对应关系
		        每一次 &15后的值作为索引去查建立好的表。就可以找到对应的元素。
				这样就比 -10+'a'简单的多
		
		如何建立这张表呢？
		    可以通过数组的形式来定义

	    可以使用学习过的容器——数组来完成存储。
	*/

	public static void toHex(int num)
	{
		char[] chs = {'0','1','2','3',
					  '4','5','6','7',
					  '8','9','A','B',
					  'C','D','E','F'}; 

		//定义一个临时容器。
		char[] arr = new char[8];  //字符数组在内存中被定义默认是 '\u0000',这是一个空位，相当于一个空格
		int pos = arr.length;
		
		while (num != 0)
		{
			int temp = num & 15;

		   //System.out.println((chs [temp]));
			
		    arr[--pos] =chs[temp];

			num = num >>> 4;
		}

		System.out.println("pos = "+pos);
		System.out.print("60的十六进制是：");
		//存储数据的arr数组遍历
		for (int x=pos; x < arr.length; x++)
		{
			System.out.print(arr[x]);
		}
	}
}
