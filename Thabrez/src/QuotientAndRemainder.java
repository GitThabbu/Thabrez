import java.util.Scanner;
public class QuotientAndRemainder {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Dividend... :");
        int dividend = scan.nextInt();
    System.out.println("Enter the Divisor... :");
        int divisor = scan.nextInt();
        int quotient = dividend/divisor;
        int remainder = dividend%divisor;
     System.out.println("The Quotient is :"+quotient);
     System.out.println("The Remainder is :"+remainder);		
	   scan.close();
	}

}
