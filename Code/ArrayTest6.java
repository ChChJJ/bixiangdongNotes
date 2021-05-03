class ArrayTest6 
{
	public static void main(String[] args) 
	{
		toHex(60);
	}

	
	/*
		0 1 2 3 4 5 6 7 8 9 A  B  C  D  E  F ==ʮ�������е�Ԫ�ء�
		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15

		����������е�Ԫ����ʱ�洢������������Ӧ��ϵ
		        ÿһ�� &15���ֵ��Ϊ����ȥ�齨���õı��Ϳ����ҵ���Ӧ��Ԫ�ء�
				�����ͱ� -10+'a'�򵥵Ķ�
		
		��ν������ű��أ�
		    ����ͨ���������ʽ������

	    ����ʹ��ѧϰ��������������������ɴ洢��
	*/

	public static void toHex(int num)
	{
		char[] chs = {'0','1','2','3',
					  '4','5','6','7',
					  '8','9','A','B',
					  'C','D','E','F'}; 

		//����һ����ʱ������
		char[] arr = new char[8];  //�ַ��������ڴ��б�����Ĭ���� '\u0000',����һ����λ���൱��һ���ո�
		int pos = arr.length;
		
		while (num != 0)
		{
			int temp = num & 15;

		   //System.out.println((chs [temp]));
			
		    arr[--pos] =chs[temp];

			num = num >>> 4;
		}

		System.out.println("pos = "+pos);
		System.out.print("60��ʮ�������ǣ�");
		//�洢���ݵ�arr�������
		for (int x=pos; x < arr.length; x++)
		{
			System.out.print(arr[x]);
		}
	}
}
