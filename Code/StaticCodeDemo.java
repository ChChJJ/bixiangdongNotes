/*
	静态代码块。
		格式：
			static
			{
				静态代码块中的执行语句
			}

		特点：随着类的加载而执行，优先于主函数执行，且只执行一次，它以存在内存当中了。
		作用：用于给类进行初始化

*/

class StaticCode 
{
	static
	{
		System.out.println("Hello");
	}
}

class StaticDemoCode 
{
	static{
		System.out.println("World");
	}

	public static void main(String[] args) 
	{
		new StaticCode();
		new StaticCode();

		System.out.println("Hello World!");
	}
}
