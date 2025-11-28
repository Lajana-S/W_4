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
            System.out.println("Invalid age!!");
        }
        
        System.out.println("Enter movie language: (Nepali/English/Hindi)");
        String lang = scan.next();
        
        int lp;
        
        if (lang.equals("Nepali") || lang.equals("nepali"))
        {
            lp=bp;
        }
        else if (lang.equals("Hindi") || lang.equals("hindi"))
        {
            lp=bp+50;
        }
        else if (lang.equals("English") || lang.equals("english"))
        {
            lp=bp+100;
        }
        else
        {
            lp=0;
            System.out.println("Invalid language!!");
        }
        
        System.out.println("Are you a student? (Y/N)");
        char s = scan.next().charAt(0);
        
        float p;
        
        if (s == 'Y' || s == 'y')
        {
            System.out.println("Is a student");
            p=lp-(lp*20/100);
        }
        else if (s == 'N' || s == 'n')
        {
            System.out.println("Is not a student");
            p=lp;
        }
        else
        {
            System.out.println("Invalid student input!!");
            p=lp;
        }
        
        System.out.println("Is today a festival day? (Y/N)");
        char f = scan.next().charAt(0);
        
        float tp;
        if (f == 'Y' || f == 'y')
        {
            System.out.println("It is a festival day");
            tp=p-(p*15/100);
        }
        else if (f == 'N' || f == 'n')
        {
            System.out.println("It is not a festival day");
            tp=p;
        }
        else
        {
            System.out.println("Invalid festival input!!");
            tp=p;
        }
        System.out.println("");
        System.out.println("The final ticket price is : "+tp);
    }
}