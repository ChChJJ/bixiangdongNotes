
/*
	this��䣺���ڹ��캯��֮������໥����
			  ���캯�������ֻ��ʹ�� this��䣨�õ�ʱ��ǵ�Ҫ����Ӧ�Ĳ�����
	��ע�����
			this���ֻ�ܶ����ڹ��캯���ĵ�һ�С�
			��Ϊ��ʼ��Ҫ��ִ�С�
*/
class Person
{
	private String name;
	private int age;
	
	Person(String name)
	{
		this.name = name;
	}
	Person(String name, int age)
	{
		//this.name = name;
		this(name);  //this���
		//p(name)
		this.age = age;
	}
}

class PersonDemo4 
{
	public static void main(String[] args) 
	{
		Person p = new Person("LiSi", 30);
	}
}
