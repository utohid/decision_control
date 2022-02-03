import java.util.Scanner;

public class array_input {
    public static void main(String[] args)
    {
        int num;
        int [] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array number we have to input");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("the array is "+arr[i]);
        }

    }
}
