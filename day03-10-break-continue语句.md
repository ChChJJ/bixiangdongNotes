# break-continue语句

## 其他流程控制语句

```break-continue语句

break(跳出), continue(继续)
    break语句:应用范围:选择结构和循环结构。 
    continue语句:应用于循环结构。
【注】
		a,这两个语句离开应用范围,存在是没有意义的。 
        b,这个两个语句单独存在下面都不可以有语句,因为执行不到。 
        c, continue语句是结束本次循环继续下次循环。 
        d.标号的出现,可以让这两个语句作用于指定的范围。
```

```java
class Test
{
	public static void main(String[] args)
	{
		//break：标号名
		//标号，给循环起名字的一种方式
		w:for (int x=0; x<3; x++)
		{
			q:for (int y=0; y<4; y++)
			{
         	System.out.println(x);
				break w;
				//输出 0
			}
		}

		System.out.println("--------------------------------------");


		//continue：只能作用于循环结构,继续循环。特点：结束本次循环，继续下一次循环
		for (int x=1; x<=10; x++)
		{
			if ( x%2==1 )
			{
				continue;
			}
			System.out.println("x =" + x);
			//continue;  但这continue在for循环一步没有意义  
			//执行到这一步，继续回循环去，执行 x++
			//continue 单独存在的时候下面的语句全是废话，因为执行不到。会编译失败
		}

		System.out.println("-------------------------------------");
				
		w:for (int x=0; x<3; x++)
		{
			q:for (int y=0; y<4; y++)
			{
				        System.out.println(x);
				continue w;
			}
		}
		/*
			记住：
				1、break和continue语句作用的范围
				2、break和continue单独存在时，下面不可以有任何语句，因为都执行不到
		*/


		System.out.println("-------------------------------------");
	} 
}
```

