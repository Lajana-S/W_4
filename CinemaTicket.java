import java.util.Scanner;

/**
 * Workshop_4 Scenario
 *
 * @author Lajana
 * @version v1.0
 */
public class CinemaTicket
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter movie language:");
        String lang = scan.next();
        System.out.println("Are you a student? (Y/N)");
        char s = scan.next().charAt(0);
        System.out.println("Is today a festival day? (Y/N)");
        char f = scan.next().charAt(0);
        
        int bp;
        
        if (age < 18 && age > 0)
        {
            bp=150;
        }
        else if (age < 65)
        {
            bp=250;
        }
        else if (age < 100)
        {
            bp=200;
        }
        else
        {
            bp=0;
            System.out.println("Invalid age");
        }
        
        int lp;
        
        if (lang == "Hindi")
        {
            lp=bp+50;
        }
        else if (lang == "English")
        {
            lp=bp+100;
        }
        else
        {
            lp=0;
            System.out.println("Invalid language");
        }
        
        float p;
        
        if (s == 'Y')
        {
            System.out.println("Is a student");
            p=lp-(lp*20/100);
        }
        else
        {
            System.out.println("Is not a student");
            p=lp;
        }
        
        float tp;
        if (f == 'Y')
        {
            System.out.println("It is a festival day");
            tp=p-(p*15/100);
        }
        else
        {
            System.out.println("It is not a festival day");
            tp=p;
        }
        System.out.println("");
        System.out.println("The final ticket price is : "+tp);
    }
}