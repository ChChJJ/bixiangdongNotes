//		��������

class CarDemo_1 
{

	public static void main(String[] args) 
	{
//		Car qiche = new Car();
//		c.num = 5;    �����仰���Լ򻯳�
		
		/*
		new Car().num = 5;
		new Car().color = "blue";
		new Car().run();


		Car c = new Car();
		
		c.run();
		c.nun = 4;
		new Car().run();
		*/

/*			
	��������ʹ�÷�ʽһ��
						  ���Զ���ķ���ֻ����һ��ʱ��������������������ɣ�����д�Ƚϼ�
						  �����һ��������ж����Ա���ã������������������֡�
	��������ʹ�÷�ʽ����
						  ���Խ�������������Ϊʵ�ʲ������д���
*/

		Car q = new Car();
		show(q);
	}
	//�����������䳧�����������и�װ�������ĳ����ĳɺ�ɫ��������̥
	public static void show(Car c)
	{
		c.num = 3;
		c.color = "black";
		c.run();
	}
}
