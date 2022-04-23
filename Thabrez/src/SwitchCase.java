import java.util.Scanner;
public class SwitchCase {
	public static void main (String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check the availability...");
		int num1 = scan.nextInt();
		switch(num1) {
		case 10:
			System.out.println("only 5 tickets available...");
			break;
		case 20:
			System.out.println("Only 4 tickets available...");
			break;
		case 30 :
			System.out.println("12 tickets available...");
			break;
		default :
			System.out.println("You have entered invalid number...");
		}
		scan.close();
	}

}
