# for嵌套

 ```java
                //语句嵌套形式，其实就是语句中还有语句
                //循环嵌套
class Test
{
    public static void main(String[] args)
    {
        for(int x=0; x<3; x++)
        {
            for(int y=0; y<4; y++)
            {
                System.out.println("ok");
            }
            System.out.println();//只有一个功能 就是换行
        }
    }
}
/*
	对于打印的长方形：
	               外循环控制的行数。内循环控制的是每一行的列,也  	   			   就是一行元素中的个数
*/
 ```

```java
   /*
     *****
     ****
     ***
     **
     *
     发现图形有很多行，每一行有很多列。
     要使用循环嵌套。原理：毕向东形象说法：大圈套小圈
   */
class Test
{
    public static void main(String[] args)
    {
        for (int x=0; x<5; x++)//x<5:因为外循环控制行数，一共5行
        {
            int z = 5
        	for (int x=0; x<5; x++)
            {
                for (int y=0; y<z; y++)
                {
                    System.out.print("*");
                    y--;
                }
                System.out.println();
                z--;
            }
            System.out.println();
            System.out.println("打印成功");
        }
    }
}
```

```java
/*
	     *
         **
         ***
         ****
         *****
*/
class Test
{
    public static void main(String[] args)
    {
        for (int x=0; x<5; x++)
        {
            for (int y=0; y<=x; y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
	不是规律的规律：
					尖朝上，可以改变条件。让条件随着外循环变化
					尖朝下，可以改变初始值，让初始值随着外循环变化

	打印输出：
			*
            **
            ***
            ****
            *****
*/
```

```java
/*
		打印：
			1
			12
			123
			1234
			12345
*/
class Test
{
    public static void main(String[] args)
    {
        for (int x=1; x<=5; x++)
        {
            for (int y=1; y<=x; y++)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
/*
	打印出：
			1
			12
			123
			1234
			12345
*/
```



