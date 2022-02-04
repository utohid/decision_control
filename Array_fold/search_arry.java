import java.util.Scanner;

public class searchItem {

    public static void main(String[] args) {

        int[] arr= {2,43,6,1,5,90};

        Scanner sc=new Scanner(System.in );

        System.out.println("Array is : ");
        for (int i=0;i< arr.length;i+=1)
        {

            System.out.print(arr[i]+",");
        }
        System.out.println("\nEnter the Item to be search ");
        int item=sc.nextInt();

        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==item)
            {
                System.out.print("\nItem found sucessfully");
            }

        }

    }
}
