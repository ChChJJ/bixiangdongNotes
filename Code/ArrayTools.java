/*
	��̬��Ӧ��

	ÿһ��Ӧ�ó����� ����һ�����ԵĹ���
	���Խ���Щ���ܽ��г�ȡ��������װ���Ա㸴��

	��Ȼ����ͨ������ArrayTools�Ķ���ʹ����Щ���߷�������������в�����
		���������⣺
				1��������������װ���ݵģ���ArrayTools����δ��װ��������
				2�����������ÿһ��������û���õ�ArrayTools�����е����ݡ�
		��ʱ�Ϳ��ǣ�Ϊ�˳�����Ͻ����ǲ���Ҫ����ġ�
		���Խ�ArrayTools�еķ���������� static����̬���ģ�ͨ���������ø�����

		����������̬����Է���ʹ�ã����Ǹ��໹�ǿ��Ա���������������
		Ϊ�˸����Ͻ�������ǿ���ø����ֹ��������
		����ͨ�������캯��˽�л����
*/

/*
  		����������ArrayTool.class�ļ����͸������ˣ�������ֻҪ�����ļ����õ�
  	classpath·���¾Ϳ���ʹ�øù������ˡ����ź����ǣ������е��׶����˶��ٸ�������
  	�Է����������Ϊ����û��ʹ��˵����
   		
   		��ʼ���������˵���飺Java��˵����ͨ���ĵ�ע������ɡ� 	 
 	ͨ���Ƕ����������Ϣ

 */


/**
 * 
 * ����һ�����Զ�������в����Ĺ����࣬�������ṩ�ˣ���ȡ��ֵ������ȹ���
 * @author ��׺ȾƲ�дʫ	 
 * @version java version "14.0.1" 2020-04-14
 * 
 * */

//Ҫ��һ�������ɰ����ĵ��Ļ��������ͱ�������public���Ρ�
	public class ArrayTools
	{
		//һ���ඨ��ú��Ĭ�ϻ���һ���ղ���
		//ArrayTools() {}


		/**
		 * 
		 * �ղ������캯��
		 * 
		 * */
		private ArrayTools(){}
		
		// ����public�����η��Ĺ��ܣ������ĵ�ע����������Ϊ�����Ա��ĵ�ע�͹�������ȡ
		/**
		 * 
		 * ��ȡһ�����������е����ֵ
		 * @param(����) arr ����һ��int���͵�����
		 * @return 	�᷵�ظ������е����ֵ
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
		 * ��ȡһ�����������е���Сֵ
		 * @param arr ����һ��int���͵�����
		 * @return 	�᷵�ظ������е���Сֵ
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
		 * ��int�����������
		 * @param arr ����һ��int���͵�����
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
		 * ��int�������ð������
		 * @param arr ����һ��int���͵�����
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
		 * �������е�Ԫ�ؽ���λ�õ��û�
		 * @param arr 	����һ��int�͵�����
		 * @param a 	Ҫ�û���λ��
		 * @param b 	Ҫ�û���λ��
		 * 
		 * */		//�ĵ��������ֵ���׼����Ҫ�����뱩©�����ݣ�˽�е��ǲ�����ʾ��ʹ��д���ĵ�ע��
		private static void swap(int[] arr, int a, int b)
		{
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}

		/**
		 * 
		 * ���ڴ�ӡ�����е�Ԫ�ء���ӡ��ʽ��[element1, element2, ...]
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
		һ������Ĭ�ϻ���һ���ղ����Ĺ��캯��
	���Ĭ�ϵĹ��캯����Ȩ�޺�������һ�¡�����౻public���Σ���ôĬ�ϵĹ��캯��Ҳ��public���η���
	���û�б�public���Σ�Ĭ�ϵĹ��캯��Ҳû��public����

	Ĭ�ϵĹ��캯����Ȩ����������ı仯���仯
  */