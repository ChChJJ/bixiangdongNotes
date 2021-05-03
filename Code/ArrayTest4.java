/*
	����Ĳ��Ҳ���

	��ϰ����һ����������飬��Ҫ��һ��Ԫ�ز���������
	      ��Ҫ��֤������������ģ���˼���ǣ���λ�ȡ��Ԫ���������е�λ�ã�
	����ϰûд��
*/
class  ArrayTest4
{
	public static void main(String[] args) 
	{
		/*
		int[] arr = {3,2,1,5,4,2,9};
		int index = getIndex(arr,2);
		System.out.println("index="+index);
		*/

		int [] arr = {2,3,4,6,7,32,54,66};

		int index = halfsearch(arr,32);
		System.out.println("index="+index);

		 index = halfsearch_2(arr,32);
		System.out.println("index="+index);
	}
	/*
		�۰���ҡ��������Ч�ʣ���ǰ���������������
	*/
	public static int halfsearch(int [] arr, int key)
	{
		int min,max,mid;
		min = 0;
		max = arr.length-1;
		mid = (min+max)/2;

		while(arr[mid] != key)
		{
			if (key>arr[mid])
			{
				min = mid + 1;
			}
			else if(key<arr[mid])
				max = mid - 1;

			if (min>max)
			{
				return -1;
			}

			mid = (min+max)/2;
		}
		return mid;
	}
	/*
		�۰�ĵڶ��ַ�ʽ
	*/
	public static int halfsearch_2(int [] arr, int key)
	{
		int min = 0, max = arr.length-1, mid;

		 while (min<=max)
		 {
			 mid = (min+max)>>1;  //>>�ȼ���/2

			 if (key>arr[mid])
			 {
				 min = mid + 1;
			 }
			 else if (key<arr[mid])
			 {
				 max = mid - 1;
			 }
			 else 
				 return mid;
		 }
		 return -1;
	}



	//���幦�ܣ���ȡkey��һ�γ����������λ�á����������-1�������Ÿ�key�������в�����
	public static int getIndex(int [] arr, int key)
	{
		for (int x=0; x<arr.length; x++)
		{
			if (arr[x] == key)
			{
				return x;
			}
		}
		return -1; //����Ǳ궼�Ǵ�0��ʼ�����������������Ǳ��ǲ����ڵġ�û���ҵ����ø��������Ų����ڵ�Ҳ���Ǵ��������������
	}
}
