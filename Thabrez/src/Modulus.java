import java.util.Scanner;
public class Modulus {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
 System.out.println("Enter the first number... :");
		int a = scan.nextInt();
 System.out.println("Enter the second number... :");
		int b = scan.nextInt();
	    int mod = a%b;
 System.out.println("The Addition of two numbers is :"+mod);
		scan.close();
		
	}

}
