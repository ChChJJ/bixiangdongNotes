# for循环语句

## for语句执行步骤

![for语句执行步骤](https://i.niupic.com/images/2020/11/06/8XnK.jpg)

---

### 循环可以用冒号取名字

```java
class Test
{
	public static void main(String[] args)
	{
		//标号，给循环起名字的一种方式
		w:for (int x=0; x<3; x++)
		{
			q:for (int y=0; y<4; y++)
			{
				System.out.println(x);
				break w;
			}
		}
	} 
}
```

```java
格式：
    for(初始化表达式; 循环条件表达式; 循环后的操作表达式)
    {
        执行语句;
    }

【注意】
    1.for里面的连个表达式运行的顺序，初始化表达式只读一次，判断循环条件为true就执行循环体，然后再执行循环后的操作表达式，接着继续循环条件，重复这个过程，直到条件不满足为止
    
    2.while 与 for 可以互换，区别在于 for 为了循环而定义的变量在 for 循环结束就是在内存中释放。而while循环使用的变量在和循环结束后还可以继续使用
        
    3.最简单无限循环格式：while(true)，for(;;)，无限循环存在的原因是并不知道循环多少次，而是根据某些条件，来控制循环。
```

```java
class Test
{
    public static void main(String[] args)
    {
        for(int x = 0; x < 3; x++)
        {
            System.out.println("x =" + x);
        }
    } 
}
```

```java
class Test
{
    public static void main(String[] args)
    {
        int x = 3;
        for(; x < 3; x++)
        {
            System.out.println("x =" + x);
        }
        
        int y = 0;
        while( y<3 )
        {
            System.out.println("y =" + y);
            y++;
        }
    }
}
```

```java
/*
	1、变量有自己的作用域。对于 for 来讲：如果将要用于控制循  		环的增量定义在 for 语句中。那么该变量只在 for 语句内		  有效。for 语句执行完毕，该变量在内存中被释放
	2、for 和 while可以进行互换。如果需要定义循环增量。用	   for 更为合适
	
	总结：
	什么时候使用循环结构？
	当要对某些语句执行多次时，就是使用循环结构

*/
```

```java
class Test
{
    public static void main(String[] args)
    {
        int x = 1;
        for(System.out.println("a"); x<3; System.out.println("c"))
            System.out.println("d");
        // x++;
    }
    //输出：adcdc
    
    for(int y=0; y<3; y++)
    {
        
    }
}
/*
	无限循环的最简单表现形式
	for(; ; ){}
	
	while(true) {}
*/


```





