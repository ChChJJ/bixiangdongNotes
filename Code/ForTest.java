class ForTest 
{
	public static void main(String[] args) 
	{
		int x=1;
		for (System.out.println("a"); x<3; System.out.println("c"))
		{
			System.out.println("d");
			x++;
		}
		//运行结果： adcdc  


		for (int z=0; z<3; z++)
		{

		}   //第二种写法
		
		int j = 0;
		for (; j<3; )
		{
			y++;
		}	//第三种写法


		/*
			无线循环最简单的表现形式
			for(; ; ){}   对 for来说不写条件表达式默认为真

			while(true){}
		*/

	}
}
