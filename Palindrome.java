package programs;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=12321;
		int r;
		int sum=0;
		int temp=n;
		
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
