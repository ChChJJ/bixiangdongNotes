class ArrayDemo
{
	public static void println()
	{
		System.out.println();
	}

	public static void main(String[] args)
	{
		//Ԫ������[] ������ = new Ԫ������ [Ԫ�ظ��������鳤��];

		//�����붨��һ�����Դ洢��������������
		int [] x = new int[3];


		//��ӡ����x�нǱ�Ϊ0��Ԫ�ص�ֵ
		System.out.println("x[0] = "+x[0]);
		//��ӡ����x�нǱ�Ϊ1��Ԫ�ص�ֵ
		System.out.println("x[1] = "+x[1]);   //int������Ĭ�ϳ�ʼ��ֵ��0
		println();

		x [0] = 59;   //�� x����� 0�Ǳ긳ֵ
		System.out.println("x[0] = "+x[0]);  //��� x���� 0�Ǳ��ֵ
	}
}