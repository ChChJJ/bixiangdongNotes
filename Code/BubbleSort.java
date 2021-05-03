/*
	ð������
*/
class BubbleSort
{
	public static void bubbleSort(int [] arr)
	{
		for (int x=0; x<arr.length-1; x++)
		{
			for (int y=0; y<arr.length-x-1; y++) //��ÿһ�αȽϵ�Ԫ�ؼ��٣� -1������Ǳ�Խ�硣
			{
				if (arr[y]>arr[y+1])
				{
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr = {1,6,2,9,5,8,10};

		//����ǰ��
		System.out.println("����ǰ��");
		printArray(arr);

		//����
		bubbleSort(arr);

		System.out.println();

		//�����
		System.out.println("�����");
		printArray(arr);
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
}