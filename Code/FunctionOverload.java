class FunctionOverload 
{
	public static void main(String[] args) 
	{
		int sum = add(2,6);
		int sum1 = add(2,3,7);

		println();
		System.out.println("2+6"+"="+sum);
		System.out.println("2+3+7"+"="+sum1);

		println();
		print99();

		println();
		print99(5);


	}

	//����һ���ӷ����㣬��ȡ���������ĺ�
	public static int add(int x, int y)
	{
		return x+y;
	}

	//����һ���ӷ���ȡ���������ĺ�
	public static int add(int x, int y, int z)
	{
	/*

		return x+y+z;
		�����ֿ�д�ɣ�
	*/
		return add(x,y)+z;   //����ǰ�涨��ĺ���
	}
	
	//����һ���س�����
	public static void println()
	{
		System.out.println();
	}
	//��ӡ�žų˷���
	public static  void print99()
	{
		//��Ϊ������һ�����ܣ�
		//�����������ֱ�ӵ������涨��Ĺ���
		print99(9);            //��ӡ��������99�˷���


	/*	for (int x=1; x<=9; x++)
		{
			for (int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+x*y+"\t");
			}
			System.out.println();
		
		}
	*/
	}

	//����һ����ӡ�˷���Ĺ��ܣ��������ӡ�����پʹ�ӡ����
	public static void print99(int num)
	{
		for (int x=1; x<=num; x++)
		{
			for (int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+x*y+"\t");
			}
			System.out.println();
		}
	}
}

/*

	��ע�⡿�����غͷ���ֵ����û�й�ϵ

	void show(int x,char y,double z){}
		���⣺һ���ĸ��𰸺͸�������������
	
	a.void show(int x, char y, double z){}   //û�У���Ϊ��ԭ����һ��

	b.int show(int a, doule c, char b){}     //���أ���Ϊ�������Ͳ�ͬ�� ԭ�����ĵڶ�������������char������������ĵڶ�������������double
	                                         //��������˳���

	c.void show(int a, double c, cahr b){}   //����

	d.boolean show(int a, char b){}    //�����ˣ���Ϊ�����ĸ�����ͬ

	e.void show(double e){}     //�����ˣ���Ϊ�����ĸ�����ͬ

	f.double show(int x, char y, double z){}   //û�У���������������������������ͬһ������
	//���� show ����������Ҳһ�£�����show������ʱ��ȷ����û�з���ֵ�Ļ��Ƿ���double��

*/
