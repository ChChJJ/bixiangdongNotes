/*
	private:私有，权限修饰符，用于修饰类中的成员（成员变量和成员函数）
	私有：只在本类中有效

	将age私有化后，类以外即使建立了对象也不能访问。
	但是人是有年龄的，就需要在Person类中提供对应的访问 age方式

	【注意】：私有仅仅是封装的一种表现形式

	之所以对外提供访问方式，就因为可以在访问方式中加入逻辑判断等语句。
	对访问的数据进行操作，提高代码的健壮性
*/

class Person
{
	private int age;

	public void setAge(int a)   //setAge函数在调用下面的 getAge函数
	{
		if (a>0&&a<130)
		{
			age = a;
			speak();
		}
		else
			Syst em.out.println("请输入正确的年龄");
		 age = a;
	}

	public int getAge()
	{
		return age;
	}

	void speak()
	{
		System.out.println("age = "+age);
	}
}
 
class PersonDemo 
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		 
//		p.age = 20;
		p.setAge(-40);

//      p.speak();
	}
}
