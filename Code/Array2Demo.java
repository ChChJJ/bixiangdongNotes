class Array2Demo 
{
	public static void main(String[] args) 
	{
		//int [] arr = new int[3]; //һά����
/*
		int[][] arr = new int [3][4]; //������һ������Ϊ arr�Ķ�ά���顣��ά�������� 3��һά���飨��ά����ĳ��ȣ�
									  //ÿһ��һά�������� �ĸ�Ԫ��  ����ά������ÿһ��һά����ĳ��ȣ�
		System.out.println(" arr[0][1] = " + arr[0][1]);
*/



			//����������
/*
		int[][] arr = new int[3][];
      //System.out.println(arr[0]);   Ĭ�ϳ�ʼ��ֵ

		//�Զ�ά������ÿһ��һά��������ֶ���ʼ��ֵ
		arr[0] = new int[3];
		arr[1] = new int[1];
		arr[2] = new int[2];


		System.out.println("��ά����ĳ����ǣ�" + arr.length);  //��ӡ��ά����ĳ��ȣ�3
		System.out.println("��ά�����е�һ��С����ĳ��ȣ�" + arr[0].length);  //��ӡ��ά�����е�һ��һά����ĳ���

*/
		int[][] arr = {{3,5,1,7},{2,3,5,8},{6,1,8,2}};  //��Ȧ��СȦ��ѭ��Ƕ��
		
		int sum = 0;
		for (int x=0; x<arr.length; x++)
		{
			for (int y=0; y<arr[x].length; y++)
			{
				sum += arr[x][y];
			}
		}
		System.out.println("sum = " + sum);
	}
}
