/*
	��̬����顣
		��ʽ��
			static
			{
				��̬������е�ִ�����
			}

		�ص㣺������ļ��ض�ִ�У�������������ִ�У���ִֻ��һ�Σ����Դ����ڴ浱���ˡ�
		���ã����ڸ�����г�ʼ��

*/

class StaticCode 
{
	static
	{
		System.out.println("Hello");
	}
}

class StaticDemoCode 
{
	static{
		System.out.println("World");
	}

	public static void main(String[] args) 
	{
		new StaticCode();
		new StaticCode();

		System.out.println("Hello World!");
	}
}
