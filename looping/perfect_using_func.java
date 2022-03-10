public class perfect_using_func {

    public static boolean isperfect(int num)
    {
        int sum=0;
        for (int i=1;i<num;i++)
        {
            if (num%i==0)
                sum=sum+i;
        }
        if (sum==num)
            return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        int n=8;
        if (isperfect(n))
        {
            System.out.println("Number is perfect number ");
        }
        else
            System.out.println("Not a perfect number ");

    }
}
