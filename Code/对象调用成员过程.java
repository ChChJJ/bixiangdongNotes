class Person
{
	private String name = "���";
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
	{	//��ͬһ��������ʡ��������.  �Ǿ�̬����ʡ�� this.  ��̬����ʡ�� ����.
//		System.out.println("country="+Person.country);
		System.out.println("country="+country);
		Person.method();
	}

	public static void method
	{
		System.out.println("method run");
	}
}

class ������ó�Ա����
{
	public static void main(String[] args) 
	{
		Person p = new Person("������", 16);
		p.setName("��ά");
	}
}