package java_p1;

public class Test_Mo_Pr {

	public static void main(String[] args) {
		String message="BugSpotter@123@test";
		
		String[] t1=message.split("@");
		
		String a=t1[0];
		
		System.out.println(a);

	}

}
