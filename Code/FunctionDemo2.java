class FunctionDemo2
{
	public static void main(String[] args)
	{
		int sum = getSum(4,6);
		System.out.println();
		System.out.println("4+6 = "+ sum);

		sum = getSum(11,3);
		System.out.println("11+3 = "+ sum);
	}  
	 
	/*
	
	��ζ���һ�������أ�
     			1����Ȼ������һ�������Ĺ��ܣ���ô�ù��ܵ���������ʲô����ȷ	
						��Ϊ��������ȷ�����ķ���ֵ����

	     		2������ȷ�ڶ���ù��ܵĹ������Ƿ���Ҫδ֪�����ݲ������㡣
				        ��Ϊ������ȷ�����Ĳ����б������������ͺͲ����ĸ�����
	*/

	//���󣺶���һ��������� 3 + 4 �����㣬����������ظ�������
	/*
		1����ȷ���ܵĽ������һ�������ĺ�
		2����ʵ�ָù��ܵĹ����У��Ƿ���δ֪���ݲ������㣬û�С�
			  ��ʵ���������ܾ�������ȷ�����Ķ���
			   1��������ȷ�����ķ���ֵ����
			   2����ȷ�����Ĳ����б������������ͺͲ����ĸ�����
	*/

   /*public static int getSum()
	 {
	 	 return 3+4; 
	 }
   */

	/*
		������������Ĺ��ܽ���ǹ̶��ģ�������չ�Զ��ԡ�
		Ϊ�˷����û��������û���ָ�������ͱ����������������ܲ�������

		˼·��
			  1�����ܽ����һ���� ����ֵ�� int��
			  2����δ֪���ݲ������㡣��������������δ֪���ݵ����Ͷ��� int 
	*/
	public static int getSum(int x, int y)
	{
		return x+y;
	}


	/*
	
		�����ж��������Ƿ���ͬ��
			  
		1����ȷ���ܵĽ��������ǣ�boolean��
		2�������Ƿ���δ֪���ݲ������㡣�У�����������
	
	*/
	public static boolean compare(int a, int b)
	{
	  /*
		if (a==b)
		{
			return true;
		}else 
			return false; 
	
			������صĲ������ֵ��������д: 
			     return (a==b)?true:false;
	  */

	  return a==b;
	}

	/*
		���󣺶��幦�ܣ������������бȽϡ���ȡ�ϴ����
	*/
	public static int getMax(int x, int y)
	{
	  /*
		if(x>y)
			return x;
		else
			return y;
	   */
	   return (x>y)?x:y;
	}
}