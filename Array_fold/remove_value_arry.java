import java.util.Scanner;

public class Remove_value_arry {
    public static void main(String args[])
    {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter array element");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("Element's are : ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("\nEnter the number you have to remove ");
        int remv=sc.nextInt();

        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==remv)
            {
                for (int j=i;j<arr.length-1;j++)
                {
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        System.out.print("after remove elements are : ");
        for (int i=0;i<arr.length-1;i++)
        {
            System.out.print(" "+arr[i]);
        }


    }
}
