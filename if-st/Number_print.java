import java.util.Scanner;

public class Number_print {
    public static void main(String args[])
    {
        int number;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any single digit Number");
        number=sc.nextInt();

        switch(number)
        {
            case 1 :
                System.out.println("one");
                break;
            case 2 :
                System.out.println("two");
                break;

            case 3 :
                System.out.println("Three");
                break;
            case 4 :
                System.out.println("Four");
                break;
            case 5 :
                System.out.println("five");
                break;
            case 6 :
                System.out.println("six");
                break;
            case 7 :
                System.out.println("seven");
                break;
            case 8 :
                System.out.println("eight");
                break;
            case 9 :
                System.out.println("Nine");
                break;
            case 10 :
                System.out.println("Ten");
                break;
            case  0 :
                System.out.println("Zero");
                break;
            default :
                System.out.println("invalid  number  " +"\n"+"So.... pls enter valid number");

        }
    }
}
