import java.util.Scanner;
public class WhileLoop {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scan.nextInt();
		while(number>=0) {
			sum += number;
			System.out.println("Enter a number");
			number = scan.nextInt();
		}
		System.out.println("Sum = "+sum);
		scan.close();
	}
}
	