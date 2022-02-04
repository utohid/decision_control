import java.util.Scanner;

public class find_arry_index 
{
    public static void main(String[] args) 
    {
        int[] arry={12,23,4,67,32,25};
        Scanner sr=new Scanner(System.in);

        System.out.print("Elements are :  ");
        for (int i=0; i< arry.length;i=i+1)
        {
            System.out.print(" "+arry[i]);
        }
        System.out.println("\nEnter index number");
        int index=sr.nextInt();

        for (int i=0;i< arry.length;i++)
        {
            if (i==index)
            {
                System.out.println("Index  is matched "+ i +" number is : "+arry[i]);
                break;
            }
            else if (index>= arry.length)
            {
                System.out.println("Array index out of bound Exception   ....");
                break;
            }
        }


    }
}
