class FunctionOverload 
{
	public static void main(String[] args) 
	{
		int sum = add(2,6);
		int sum1 = add(2,3,7);

		println();
		System.out.println("2+6"+"="+sum);
		System.out.println("2+3+7"+"="+sum1);

		println();
		print99();

		println();
		print99(5);


	}

	//定义一个加法运算，获取两个整数的和
	public static int add(int x, int y)
	{
		return x+y;
	}

	//定义一个加法获取三个整数的和
	public static int add(int x, int y, int z)
	{
	/*

		return x+y+z;
		这里又可写成：
	*/
		return add(x,y)+z;   //调用前面定义的函数
	}
	
	//定义一个回车功能
	public static void println()
	{
		System.out.println();
	}
	//打印九九乘法表
	public static  void print99()
	{
		//因为定义了一个功能，
		//所以这里可以直接调用下面定义的功能
		print99(9);            //打印出完整的99乘法表


	/*	for (int x=1; x<=9; x++)
		{
			for (int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+x*y+"\t");
			}
			System.out.println();
		
		}
	*/
	}

	//定义一个打印乘法表的功能，可以想打印出多少就打印多少
	public static void print99(int num)
	{
		for (int x=1; x<=num; x++)
		{
			for (int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+x*y+"\t");
			}
			System.out.println();
		}
	}
}

/*

	【注意】：重载和返回值类型没有关系

	void show(int x,char y,double z){}
		问题：一下哪个答案和给定函数重载了
	
	a.void show(int x, char y, double z){}   //没有，因为和原函数一样

	b.int show(int a, doule c, char b){}     //重载，因为参数类型不同了 原函数的第二个参数类型是char，而这个函数的第二个参数类型是double
	                                         //参数是有顺序的

	c.void show(int a, double c, cahr b){}   //重载

	d.boolean show(int a, char b){}    //重载了，因为参数的个数不同

	e.void show(double e){}     //重载了，因为参数的个数不同

	f.double show(int x, char y, double z){}   //没有，这个函数不可以与给定函数存在同一个类中
	//都叫 show 函数，参数也一致，调用show函数的时候不确定是没有返回值的还是返回double的

*/
