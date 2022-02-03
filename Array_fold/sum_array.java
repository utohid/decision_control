import java.util.Scanner;

public class sum_array {
    public static void main(String[] args)
    {
        int[] array=new int[5];int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array number");
        for (int i=0;i<5;i++)
        {
            array[i]=sc.nextInt();
        }
        for (int i=0;i<5;i++)
        {
            sum=sum+array[i];
        }
        System.out.println("The sum of array is : "+sum);

    }
}
