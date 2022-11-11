package java_p1;

public class E2 {

	public static void main(String[] args) {
	int accBalance=10000;
	
	//you need to send 15000
	
	
	if(accBalance<15000)
	{
		throw new MoneySending("Account_Blance_Is_Not_Sufficient");		
	}
	
	else {
		System.out.println("matched");
	}

	}

}
