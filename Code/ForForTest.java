

class For
{
	public static void main(String[] args) 
	{
		 /*
			 *
			 **
			 ***
			 ****
			 *****

			 ���ǹ��ɵĹ��ɣ�
			 			�⳯�ϣ����Ըı�������������������ѭ���仯���仯��
						�⳯�£����Ըı��ʼ��ֵ���ó�ʼ��ֵ������ѭ���仯���仯
		 */

		 for (int x=0; x<5; x++)
		 {
			 for (int y=0; y; y)
			 {
				 System.out.print("*");
				 }
			 System.out.println();
		 }


		 

		 /*
			��ӡ��
				1
				12
				123
				1234
				12345
		*/
		for (int x=1; x<=5; x++)
        {
            for (int y=1; y<=x; y++)
            {
                System.out.print(y);
            }
            System.out.println();
        }

	}
}