/*
	this�ؼ��֣�����ȥ���������־ֲ������ͳ�Ա����ͬ�����
	thisΪʲô�ܽ��������⣿
	this���״������ʲô�أ�
		this�����������ں����������������
			��˵���ĸ������ڵ��� this���ڵĺ����� this�ʹ����ĸ�����

	this��Ӧ�ã����������еĹ���ʱ���ú����ڲ�Ҫ�õ����ú����Ķ���ʱ����ʱ��Ҫ�� this��ʾ������� 
				�������๦���ڲ��õ���������ʱ���õ� this�ؼ���
		
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
		this.name = name;
		this.age = age;	
	}

	public void speak()
	{
		System.out.println("name = " + this.name + ", age = " + this.age);
		show();  /*ǰ��ʡ���� this.  д��д�����ԣ�д�����ͷ������Ķ� */
	}
	public void show()
	{
		System.out.println(this.name);
	}



	/*
		���󣺸��˶���һ�����ڱȽ������Ƿ���ͬ�Ĺ��ܡ�Ҳ�����Ƿ���ͬ����

	*/
	Person(int age)
	{
		this.age = age;
	}
	public boolean compare(Person p)
	{
		return this.age == p.age;
	}
	
}

class PersonDemo3
{
	public static void main(String[] args)
	{
        //Person p = new Person("����");   
		//Person p1 = new Person("LiSi");
		//p1.speak();
		//p.speak(); 

		Person p1 = new Person(20);
		Person p2 = new Person(28);
		boolean b = p1.compare(p2);
		System.out.println(b);
		
	} 
}