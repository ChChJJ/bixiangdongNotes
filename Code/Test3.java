public class Test3
{
    public static int getSum(int x, int y)
    {
        return x+y;
    }
    public static void main(String[] args)
    {
        int sum = getSum(5,3);
        System.out.println("sum = "+sum);

        sum = getSum(2,9);
        System.out.println("sum = "+sum);
    }
}
