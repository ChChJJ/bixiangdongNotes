//	22/5/2020
/*
	����һ������{5, 1, 6, 4, 2, 8, 9};
	1����ȡ�����е����ֵ����Сֵ
*/

class ArrayTest 
{
	/*
		��ȡ�����е����ֵ,��
		˼·��
		1����ȡ��ֵ��Ҫ���бȽ�,ÿһ�αȽ϶�����һ���ϴ��ֵ��
	 	   ��Ϊ��ֵ��ȷ��, ͨ��һ�����ǽ�����ʱ�洢�� 
		2���������е�ÿһ��Ԫ�ض�����������е�ֵ���бȽ�,
		   ��������˱����е�ֵ,���øøñ�����¼�ϴ�ֵ�� 
		3�������е�Ԫ�ض��Ƚ����,��ô�ñ����д洢�ľ��������е����ֵ�ˡ�

		���裺
		  1�������������ʼ��Ϊ����������һ��Ԫ�ؼ���.��
		  2��ͨ��ѭ������������б����� 
		  3���ڱ��������ж����ж�����,�����������Ԫ�رȱ����е�Ԫ�ش�,
		   �͸�ֵ���ñ�����

		��Ҫ����һ�����������,�Ա���߸����ԡ� 
		  1����ȷ���,�����е����Ԫ�� int�� 
		  2��δ֪����:һ�����顣int[]
	*/

	public static int getMax(int [] arr)
	{
		int max = arr[0];

		for (int x=1; x<arr.length; x++)
		{
			if (arr[x]>max)
			{
				max = arr[x];
			}
		}
		return max;
	}

	/*
		��ȡ���ֵ����һ�ַ�ʽ
			�ɲ����Խ���ʿ������ʼ��Ϊ0�أ�
				���ԡ���ʵ���ڳ�ʼ��Ϊ�����е�����һ���Ǳꡣ
	*/

	public static int getMax_2(int [] arr)
	{
		int max = 0;

		for (int x=1; x<arr.length; x++)
		{
			if (arr[x]>arr[max])
			{
				max = x;
			}
		}
		return arr[max];
	}


	/*
		��ȡ��Сֵ
	*/
	public static int getMin(int [] arr)
	{
		int min = 0;
		for (int x=1; x<arr.length; x++)
		{
				if (arr[x]<arr[min])
			{
				min = x;
			}
		}
		
		return arr[min];
	}


	public static void main(String[] args) 
	{
		int [] arr = {5, 1, 6, 4, 2, 8, 9};

		int max = getMax(arr);
		System.out.println("max = "+max);

		 max = getMax_2(arr);
		System.out.println("max = "+max);

		int min = getMin(arr);
		System.out.println("min = "+min);

		System.out.println("Hello World!");
	}
}
