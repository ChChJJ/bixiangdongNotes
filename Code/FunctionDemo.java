class FunctionDemo //17/5/2020
{

	//  修饰符   返回值类型  函数名   参数类型   形式参数
	public static    int    getResult   (int       num)
	{
		return num * 3 + 5;
	}

	public static void main(String[] args) 
	{
		/*
		int x = 4;
		System.out.println(x*3+5);

		x=6;
		System.out.println(x*3+5);
		*/


		int x = getResult(4);
		System.out.println("x ="+x);
	}

	//发现以上的运算，因为获取不同数据的运算结果，代码出现了重复。
	//为了提高代码的复用性，对代码进行抽取。
	//将这个部分定义成一个独立的功能，方便日后使用
	//Java中对功能的定义通过函数的形式来体现的

	//需要定义一个功能，完成一个整数的 *3+5 的运算，并打印结果。

	//1、先明确函数定义的格式
	/*

		 修饰符 返回值类型 函数名(参数类型 形式参数1, 参数类型 形式参数2, ...)
	  {
    	执行语句;
    	return 返回值;
	  }

	*/


}
