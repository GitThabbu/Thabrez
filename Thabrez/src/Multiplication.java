import java.util.Scanner;
public class Multiplication {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
 System.out.println("Enter the first number... :");
		int a = scan.nextInt();
 System.out.println("Enter the second number... :");
		int b = scan.nextInt();
	    int mul = a*b;
 System.out.println("The multiplication of two numbers is :"+mul);
		scan.close();
		
	}

}
