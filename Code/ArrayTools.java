/*
	静态的应用

	每一个应用程序中 都有一个共性的功能
	可以将这些功能进行抽取，独立封装，以便复用

	虽然可以通过建立ArrayTools的对象使用这些工具方法，对数组进行操作，
		发现了问题：
				1、对象是用来封装数据的，可ArrayTools对象并未封装特有数据
				2、操作数组的每一个方法都没有用到ArrayTools对象中的数据。
		这时就考虑，为了程序更严谨，是不需要对象的。
		可以将ArrayTools中的方法都定义成 static（静态）的，通过类名调用给即可

		将方法都静态后可以方便使用，但是该类还是可以被其他程序建立对象
		为了更加严谨，可以强制让该类禁止建立对象
		可以通过将构造函数私有化完成
*/

/*
  		接下来，将ArrayTool.class文件发送给其他人，其他人只要将该文件设置到
  	classpath路径下就可以使用该工具类了。但遗憾的是，该类中到底定义了多少个方法，
  	对方不清楚，因为该类没有使用说明书
   		
   		开始制作程序的说明书：Java的说明书通过文档注释来完成。 	 
 	通常是对类的描述信息

 */


/**
 * 
 * 这是一个可以对数组进行操作的工具类，该类中提供了：获取最值、排序等功能
 * @author 李白喝酒不写诗	 
 * @version java version "14.0.1" 2020-04-14
 * 
 * */

//要向将一个类生成帮助文档的话，这个类就必须是用public修饰。
	public class ArrayTools
	{
		//一个类定义好后就默认会有一个空参数
		//ArrayTools() {}


		/**
		 * 
		 * 空参数构造函数
		 * 
		 * */
		private ArrayTools(){}
		
		// 凡是public的修饰符的功能，都用文档注释描述，因为都可以被文档注释工具所提取
		/**
		 * 
		 * 获取一个整型数组中的最大值
		 * @param(参数) arr 接收一个int类型的数组
		 * @return 	会返回该数组中的最大值
		 * 
		 * */
		public static int getMax(int [] arr)
		{
			int max = 0;
			for (int x=1; x<arr.length; x++)
			{
				if (arr[x]>arr[max])
				{
					max = x;
				}
			}
			return arr[max];
		}

		/**
		 * 
		 * 获取一个整型数组中的最小值
		 * @param arr 接收一个int类型的数组
		 * @return 	会返回该数组中的最小值
		 * 
		 * */
		public static int getMin(int [] arr)
		{
			int min = 0;
			for (int x=1; x<arr.length; x++)
			{
				if (arr[x]<arr[min])
				{
					min = x;
				}
			}
			return arr[min];
		}

		/**
		 * 
		 * 给int数组进行排序。
		 * @param arr 接收一个int类型的数组
		 * 
		 * */
		public static void selectSort(int [] arr )
		{
			for (int x=0; x<arr.length-1; x++)
			{
				for (int y=x+1; y<arr.length-1; x++)
				{
					if (arr[x]>arr[y])
					{
						swap(arr,x,y);
					}
				}
			}
		}

		/**
		 * 
		 * 给int数组进行冒泡排序。
		 * @param arr 接收一个int类型的数组
		 * 
		 * */
		public static void bubbleSort(int [] arr) 
		{
			for (int x=0; x<arr.length-1; x++)
			{
				for (int y=0; y<arr.length-x-1; y++)
				{
					if (arr[y]>arr[y+1])
					{
						swap(arr,y,y+1);
					}
				}

			}
		}
		

		/**
		 * 
		 * 给数组中的元素进行位置的置换
		 * @param arr 	接收一个int型的数组
		 * @param a 	要置换的位置
		 * @param b 	要置换的位置
		 * 
		 * */		//文档当中体现的是准备想要向外秒暴漏的内容，私有的是不会显示即使是写了文档注释
		private static void swap(int[] arr, int a, int b)
		{
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}

		/**
		 * 
		 * 用于打印数组中的元素。打印形式：[element1, element2, ...]
		 * 
		 * */
		public static void printArray(int[] arr)
		{
			System.out.print("[");
			for (int x=0; x<arr.length; x++)
			{
				 if (x!=arr.length-1)
				 {
					 System.out.print(arr[x] + ",");
				 }
				 else{
					System.out.println(arr[x] + "]");
				 }
			}
		}
	}
  
  /*
		一个类中默认会有一个空参数的构造函数
	这个默认的构造函数的权限和所属类一致。如果类被public修饰，那么默认的构造函数也带public修饰符。
	如果没有被public修饰，默认的构造函数也没有public修饰

	默认的构造函数的权限是随着类的变化而变化
  */