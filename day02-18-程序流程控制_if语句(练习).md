# if语句练习

```java
//练习1：根据用户定义的数值不同。打印对应的星期英文

class Test
{
    public static void main(String[] args)
    {
        int day = 2;
        
        if(day == 1)
        {
            System.out.println("Monday");
        }
        else if(day == 2)
        {
            System.out.println("Tuesday");
        }
        else if(day == 3)
        {
            System.out.println("Wednesday");
        }
        else if(day == 4)
        {
            System.out.println("Thursday");
        }
        else if(day == 5)
        {
            System.out.println("Friday");
        }
        else if(day == 6)
        {
            System.out.println("Saturday");
        }
        else if(day == 7)
        {
            System.out.println("Sunday");
        }
        else  
        {    //当用户输入1——7以外的数时，输出 Error
            System.out.println("Error");
        }
        System.out.println("Hello world");
    }
}
```

```java
//练习2：根据用户指定的月份，打印输出月份所属的季节
//3、4、5：春季   6、7、8：夏季   9、10、11：秋季   12、1、2：冬季
class Test
{
    public static void main(String[] args)
    {
		int x = 1;
		
        if(x==3 || x==4 || x==5)
        //用两个|原因是，此判断语句满足前面就不用再判断后面的语句了
        {
          System.out.println(x + "春季");   
        }
        else if(x==6 || x==7 || x==8)
        {
            System.out.println("x + 夏季");
        }
        else if(x==9 || x==10 || x==11)
        {
            System.out.println("x + 秋季");
        }
        else if(x==12 || x==1 || x==2)
        {
            System.out.println("x + 冬季");
        }
        else
        {
            System.out.println("Error"x + "，月份不存在，请输入区间为[1，12]的任意一个数字");
        }
    }
}

方法二：
    class Test
{
    public static void main(String[] args)
    {
		int x = 1;
		           
        if(x>12 || x<1) //先对数据进行判断，排除不合规的数据
            System.out.println(x + "月份不存在");
        else if(x>=3 && x<=5)
        {
            System.out.println(x + "春季");   
        }
                else if(x>=6 && x<=8)
        {
            System.out.println(x + "夏季");   
        }
                else if(x>=9 && x<=11)
        {
            System.out.println(x + "秋季");   
        }
        else
        {
            System.out.println(x + "冬季");   
        }
    }
}
    
```

