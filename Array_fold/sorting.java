import java.util.Scanner;

public class sorting {
    public static void main(String[] args)
    {
        int[] arr=new int[5];int temp;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number in array");
        for (int i=0;i<arr.length;i=i+1)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(" before sorting array : ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
        //arr[0]=
        for (int i=0;i< arr.length;i++)
        {
            for (int j=i+1;j< arr.length;j++)
            {
                if (arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("\n After sorting the array : ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }

    }
}
