/*
  1、对象一建立就会调用对应的构造函数
  2、构造函数的作用：
		可以用于给对象进行初始化。
  3、构造函数小细节：
		当一个类中没有定义构造函数时，那么系统就会默认给该类加入一个空参数的构造函数
  4、在类中自定义了构造函数后，默认的构造函数就没用

 构造函数和一般函数区别：
	1、在写法上有不同
	2、在运行上也有不同，构造函数是在对象一建立就运行，给对象初始化
	3、而一般方法是对象调用才执行，是给对象添加对象具备的功能
	4、一个对象建立，构造函数只运行一次，而一般方法可以被该对象调用多次
*/

class Person 
{
	//privat：封装
	private String name;  //人的名字
	private int age;  //人的姓名
	
	Person()
	{
		System.out.println("A:name="+name + ", age="+age);
		Cry();	//调用 哭函数
	}
	Person(String n)
	{
		name = n;
		System.out.println("B:name="+name + ", age="+age);
		Cry();
	}
	Person(String n, int a)
	{
		name = n;
		age = a;
		System.out.println("C:name="+name + ", age="+age);
	    Cry();
	}

	 public void setName(String n)  //改名用
    {
        name = n;
    }
    public String getName()  //接收新名字
    {
        return name;
    }

	public void Cry()//函数重载；哭
	{
		System.out.println("Cry");
	}
}

/*
public static void println()
{
	System.out.println();
}
 重载函数出错：PersonDemo2.java:56: 错误: 需要class, interface或enum
			   public static void println()
			 			     ^
			   PersonDemo2.java:59: 错误: 需要class, interface或enum
			   }
			   ^
			   2 个错误
*/
class PersonDemo2
{
	public static void main(String[] args)
	{
		//构造函数要一一对应

		Person p1 = new Person();	//输出结果：A:name=null, age=0	Cry
		p1.Cry();  //以后再接着哭	//输出结果：A:name=null, age=0	Cry	Cry
		
		//println();
		System.out.println();
		System.out.print("改名前：");
		Person p2 = new Person("李四 ");  //输出结果：B:name=李四, age=0	Cry
		p2.setName("王五");
		System.out.println("改名后：name=" + p2.getName());

		System.out.println();
		Person p3 = new Person("张三", 10);  //输出结果：C:name=张三, age=10	Cry
	} 
}