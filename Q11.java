import java.util.Scanner;

/**
 * Workshop_4 Question_11
 *
 * @author Lajana
 * @version v1.0
 */
public class Q11
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Annual Income in NRP:");
        double ai = scan.nextFloat();
        double tax = 0.0;
        double t1=0.0,t2=0.0,t3=0.0,t4=0.0,t5=0.0,t6=0.0;
        scan.nextLine();
        if (ai > 0 && ai <= 500000)
        {
            t1 = ai/100;
        }
        else if (ai > 500000 && ai <= 700000)
        {
            t1 = 500000/100;
            t2 =(ai-500000)*(10*1.0/100);
        }
        else if (ai > 700000 && ai <= 1000000)
        {
            t1 = 500000/100;
            t2 =200000*(10*1.0/100);
            t3 =(ai-700000)*(20*1.0/100);
        }
        else if (ai > 1000000 && ai <= 2000000)
        {
            t1 = 500000/100;
            t2 = 200000*(10*1.0/100);
            t3 = 300000*(20*1.0/100);
            t4 = (ai-1000000)*(30*1.0/100);
        }
        else if(ai > 2000000 && ai <= 5000000)
        {
            t1 = 500000/100;
            t2 =200000*(10*1.0/100);
            t3 =300000*(20*1.0/100);
            t4 =1000000*(30*1.0/100);
            t5 =(ai-2000000)*(36*1.0/100);
        }
        else
        {
            t1 = 500000/100;
            t2=200000*(10*1.0/100);
            t3=300000*(20*1.0/100);
            t4=1000000*(30*1.0/100);
            t5=2000000*(36*1.0/100);
            t6=(ai-5000000)*(39*1.0/100);
        }
        tax = t1+t2+t3+t4+t5+t6;
        System.out.println("Total Tax Payable for Rs."+ai+" is "+tax+".");
    }
}