/*
	1、定义一个功能，用于打印矩形
*/

class FunctionTest
{
	public static void main(String[] args)
	{
		Enter();
		draw(5,6); //打印宽和长为别为5和6的矩形

		Enter();
		draw(3,7); //打印宽和长分别为3和7的矩形
	} 

	/*
		定义一个功能，用于打印矩形
		思路：
			  1、定义函数。确定结果：没有，因为直接打印。所以返回值类型为void
			  2、有未知内容吗？ 有，两个 ———— 矩形的长和宽不确定

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
	2、定义一个打印99乘法表功能的函数
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

