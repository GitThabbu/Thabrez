import java.util.Scanner;

public class Training {
	public static void main(String[] args) {
		System.out.println("Enter the value to print the pattern");
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		scan.close();
		for (int i = 1; i <= value; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("A" + "");
			}
			System.out.println();
		}
	}
}
