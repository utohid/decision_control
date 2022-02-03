import java.util.Scanner;

public class Avg_of_arry_element {
    public static void main(String args[])
    {
        int total_sum=0;
        int[] arry=new int[5];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the element of array");
        for (int i=0;i< arry.length;i+=1)
        {
            arry[i]=sc.nextInt();
        }
        System.out.print("Elements aree : ");
        for (int i=0;i< arry.length;i++)
            System.out.print(arry[i]+",");

        for (int i=0;i<arry.length;i++)
        {
             total_sum= total_sum+arry[i];

        }

        double avg= total_sum/arry.length;

        System.out.println("\nTotal average is : "+avg);
    }
}
