# for 累加&计数器

## 累加思想

原理：每次变化后的结果通过循环的形式。进行累加动作 

```java
/*
		获取1~10的和，并打印
*/

class Test
{
	public static void main(String[] args)
	{
		
		/*
		//1、定义变量用于存储不断变化的和;
		int sum = 0;

		//2、定义变量，记录住不断变化的被加的数
		int x = 1;

		//3、定义循环，重复加法的过程;
		while(x <= 10)
		{
			sum = sum +x;
			x++;
		}
		System.out.println("sum =" + sum);
		*/
		
		/*
		   【循环注意】
		   			要明确哪些语句需要参加循环，哪些不需要参加
		*/
		//用for循环写
		int sum = 0;
		for(int x=0; x <=10; x++)
		{
			sum += x;
		}
		System.out.println("sum =" + sum);
		
	}
}

```

---

## 计数器思想

原理：通过一个变量记录住数据的状态变化。也许通过循环完成。

```java
/*
		1~100之间 7的倍数的个数。并打印
	思路：
		  1、先对1~100进行循环（遍历）
		  2、在遍历过程中，定义条件。只对7的倍数进行操作
		  3、因为 7 的倍数不确定，只要符合条件，就通过定义一个变量来记录住这个变量变化的次数

    步骤：
		  1、定义循环语句，选择for语句
		  2、在循环中定义判断，只要是7的倍数即可。
		     使用 if 语句。条件：7的倍数 ：x % 7 ==0
		  3、定义变量，该变量随着 7 的倍数的出现而自增		                                         
*/
class Test
{
	public static void main(String[] args)
	{
		int count = 0;

		for(int x=1; x<=100; x++)
		{
			if(x%7==0)
				//System.out.println("x =" + x); 输出7的倍数
				count++;
		}
		System.out.println("count =" +count);
	}
}
```

