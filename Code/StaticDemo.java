
/*
	静态：static   是一个修饰符
			
	用法： 用于修饰成员(成员变量和成员函数)。被修饰后的变量就被单独提取物出来，不在堆内存当中
	当成员被静态修饰后，就多了一种调用方式除了可以被对象调用外，还可以直接被类名调用
		写法格式 ：类名.静态成员
	
	static特点：
		1、随着类的加载而加载
			也就是说静态会随着类的消失而消失，说明它的生命周期最长  【不建议过多定义静态变量】
		2、优先于对象存在
				静态是先存在，对象是后存在的
		3、被所有对象所共享
		4、可以直接被类名所调用

	实例变量和类变量的区别：
			1、存放位置
				类变量随着类的加载而存在与方法区中
				实例变量随着对象的建立而存放在堆内存中
			2、生命周期
				类变量声明周期最长，随着类的消失而消失
				实例变量的生命周期随着对象的消失而消失
	
	静态变量使用的注意事项：
			1、静态成员只能访问静态成员
				 非静态方法可访问静态成员（后边可以访问前面的），当然也可以访问非静态
			2、静态不可以出现this、super关键字
				 因为静态优先于对象存在。所以静态方法不可以出现this、super关键字
			3、主函数是静态的

	静态的利弊：
		利：对对象共享数据进行单独进空间的存储，节省空间，没有必要每个对象都存储一份，
			可以直接被类名调用
		弊：生命周期过长
			访问出现局限性（静态虽好只能访问静态）
*/

class Person{
	String name; //成员变量、实例变量

	//静态的成员变量，类变量
	static String country = "CN";  //变量进行修饰，修饰后的变量具备一些特殊含义

	public void show(){
		System.out.println(name);  //错误。这个静态方法访问的是对象的name，还没有对象，name在内存中跟本就不存在
	}
}

class StaticDemo 
{
	public static void main(String[] args) 
	{

		//Person p = new Person(); //在内存中开辟空间
		//p.name = "Wang";
		//p.show();
		//System.out.println(Person.country);

		Person.show();  
		/*
			StaticDemo.java:51: 错误: 无法从静态上下文中引用非静态 方法 show()
                Person.show();
		*/		

	}
}