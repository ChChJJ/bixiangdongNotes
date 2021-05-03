# while语句

**while语句格式：**

```java
/*
while (条件表达式)                 
{
    执行语句后;
}
*/
class Text{
    pubic static void main(String[] args)
    {
        int x = 1;
       
        /*
          定义初始化表达式
          while(条件表达式)
          {
              循环体(执行语句);
          }
        */
        while(x<3)  //记得要控制条件
        { 
            System.out.println("x = " + x);
            x++;//定义循环次数，否则会死循环
        }
    }
}

打印所有100以内的所有奇数
    class Test
    {
        public static void main(String[] args)
        {
            int x = 1;
            while(x<=100)
            {
                System.out.println("x =" + x);
                x += 2;
                /*
                   也可以写成：x++;
                    	     x++;
                */
            }
        }
    }
```

