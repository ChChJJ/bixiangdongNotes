/*
	private:˽�У�Ȩ�����η��������������еĳ�Ա����Ա�����ͳ�Ա������
	˽�У�ֻ�ڱ�������Ч

	��age˽�л��������⼴ʹ�����˶���Ҳ���ܷ��ʡ�
	��������������ģ�����Ҫ��Person�����ṩ��Ӧ�ķ��� age��ʽ

	��ע�⡿��˽�н����Ƿ�װ��һ�ֱ�����ʽ

	֮���Զ����ṩ���ʷ�ʽ������Ϊ�����ڷ��ʷ�ʽ�м����߼��жϵ���䡣
	�Է��ʵ����ݽ��в�������ߴ���Ľ�׳��
*/

class Person
{
	private int age;

	public void setAge(int a)   //setAge�����ڵ�������� getAge����
	{
		if (a>0&&a<130)
		{
			age = a;
			speak();
		}
		else
			Syst em.out.println("��������ȷ������");
		 age = a;
	}

	public int getAge()
	{
		return age;
	}

	void speak()
	{
		System.out.println("age = "+age);
	}
}
 
class PersonDemo 
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		 
//		p.age = 20;
		p.setAge(-40);

//      p.speak();
	}
}
