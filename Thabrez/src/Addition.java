import java.util.Scanner;
public class Addition {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
 System.out.println("Enter the first number... :");
		int a = scan.nextInt();
 System.out.println("Enter the second number... :");
		int b = scan.nextInt();
	    int sum = a+b;
 System.out.println("The Addition of two numbers is :"+sum);
		scan.close();
  }
}
