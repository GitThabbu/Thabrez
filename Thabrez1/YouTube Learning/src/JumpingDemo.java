//break,continue
public class JumpingDemo {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			
		if(i==7)
		{
			continue;// the continue command will skip the given value in if condition... 
		}
			System.out.println("The Value is" + i);
		}
		System.out.println();
	
		for (int i = 1; i <= 10; i++) {

			if (i >5) {
				break;// the break command will terminate the loop after the value is false...
			}
			System.out.println("The Value is" + i);
		}
	}
}
