# switch(练习)

```java
/*
		if和 switch 语句很像。
		具体什么场景下使用什么语句呢？
		如果判断的具体数值不多且符合byte、short、int、char、String类型，虽然两个语句都可以使用建议使用switch语句，因为效率稍高
		其他情况：对于区间判断对结果为Boolean类型判断使用if，if使用范围更广
*/
```

```java
/*
	练习2 ：根据用于指定月份,打印该月份所属的季节。
	 3,4,5 春季 6.7.8 夏季 9.10.11 秋季 12.1, 2 冬季
*/

class Test
{
    public static void main(String[] args)
    {
        int x = 4;
        
        switch(x)
        {
            default:
                System.out.println("Error,请输入月份");
 
            case 3:
            case 4:
            case 5:
                System.out.println(x +":" + "春季");
                break;
            
            case 6:
            case 7:
            case 8:
                System.out.println(x +":" + "夏季");
                break;
                
            case 9:
            case 10:
            case 11:
                System.out.println(x +":" + "秋季");
                break;
                
            case 12:
            case 1:
            case 2:
                System.out.println(x +":" + "冬季");
                break;
                      
        }
        System.out.println("hello world");
    }
}

```



当需要对具体数值进行判断，且数值量不大 就是***优先使用switch***。

其余情况使用if语句