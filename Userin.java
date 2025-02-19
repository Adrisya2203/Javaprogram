import java.util.Scanner;
public class Userin
{
	public static void main(String[]args)
	{

            Scanner obj=new Scanner(System.in);
            System.out.println("Enter the first number:");
            int n1=obj.nextInt();
            System.out.println("Enter second number:");
            int n2=obj.nextInt();
            int sum=n1+n2;
            System.out.println("the sum of the two numbers:"+sum);
         }
         
         
}
            
