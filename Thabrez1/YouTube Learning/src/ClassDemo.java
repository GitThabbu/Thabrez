class calc
{
	int num1;
	int num2;
	int result;

	public void add()
	{
		result = num1+num2;
	}
	public void sub()
	{
		result = num1-num2;
	}
	public void mul()
	{
		result = num1*num2;
	}
	
}
	public class ClassDemo {
		public static void main (String []args) 
		{
			calc obj = new calc();
			obj.num1=3;
			obj.num2=5;
			obj.mul();
			System.out.println(obj.result);
		}
	
	}
