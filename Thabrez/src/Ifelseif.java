import java.util.Scanner;
public class Ifelseif {
	public static void main(String []args) {
	System.out.println("Enter the number to check...");
	Scanner scan = new Scanner(System.in);
	long num1 = scan.nextLong();
	if (num1 <0) {
		System.out.println("The number is negative...");
	}
	else if(num1 ==0){
		System.out.println("The number is zero...");
		}
	else {
		System.out.println("The number is positive...");
	}
	scan.close();
		}
}