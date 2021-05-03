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
	{	//在同一个类里面省略了类名.  非静态里面省略 this.  静态里面省略 类名.
//		System.out.println("country="+Person.country);
		System.out.println("country="+country);
		Person.method();
	}

	public static void method
	{
		System.out.println("method run");
	}
}

class 对象调用成员过程
{
	public static void main(String[] args) 
	{
		Person p = new Person("李清照", 16);
		p.setName("王维");
	}
}