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
	{
		System.out.println("country="+country);
	}
}

class �ڴ�ͼ������ʾ 
{
	public static void main(String[] args) 
	{
		Person p = new Person("����", 20);
	}
}

/*
			Person p = new Person("����", 20);
		�þ仰������Щ���飺
		1����Ϊ new �õ��� �ڴ�ͼ������ʾ.class �ļ���
		   ���Ի����ҵ� �ڴ�ͼ������ʾ.class �ļ� �����ص��ڴ浱��
		2��ִ�и����еľ�̬����飨����еĻ��������ڴ�ͼ������ʾ.class����г�ʼ��
		3���ڶ��ڴ��п��ٿռ䣬�����ڴ��ַ
		4���ڶ��ڴ��н���������������Բ�����Ĭ�ϳ�ʼ��
		5�������Խ�����ʾ��ʼ��
		6���Զ�����й��������ʼ��
		7���Զ��������֮��Ӧ�Ĺ��캯����ʼ��
		8�����ڴ��ַ����ջ�ڴ��е�p����
*/ 