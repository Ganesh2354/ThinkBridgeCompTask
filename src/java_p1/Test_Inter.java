package java_p1;

public class Test_Inter implements Test_I_One{

	@Override
	public void t1() {
		System.out.println("over-t1");
//		return 0;
		
	}
	
	public static void main(String[] args)
	{
		Test_Inter o1=new Test_Inter();
		
		o1.t1();
		o1.d2();
		
		Test_I_One.d1();
		
		
	}

}
