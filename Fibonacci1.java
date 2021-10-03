package week1.day1;

public class Fibonacci1 {
	public static void main(String[] args) {
		int n1=0, n2=1, i, n3;
		for(i=0;i<=8;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
	}

}
