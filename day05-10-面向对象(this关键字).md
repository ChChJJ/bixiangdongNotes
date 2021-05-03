# 面向对象(this关键字)

```java
/*
	this关键字：看上去是用于区分局部变量和成员变量同名情况
	this为什么能解决这个问题呢？
	this到底代表的是什么呢？
		this：就代表本类的对象，到底代表哪一个呢？
		this代表它所在函数所属对象的引用
	简单说：哪个对象在调用this所在的函数，this就代表哪个对象		
*/
class Person3
{
	private String name; 
	private int age;
    
    Person3(String name)
    {
        this.name = name;
    }

	Person3(String n, int a)
	{
		this.name = name;
		this.age = age;
	}

	public void speak()
	{
		System.out.println("name = " + this.name + ", age = " + this.age);
		show();
	}
	public void show()
	{
		System.out.println(this.name);
	}
}

class PersonDemo3
{
	public static void main(String[] args)
	{
        Person p = new Person("李四");   
		Person p1 = new Person("LiSi");
		p.speak();
		p1.speak();
		//p.speak(); 
	} 
}
```

