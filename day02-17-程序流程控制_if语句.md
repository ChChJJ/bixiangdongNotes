# if 语句（单条语句）

## 格式（三种）

【注意】：如果 if 控制的语句只有一条，则 这个 { }  括号可以不写

1.   if (条件表达式)

   {

      执a行语句;

   }

   ```java
   class Test{
       public static void main(String[] args) 
       {
           int x =3;
           
           if(>2) //条件表达式为true，if控制的（{}内的）语句被				   执行 
           {   
               System.out.println("Yes!");
           }
           System.out.println("over");
           
         /*
           if(x>3) //显然条件表达式为false，if控制的
                    （{}内的）语句不会被执行 
           {
           	System.out.println("Yes!");
           }
           System.out.println("over");
           
           //只打印输出输出  “ over”
         */
       }
   }
   
   /*
   	打印输出：
   			Yes！
   			over
   */
   ```

   

2. if (条件表达式)

   {

      执行语句;

   }

   else

   {

      执行语句;

   }

   ```java
   class Test{
       public static void main(string[] args) 
       { 
           intx=1； 
           if(x>1) 
           {
               system.out.println("yes");
           } 
           else 
           {
             system.out.println("a");   
           } 
       } 
      /* 
       if else 结构简写格式：变量=(条件表达式)?表达式1:表达式2; 
        简写格式(三元运算符) 
         特点：
         	好处：可以简化 if else 代码
         	弊端：因为是一个运算符，所以运算完必须要有一个结果哦。		
      */ 
       int a = 9, b; 
       b=(a>1)?system.out.println("haha"):200; 
       if(a>1) 
           b=100;
       else 
           b=200; 
       system.out.println("over"); 
   }
   ```

   

3.   if (条件表达式)

   {

      执行语句;

   }

   else

   {

      执行语句;

   }

   ……

   else

   {

      执行语句;

   }
   
   ```java
   class Test{
       public static void main(string[] args) 
       { 
           intx=1； 
           if(x>1) 
           {
               system.out.println("yes");
           } 
           else if(x=1)
           {
              system.out.println("no"); 
           }
           else 
           {
             system.out.println("a");   
           } 
       } 
      /* 
       if else 结构简写格式：变量=(条件表达式)?表达式1:表达式2; 
        简写格式(三元运算符) 
         特点：
         	好处：可以简化 if else 代码
         	弊端：因为是一个运算符，所以运算完必须要有一个结果哦。		
      */ 
       int a = 9, b; 
       b=(a>1)?system.out.println("haha"):200; 
       if(a>1) 
           b=100;
       else 
           b=200; 
       system.out.println("over"); 
   }
   ```
   
   

