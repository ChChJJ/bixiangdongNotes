class ForDemo
{
	public static void main(String[] args)
	{
		/*
			for(初始化; 循环条件; 循环后操作表达式)
			{
				执行语句;
			}
		*/

		for (int x = 0; x<3; x++)  //括号里的x是局部变量
		{
			System.out.println("x  = " + x);  //x只为循环增量存在，循环结束后就没有意义
		}
		//System.out.println("x == " + x);  变量的作用域问题


		int y = 0;  //全局变量
		while (y<3)
		{
			System.out.println("y = " + y);
			y++;
		}
		System.out.println("y == " + y);  
		

		//如果变量只为循环增量存在的话用 for语句比较合适 ，内存会相对优化点

			//注意 for和 while可以互换，区别在于增量和变量在内存中的驻留时间不同
	}
}