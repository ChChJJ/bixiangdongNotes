class ArrayDemo3 
{
	public static void println()
	{
		System.out.println();
	}

	
	//����һ�����ܣ����ڴ�ӡ�����е�Ԫ�ء�Ԫ�ؼ��ö��Ÿ���
	public static void printArray(int [] arr)
	{
		System.out.print("[");
		for (int x = 0; x<arr.length; x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+"��");
			else
				System.out.println(arr[x]+"]");
		}
	}

	public static void main(String[] args) 
	{
		//����Ĳ���
		//��ȡ�����е�Ԫ�ء�ͨ�����õ�����

		//int [] arr = new int[3];		
		//int [] arr = new int[]{3,5,2,6,8,7,9,10};

		int [] arr = {3,5,2,6,8,7,9,10,43,13,32,34};

		println();

		System.out.println("length="+arr.length);
		int sum = 0;//������Ԫ�صĺ�
		for (int x=0; x<arr.length; x++)
		{
			sum+=arr[x];
			System.out.println("arr["+x+"]"+" = "+arr[x]+";");
		}
		System.out.println("sum = "+sum);

		println();
		System.out.println("HelloWorld");
		println();

		printArray(arr);
		printArray(arr);

		println();
		System.out.println(arr);  //���������ûɶ�����ڴ��з��ĵ�ַ��
	}
	
}
