import java.util.Scanner;

public class horoscope {
    public static void main(String args[])
    {
        int month;
        int day;
        Scanner scr=new Scanner(System.in);

        System.out.println("Enter the number of Month");
        month=scr.nextInt();
        System.out.println("Enter the day of the month");
        day=scr.nextInt();

        switch(month)
        {
            case 1 :
            {
                if (day>=20 && day<=31 )
                {
                    System.out.println("Zodiac sign for january"+" "+day+" is Aqarious");
                }
                else if(day<20)
                {
                    System.out.println("Zodiac sign for january"+" "+day+" is Capricorn");
                }
                else if (day>31)
                {
                    System.out.println("Invalid date so pls enter valid date ....");
                }
                break;
            }
            case 2 :
            {
                if (day >= 19 && day <= 28 )
                {
                    System.out.println("Zodiac sign for february"+" "+day+" is Pisces");
                }
                else if (day<=18)
                {
                    System.out.println("Zodiac sign for february"+" "+day+" is Aquares");
                }
                else if(day>28)
                {
                    System.out.println("Invalis date so pls enter valid date....");
                }
                break;
            }
           case 3 :
            {
                if (day >=21 && day <=31 || day <=19)
                {
                    System.out.println("Zodiac sign for march"+" "+day+" is Aries");
                }
                else if (day>31)
                {
                    System.out.println("Invalid date so pls enter valid date.... ");
                }
                break;
            }
            case 4 :
            {
                if (day>=20 && day <=30 || day<=20)
                {
                    System.out.println("Zodiac sign for April"+" "+day+" is Taurus");
                }
                else if(day >30 )
                {
                    System.out.println("Invalid date so pls enter valid date...");
                }
                break;
            }
            case 5 :
            {
                if (day>=21 && day<=31 || day<=20)
                {
                    System.out.println("Zodiac sign for may "+" "+day+" is Gemini");
                }
                else if (day>31)
                {
                    System.out.println("Invalid date so pls enter valid date ....");
                }
                break;
            }
            case 6 :
            {
                if (day>=21 && day<=30 || day<=22)
                {
                    System.out.println("Zodiac sign for june"+" "+day+" is Cancer");
                }
                else if (day>30)
                {
                    System.out.println("Invalid date so pls enter valid date ....");
                }
                break;
            }
            case 7 :
            {
                if (day>=23 && day<=31 || day<=22)
                {
                    System.out.println("Zodiac sign for july"+" "+day+" is Leo");
                }
                else if (day>31)
                {
                    System.out.println("Invalid date so pls enter valid date ....");
                }
                break;
            }
            case 8 :
            {
                if (day>=23 && day<=31 || day<=22)
                {
                    System.out.println("Zodiac sign for August"+" "+day+" is Virgo");
                }
                else if (day>31)
                {
                    System.out.println("Invalid date so pls enter valid date ....");
                }
                break;
            }
            case 9 :
            {
                if (day>=23 && day<=30 || day<=22)
                {
                    System.out.println("Zodiac sign for September "+" "+day+" is Libra");
                }
                else if (day>30)
                {
                    System.out.println("Invalid date so pls enter valid date ....");
                }
                break;
            }
            case 10 :
            {
                if (day>=23 && day<=31 || day<=21)
                {
                    System.out.println("Zodiac sign for October"+" "+day+" is Scorpio");
                }
                else if (day>31)
                {
                    System.out.println("Invalid date so pls enter valid date ....");
                }
                break;
            }
            case 11 :
            {
                if (day>=22 && day<=30 || day<=21)
                {
                    System.out.println("Zodiac sign for November"+" "+day+" is Sagittarius");
                }
                else if (day>30)
                {
                    System.out.println("Invalid date so pls enter valid date ....");
                }
                break;
            }
            case 12 :
            {
                if (day>=22 && day<=31 || day<=20)
                {
                    System.out.println("Zodiac sign for December"+" "+day+" is Capricorn");
                }
                else if (day>31)
                {
                    System.out.println("Invalid date so pls enter valid date ....");
                }
                break;
            }
            default:
            {
               System.out.println(month+ " invalid month number .. ");
            }
        }
    }
}
