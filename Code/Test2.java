class FunctionDemo
{
	public static int getResult (int num)
	{
		return num * 3 + 5;
	}

	public static void main(String[] args) 
	{
		int x = getResult(4);
		System.out.println("x ="+x);
	}
}
