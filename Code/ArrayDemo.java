class ArrayDemo
{
	public static void println()
	{
		System.out.println();
	}

	public static void main(String[] args)
	{
		//元素类型[] 数组名 = new 元素类型 [元素个数或数组长度];

		//需求：想定义一个可以存储三个整数的容器
		int [] x = new int[3];


		//打印数组x中角标为0的元素的值
		System.out.println("x[0] = "+x[0]);
		//打印数组x中角标为1的元素的值
		System.out.println("x[1] = "+x[1]);   //int型数组默认初始化值是0
		println();

		x [0] = 59;   //给 x数组的 0角标赋值
		System.out.println("x[0] = "+x[0]);  //输出 x数组 0角标的值
	}
}