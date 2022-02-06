import java.util.Scanner;

public class remove_index {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the element : ");
        for (int i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the index you want to remove : ");
        int remv=sc.nextInt();

        for (int i=0;i< arr.length-1;i++)
        {
            if (arr[i]==remv)
            {
                arr[i]=arr[i+1];
            }

        }

        for (int i=0;i<arr.length-1;i++)
        System.out.println("after Remove the elements are : "+arr[i]);


    }
}
