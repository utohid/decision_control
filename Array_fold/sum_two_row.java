import java.util.Scanner;

public class sum_two_arry {
    public static void main(String args[])
    {
        int[][] arry=new int[3][3];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        for (int i=0;i<arry.length;i++)
        {
            for (int j=0;j<arry.length;j++)
            {
                arry[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<arry.length;i++)
        {

            for (int j=0;j<arry.length;j++)
            {
                sum=sum+arry[i][j];
                System.out.print(arry[i][j]+" ");
            }
            System.out.print(" = "+sum);
            System.out.println();
            sum=0;
        }
    }
}
