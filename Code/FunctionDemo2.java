class FunctionDemo2
{
	public static void main(String[] args)
	{
		int sum = getSum(4,6);
		System.out.println();
		System.out.println("4+6 = "+ sum);

		sum = getSum(11,3);
		System.out.println("11+3 = "+ sum);
	}  
	 
	/*
	
	如何定义一个函数呢？
     			1、既然函数是一个独立的功能，那么该功能的运算结果是什么先明确	
						因为这是在明确函数的返回值类型

	     		2、再明确在定义该功能的过程中是否需要未知的内容参与运算。
				        因为是在明确函数的参数列表（参数的类型和参数的个数）
	*/

	//需求：定义一个功能完成 3 + 4 的运算，并将结果返回给调用者
	/*
		1、明确功能的结果：是一个整数的和
		2、在实现该功能的过程中，是否有未知内容参与运算，没有。
			  其实这两个功能就是在明确函数的定义
			   1、是在明确函数的返回值类型
			   2、明确函数的参数列表（参数的类型和参数的个数）
	*/

   /*public static int getSum()
	 {
	 	 return 3+4; 
	 }
   */

	/*
		以上这个函数的功能结果是固定的，毫无扩展性而言。
		为了方便用户需求，由用户来指定加数和被加数。这样，功能才有意义

		思路：
			  1、功能结果是一个和 返回值是 int。
			  2、有未知内容参与运算。有两个。这两个未知内容的类型都是 int 
	*/
	public static int getSum(int x, int y)
	{
		return x+y;
	}


	/*
	
		需求：判断两个数是否相同。
			  
		1、明确功能的结果，结果是：boolean。
		2、功能是否有未知内容参与运算。有，两个整数。
	
	*/
	public static boolean compare(int a, int b)
	{
	  /*
		if (a==b)
		{
			return true;
		}else 
			return false; 
	
			如果返回的不是真假值可以这样写: 
			     return (a==b)?true:false;
	  */

	  return a==b;
	}

	/*
		需求：定义功能，对两个数进行比较。获取较大的数
	*/
	public static int getMax(int x, int y)
	{
	  /*
		if(x>y)
			return x;
		else
			return y;
	   */
	   return (x>y)?x:y;
	}
}