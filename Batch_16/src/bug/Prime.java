package bug;

public class Prime {

	public static void main(String[] args) {
		int n=13,c=2;
		while(c<n)
		{
			if(n%c==0)
				break;
			c++;
		}
		if(n==c)
       System.out.print("prime no");
		else
		      System.out.print("Not prime no");
			// TODO Auto-generated method stub

	}

}
