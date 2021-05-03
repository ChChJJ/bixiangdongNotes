# final关键字

final：最终。作为一个修饰符

> - final可以修饰类、方法、变量。
> - final修饰的类不可以被继承
> - final修饰的方法不可以被覆盖（重写）
> - final修饰的变量是一个常量。只能被赋值一次
> - 内部类只能访问被final修饰的局部变量

```java
/*
    final：最终。作为一个修饰符
        被final修饰的类叫最终类，最终类不能有子类继承（相当与被绝育）
        为了避免被继承，被子类重写（复写）功能，被final修饰的类不能被继承。

    被final修饰的变量是一个常量只能被赋值一次既可以修饰成员变量，也可以修饰局部变量

    当描述事物时，一些数据的出现值是固定的，为了增强阅读性，都给这些值取个名字，方便阅读
        而这个值不需要改变，所以就给这个值加上final修饰(相当于C语言中的#define)。
        作为常量，常量书写规范所有字母都大写，如果包含多个单词，每个单词件用下划线分隔

    内部类定义在类中的局部位置上时，只能访问该局部被final修饰的局部变量

 */

package Day7;

final class Test{}
class Test1{
    final int x = 43; //被final修饰后，x就终身为43，变成一个常量，不能再被更改
    final void show(){}
    void show1(){

    }

    public static final double PI_= 3.1415926;//全局静态常量，此常量的权限足够大。可以通过类名来访问
    final double PI= 3.1415926;
    void show2(){
        System.out.println(PI);
    }
}
class subTest extends Test1{
    //void show(){}  错误，被final修饰的类不能被重写
    void show1(){

    }
}


public class FinalDemo {
    public static void main(String[] args) {
        System.out.println("HelloTest");
    }
}

```





































