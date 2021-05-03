# main函数

```java
/*
	public static void main(String[] args) 】
		主函数是一个特殊的函数，作为程序的入口可以被 JVM调用
			主函数的定义：
						public ：代表该函数的权限是最大的
						static ：代表主函数谁这类的加载就已经存在了
						void ：主函数没有具体的返回值
						main ：不是关键字，是特殊的单词，可以被JVM识别。
						(String[] arr) ：主函数的参数 ，参数类型是一个数组，数组中的元素是字符串 —— 字符串类型的数组

			主函数的格式是固定的，JVM识别。
			JVM在调用主函数时，传入的是 new String[0];     
*/

class MainDemo 
{					//args ——arguments ：参数
	public static void main(String[] args)   //Java虚拟机识别程序入口的唯一标识，这个函数里仅有变量名（args）可以改
	{
		System.out.println("args = " + args);   //args = [Ljava.lang.String; @72ea2f77(垃圾值)
		System.out.println("args.length = " + args.length);  //args.length = 0

		System.out.println("args[0] = " + args[0]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0 at MainDemo.main(MainDemo.java:21) 
													//角标越界
        
	}
	/*
	public static void main(int x)  //可以同时存在，函数的重载
	{
		x = 1;
		System.out.println("x = " + x);
	}
	*/
}
```



### 主函数传值

![主函数传值](https://i.niupic.com/images/2020/11/06/8XnG.png)

