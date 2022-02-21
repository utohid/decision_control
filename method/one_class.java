import java.util.Scanner;

public class sixten_prog_1_class {
    Scanner sc=new Scanner(System.in);
    public void smallest()
    {
        int num1,num2,num3;
        System.out.println("Enter the Three number");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        if (num1>num2 && num3>num1)
            System.out.println(num2+" is Smallest");
        else if (num2>num1 && num3>num2)
            System.out.println(num1+" is smallest");
        else if (num2>num3 && num1>num2)
            System.out.println(num3+" is smallest");
    }
    public void avgerage()
    {
        float n1,n2,n3;
        System.out.println("Enter the number ");
        n1=sc.nextFloat();
        n2=sc.nextFloat();
        n3=sc.nextFloat();
        float sum=n1+n2+n3;
        double avg=sum/3;
        System.out.println("The average of three number is : "+avg);
    }
    public void sum_digit()
    {
        int integer;int rem;int sum=0;
        System.out.println("Enter the number ");
        integer=sc.nextInt();
        int i=0;
        while (integer!=0)
        {
            rem=integer%10;
            sum=sum+rem;
            integer=integer/10;
        }
        System.out.println("Sum of the number is : "+sum);
    }
    public void vowel()
    {
        int count=0;
        System.out.println("Enter thr string : ");
        String str=sc.next();
        int i=0;
        while(i<str.length())
        {
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
                count++;
            i++;

        }
        System.out.println("Total number of viwel is : " + count);
    }
    public void leap_year()
    {
        int year;
        System.out.println("Eenter the year :");
        year=sc.nextInt();

        if (year % 400 == 0)
            System.out.println(year+ " This year is leap year");
        else if (year % 100 == 0)
            System.out.println(year+ " Not a leap year ");
        else if (year % 4 == 0)
            System.out.println(year + " This year is leap year ");
        else
            System.out.println(year+ " Not a leap year");
    }

    public static void main(String args[])
    {
        sixten_prog_1_class ob=new sixten_prog_1_class();
        ob.smallest();
        ob.avgerage();
        ob.sum_digit();
        ob.vowel();
        ob.leap_year();

    }
}
