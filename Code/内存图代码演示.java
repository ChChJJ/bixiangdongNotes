class Person
{
	private String name = "李白";
	private int age;
	private static String country = "cn";

	Person(String name, int age)
	{
		this.name = name;
	}

	{
		System.out.println(name+"   "+age);
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void speak()
	{
		System.out.println(this.name+"     "+this.age);
	}

	public static void showCountry()
	{
		System.out.println("country="+country);
	}
}

class 内存图代码演示 
{
	public static void main(String[] args) 
	{
		Person p = new Person("张三", 20);
	}
}

/*
			Person p = new Person("张三", 20);
		该句话做了那些事情：
		1、因为 new 用到了 内存图代码演示.class 文件。
		   所以会先找到 内存图代码演示.class 文件 并加载到内存当中
		2、执行该类中的静态代码块（如果有的话）。给内存图代码演示.class类进行初始化
		3、在堆内存中开辟空间，分配内存地址
		4、在堆内存中建立对象的特有属性并进行默认初始化
		5、对属性进行显示初始化
		6、对对象进行构造代码块初始化
		7、对对象进行与之对应的构造函数初始化
		8、将内存地址赋给栈内存中的p变量
*/ 