
public class OperatorAndCastingDemo {
	/*
	 * Arithmetic Operator
	 * bitwise Operator
	 * Relational Operator
	 * Bitwise Operator	
	 */
	public static void main(String[] args) 
	{
		//Arithmetic Operator
		int m=6,n=4;
		int s1 = m+n;
		int s2 = m-n;
		int s3 = m*n;
		int s4 = m/n;
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
		/*the output of s4 is shown as 1 because it is in integer value...
		 *But the original output is 1.5...
		 *To get the desired output we need to cast the data type....
		 *By casting the data type double s4 = m/n only shows you 1.0 output
		 *Because m/n is in integer form.....
		 *We need to convert it also to double then only it will show the output = 1.5
		 *To do that double s4 = (double)m/n the the m/n output can be showed as double
		 *That is 1.5 
		 */
		
		double s5 = (double)m/n;
		System.out.println(s5);
		
		int num = 257;
		byte numb = (byte)num;
		System.out.println(numb);
	}
}
