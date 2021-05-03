# switch语句



格式：

```java
switch(表达式){
	case 取值1;
        执行语句;
        break;
    case 取值2;
        执行语句;
        break;
        .....
}
```



---

## switch语句特点

1. switch语句选择的类型有五种：byte、short、int、char，jkd1.7新增了String语句，【jdk1.5，支持了枚举】
2. case之间与default没有顺序。先执行第一个case，没有匹配的case 执行default
3. 结束 switch 语句的两种情况：遇到break，执行 switch 语句结束
4. 如果匹配的case或者default没有对应的break，那么程序会继续向下执行，运行可以执行的语句，直到遇到break 或者switch 结尾结束



---



```java
class Test
    {
        public static void main (String [] args)
        {
            int x = 2;
            
    		switch (x)
            /*
               被选择的表达式的值只接受以下类型：
               byte、short、int、char，从JDK1.7开始，switch支持		        String类型（jdk1.5，支持了枚举）
            */
            {
                case 4:
                    System.out.println ("a"); 
                    break; 
                case 6:
                    System.out.println("b");
                    break; 
                case 2:
                    System.out.println("c");
                    break; 
                default:
                    System.out.println ("d"); 
                   
                    
            }
            System.out.println ("Hello World!");
/*            
      演示二：     
           int a=4,b =2;
            char ch = '+';
            switch (ch)
            {
                case'-':
                    System.out.println (a-b);
                    break; 
                case'+':
                    System.out.println (a+b);
                    break; 
                case '*':
                    System.out.println (a*b);
                    break;
                case '/':
                    System.out.println (a/b);
                    break;
                default:  （当然default语句也可以放在最前面）
                    System.out.println("非法字符，请重新输入");
                
*/ 
             }
    }	
}
```


