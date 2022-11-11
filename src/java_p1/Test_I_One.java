package java_p1;

public interface Test_I_One {
	
	
	public static void d1()
	{
		System.out.println("stat-d1");
//		return null;
	}
	
	default void d2()
	{
	   System.out.println("def-d2");
		
	}
	
	void t1();
	
	

}
