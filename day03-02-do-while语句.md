# do-while语句

```java
/*
do
{
    执行语句;
} while (条件表达式);

do while特点是是条件无论是否满足，循环体至少被执行一句
*/

class Test
{
    public static void main
    {
        int x = 1;
         do
         {
             System.ouot.println("do : x =" + x);
             x++;
         } while(x<3)
    }
}
```

## while 和 do while的区别

---

while ：先判断条件，只有当条件满足的情况下才执行循环体

do while ：先执行循环体，再判断条件，条件满足时，又再一次执行循环体

简单一句话：do while：无论条件是否满足，循环至少执行一次

```java
class Test 
{
    public static void main(String[] args)
    {
        int x = 1;
        while(x<3)
        {
            System.out.println("x =" + x);
            x++;
        }
		
        System.out.println("-----------------------------------------------------);
		
        int y = 1;
        do
        {
            System.out.println(" do_while: y =" + y);
            y++;
        } while(y<0);
		
		while(y<0)
		{
			System.out.println(" whlie : y =" + y);
		}
    }
}
                           
/*
   打印输出：
   			x =1
			x =2
     -----------------------------------------------------
 			do_while: y =1
*/
```

