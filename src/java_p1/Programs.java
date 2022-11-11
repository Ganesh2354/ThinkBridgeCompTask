package java_p1;

public class Programs {

	public static void main(String[] args) {
		
		int a=487;
		int reverse=0;
		
		while(a!=0)
		{
			reverse=reverse*10;			
			reverse=reverse+ (a%10);
			a=a/10;
		}

		System.out.println(reverse);

		
		
		
	}

}
