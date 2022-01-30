                                 //check the charecter is vowel or consonant
import java.util.Scanner;

public class Check_vowel_conso {
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter an charecter");
        ch=sc.next().charAt(0);

        switch(ch)
        {
            case 'a' :
                System.out.println(" charecter is vowel ");
                break;
            case 'e' :
                System.out.println(" charecter is vowel ");
                break;
            case 'o' :
                System.out.println(" charecter is vowel ");
                break;
            case 'i' :
                System.out.println(" charecter is vowel ");
                break;
            case 'u' :
                System.out.println(" charecter is vowel ");
                break;
            default :
                System.out.println("charecter is consonant");
                break;
        }
    }
}
