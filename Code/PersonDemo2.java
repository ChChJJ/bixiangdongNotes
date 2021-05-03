/*
  1������һ�����ͻ���ö�Ӧ�Ĺ��캯��
  2�����캯�������ã�
		�������ڸ�������г�ʼ����
  3�����캯��Сϸ�ڣ�
		��һ������û�ж��幹�캯��ʱ����ôϵͳ�ͻ�Ĭ�ϸ��������һ���ղ����Ĺ��캯��
  4���������Զ����˹��캯����Ĭ�ϵĹ��캯����û��

 ���캯����һ�㺯������
	1����д�����в�ͬ
	2����������Ҳ�в�ͬ�����캯�����ڶ���һ���������У��������ʼ��
	3����һ�㷽���Ƕ�����ò�ִ�У��Ǹ�������Ӷ���߱��Ĺ���
	4��һ�������������캯��ֻ����һ�Σ���һ�㷽�����Ա��ö�����ö��
*/

class Person 
{
	//privat����װ
	private String name;  //�˵�����
	private int age;  //�˵�����
	
	Person()
	{
		System.out.println("A:name="+name + ", age="+age);
		Cry();	//���� �޺���
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

	 public void setName(String n)  //������
    {
        name = n;
    }
    public String getName()  //����������
    {
        return name;
    }

	public void Cry()//�������أ���
	{
		System.out.println("Cry");
	}
}

/*
public static void println()
{
	System.out.println();
}
 ���غ�������PersonDemo2.java:56: ����: ��Ҫclass, interface��enum
			   public static void println()
			 			     ^
			   PersonDemo2.java:59: ����: ��Ҫclass, interface��enum
			   }
			   ^
			   2 ������
*/
class PersonDemo2
{
	public static void main(String[] args)
	{
		//���캯��Ҫһһ��Ӧ

		Person p1 = new Person();	//��������A:name=null, age=0	Cry
		p1.Cry();  //�Ժ��ٽ��ſ�	//��������A:name=null, age=0	Cry	Cry
		
		//println();
		System.out.println();
		System.out.print("����ǰ��");
		Person p2 = new Person("���� ");  //��������B:name=����, age=0	Cry
		p2.setName("����");
		System.out.println("������name=" + p2.getName());

		System.out.println();
		Person p3 = new Person("����", 10);  //��������C:name=����, age=10	Cry
	} 
}