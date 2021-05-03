

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

			 不是规律的规律：
			 			尖朝上，可以改变条件。让条件随着外循环变化而变化，
						尖朝下，可以改变初始化值，让初始化值随着外循环变化而变化
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
			打印：
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