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
		StaticCode()	
		{	//������ᱻ��ӡ�������Ϊû�д�������֮��Ӧ�Ķ���
			System.out.println("b");
		}

		static	
		{	//��̬���������ʼ��
			System.out.println("a");
		} 
			
		{	//��������������ʼ��
			System.out.println("c");
		}
		
		StaticCode(int x)	
		{	//���캯������Ӧ�����ʼ��
			System.out.println("d");
		}	

		public static void show()
		{
			System.out.println("show run");
		}
	}

	class StaticCodeDemo 
	{
		static
		{
//			System.out.println("b");
		}

		public static void main(String[] args) 
		{
			new StaticCode(4);

//			new StaticCode();
//			new StaticCode();
//			System.out.println("over");
//			StsticCode.show();

//			StaticCode s = null;
//			s = new StaticCode();
		}

		static
		{
//			System.out.println("c");
		}
	}
