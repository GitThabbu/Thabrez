
public class Do {
    public static void main(String[] args) {
    	int i=1;
		while(i>10) { //while loop checks the condition before 
			System.out.println("I value is...is..:"+i);
			i++;
		}
		
		do {
			System.out.println("this loop will run atleast once.........");
		}while(i>10);
		
		//for(initialization;condition;increment/decrement)
		
		for(int n=0;n<10;++n) {
			System.out.println(n);
		}
		
		for(int n=0,m=10;n<10 && m>0;n++,m--) {
			System.out.println(n+":"+m);
		}
		
		for(int n=10;n>0;n--) {//NESTED FOR LOOP
			for(int m=n;m>0;m--) {
				System.out.print("*");
			}
			System.out.println();
		}
    }
}
	
	