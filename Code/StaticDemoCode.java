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
		StaticCode()	
		{	//这个不会被打印输出，因为没有创建过与之对应的对象
			System.out.println("b");
		}

		static	
		{	//静态代码块给类初始化
			System.out.println("a");
		} 
			
		{	//构造代码块给对象初始化
			System.out.println("c");
		}
		
		StaticCode(int x)	
		{	//构造函数给对应对象初始化
			System.out.println("d");
		}	

		public static void show()
		{
			System.out.println("show run");
		}
	}

	class StaticCodeDemo 
	{
		static
		{
//			System.out.println("b");
		}

		public static void main(String[] args) 
		{
			new StaticCode(4);

//			new StaticCode();
//			new StaticCode();
//			System.out.println("over");
//			StsticCode.show();

//			StaticCode s = null;
//			s = new StaticCode();
		}

		static
		{
//			System.out.println("c");
		}
	}
