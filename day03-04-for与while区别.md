# for与while区别



##### 1、变量有自己的作用域对 for来说：如果将用于控制循环的增量定义子啊 for语句中，那么该变量只在 for语句内有效。for语句执行完毕，该变量在内存中会被释放掉

##### 2、for和 while可以进行互换。如果需要定义循环增量。用 for更为合适。

```java
class ForDemo
{
	public static void main(String[] args)
	{
		/*
			for(初始化; 循环条件; 循环后操作表达式)
			{
				执行语句;
			}
		*/

		for (int x = 0; x<3; x++)  //括号里的x是局部变量
		{
			System.out.println("x  = " + x);  //x只为循环增量存在，循环结束后就没有意义
		}
		//System.out.println("x == " + x);  变量的作用域问题


		int y = 0;  //全局变量
		while (y<3)
		{
			System.out.println("y = " + y);
			y++;
		}
		System.out.println("y == " + y);  
		

		//如果变量只为循环增量存在的话用 for语句比较合适 ，内存会相对优化点
			//注意 for和 while可以互换，区别在于增量和变量在内存中的驻留时间不同
	}
}
```

#### 总结

``` 
什么时候使用循环结构？
当对某些语句执行很多次是就使用循环语句
```



