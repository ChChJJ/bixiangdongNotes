/*
	1������һ�����ܣ����ڴ�ӡ����
*/

class FunctionTest
{
	public static void main(String[] args)
	{
		Enter();
		draw(5,6); //��ӡ��ͳ�Ϊ��Ϊ5��6�ľ���

		Enter();
		draw(3,7); //��ӡ��ͳ��ֱ�Ϊ3��7�ľ���
	} 

	/*
		����һ�����ܣ����ڴ�ӡ����
		˼·��
			  1�����庯����ȷ�������û�У���Ϊֱ�Ӵ�ӡ�����Է���ֵ����Ϊvoid
			  2����δ֪������ �У����� �������� ���εĳ��Ϳ�ȷ��

	*/
	public static void draw(int row, int col)	
	{
		for(int x=0; x<row; x++)
		{
			for(int y=0; y<col; y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void Enter()
	{
		System.out.println();
	}
}  
//=======================================================================

/*
	2������һ����ӡ99�˷����ܵĺ���
*/
class FunctionTest
{
	public static void main(String[] args)
	{
		print99();
	} 
	public static void print99()	
	{
		for(int x=1; x<=9; x++)
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print( y+"*"+x+"="+x*y+"\t" );
			}
			System.out.println();
		}
	}

}  

