
/*
	�����������������
	{ 5, 1, 6, 4, 2, 9};
*/
class ArrayTest2  
{
	/*
		ѡ�������ص㣺
					  ��ѭ������һ�κ���ֵ����ͷ�Ǳ�λ����
	*/
	public static void selectSort(int [] arr)
	{
		for (int x=0; x<arr.length-1; x++)
		{
			for (int y=x+1; y<arr.length; y++)
			{
				if (arr[x] > arr[y])   //��С����
				{
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}

	public static void printArray(int [] arr)
	{
		System.out.print("[");
		for (int x=0; x<arr.length; x++)
		{
			if (x!=arr.length-1)
			{
				System.out.print(arr[x]+"��");
			}
			else
				System.out.println(arr[x]+"]");
		}
	}
	public static void main(String[] args) 
	{
		int [] arr = {5, 1, 6, 4, 2, 9};

		//����ǰ
		System.out.print("����ǰ��");
		printArray(arr);
		//����
		selectSort(arr);
		//�����
		System.out.print("�����");
		printArray(arr);
	}
}
