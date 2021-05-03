/*
	this关键字：看上去是用于区分局部变量和成员变量同名情况
	this为什么能解决这个问题？
	this到底代表的是什么呢？
		this：代表它所在函数所属对象的引用
			简单说：哪个对象在调用 this所在的函数， this就代表哪个对象

	this的应用：当定义类中的功能时，该函数内部要用到调用函数的对象时，这时就要用 this表示这个对象 
				但凡本类功能内部用到本类对象的时候用到 this关键字
		
*/
class Person	
{
	private String name; 
	private int age;
    
    Person(String name)
    {
        this.name = name;
    }

	Person(String name, int age)
	{
		this.name = name;
		this.age = age;	
	}

	public void speak()
	{
		System.out.println("name = " + this.name + ", age = " + this.age);
		show();  /*前面省略了 this.  写不写都可以，写出来就方便了阅读 */
	}
	public void show()
	{
		System.out.println(this.name);
	}



	/*
		需求：给人定义一个用于比较年龄是否相同的功能。也就是是否是同龄人

	*/
	Person(int age)
	{
		this.age = age;
	}
	public boolean compare(Person p)
	{
		return this.age == p.age;
	}
	
}

class PersonDemo3
{
	public static void main(String[] args)
	{
        //Person p = new Person("李四");   
		//Person p1 = new Person("LiSi");
		//p1.speak();
		//p.speak(); 

		Person p1 = new Person(20);
		Person p2 = new Person(28);
		boolean b = p1.compare(p2);
		System.out.println(b);
		
	} 
}