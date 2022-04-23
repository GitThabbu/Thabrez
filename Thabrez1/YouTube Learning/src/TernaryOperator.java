
public class TernaryOperator {
   public static void main(String[] args) 
	{
		int i = 8;
		int j = 0;

		if (i > 6)
			j = 1;
		else
			j = 2;
		System.out.println(j);
	
	 /*We can also do this if else using ternary operator
	  *the syntax is ?: -> condition?exprssion1:expression2
	  *In this the condition is true the first block will be executed
	  *Else the second block will be executed
	  */
	j = i>6?1:2;
	System.out.println(j);
	 

   }
}
