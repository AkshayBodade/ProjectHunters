package bug;

public class Fibonacci {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,c=1;
		while (c<=10)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			c++;
		}
		// TODO Auto-generated method stub

	}

}
