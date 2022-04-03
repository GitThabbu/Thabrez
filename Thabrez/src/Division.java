import java.util.Scanner;
 public class Division {
	 public static void main (String [] args) {
          Scanner scan = new Scanner(System.in);
     System.out.println("Enetr the firs number... :");
          int a = scan.nextInt();
     System.out.println("Enter the second number... :");
          int b = scan.nextInt();
          int div = a/b;
     System.out.println("The Division of two numbers is :"+div);
        scan.close();
	 }
}