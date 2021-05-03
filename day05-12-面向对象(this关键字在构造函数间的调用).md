# 面向对象(this关键字在构造函数间的调用)

```java
/*
	this语句：用于构造函数之间进行相互调用
			  构造函数间调用只能使用 this语句（用的时候记得要传相应的参数）
	【注意事项】
			this语句只能定义在构造函数的第一行。
			因为初始化要先执行。
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
		//this.name = name;
		this(name);  //this语句
		//p(name)
		this.age = age;
	}
}

class PersonDemo4 
{
	public static void main(String[] args) 
	{
		Person p = new Person("LiSi", 30);
	}
}
```

