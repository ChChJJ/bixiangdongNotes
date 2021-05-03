
/*
	单例设计模式：解决一个类在内存中只存在一个对象。

	想要保证对象唯一性。
		1、为了避免其他程序过多建立该类对象。先禁止其他程序建立该对象
		2、为了让其他程序访问该对象，在本类种自定义一个对象。
		3、为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式

    这三类用代码体现
		1、将构造函数私有化
		2、在类中创建一个本类对象
		3、提供一个方法可以获取到该对象
*/

	class Single
	{
		//私有化构造函数
		private Single(){}

		//创建本类对象	静态方法访问类中成员，被访问的成员也得是静态的。一般方法得被私有化
		private static Single s = new Single();

		//能用类名调用：这方法得是静态的。	静态方法访问类中成员，被访问的成员也得是静态的
		public static Single getInstance()
		{	//对外提供访问该对象的方式  getInstance():获取实例
			return s;
		}

	}

	class SingleDemo
	{
		public static void main(String[] args) 
		{
			Single ss = Single.getInstance();
				//类名访问getInstance()静态方法，它返回一个 s 引用
		}
	}




