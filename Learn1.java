package week1.day1;

public class Learn1 {

	public static void main(String[] args) {
		int n=15;
	
		 if(n%3==0 && n%5==0)
		{
			System.out.println("TRIZZ-FIZZ");
		}
		 else if(n%3==0)
		 {
			 System.out.println("TRIZZ");
		 }
		else if(n%5==0)
		{
			System.out.println("FIZZ");
		}
		else 
		{
			System.out.println("Not divisible by 3 and 5");
		}

	}

}
