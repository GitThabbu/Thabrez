import java.util.Scanner;
public class Subtraction {
    public static void main (String [] args) {
    	Scanner scan = new Scanner(System.in);
    System.out.println("Enter the first number... :");
       int a = scan.nextInt();
    System.out.println("Enter the Second number... :");
       int b = scan.nextInt();
       int sub = a-b;
     System.out.println("The Subtraction of given numbers is :"+sub);
       scan.close();
    }
}
