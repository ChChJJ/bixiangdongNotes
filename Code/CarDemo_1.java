//		匿名对象

class CarDemo_1 
{

	public static void main(String[] args) 
	{
//		Car qiche = new Car();
//		c.num = 5;    这两句话可以简化成
		
		/*
		new Car().num = 5;
		new Car().color = "blue";
		new Car().run();


		Car c = new Car();
		
		c.run();
		c.nun = 4;
		new Car().run();
		*/

/*			
	匿名对象使用方式一：
						  当对对象的方法只调用一次时，可以用匿名对象来完成，这样写比较简化
						  如果对一个对象进行多个成员调用，必须给这个对象起名字。
	匿名对象使用方式二：
						  可以将匿名将对象作为实际参数进行传递
*/

		Car q = new Car();
		show(q);
	}
	//需求：汽车修配厂。对汽车进行改装，将来的车都改成黑色、三个轮胎
	public static void show(Car c)
	{
		c.num = 3;
		c.color = "black";
		c.run();
	}
}
