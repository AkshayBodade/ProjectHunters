package bug;

public class Pattern3 {

	public static void main(String[] args) {
		int r,n=4,s,c;
		for(r=0;r<n;r++)
		{
			for(s=n-1;s>=r;s--)
				System.out.print(" ");
			for(c=0;c<=r;c++)
				System.out.print("* ");
			
			System.out.print("\n");
		}
		// TODO Auto-generated method stub

	}

}
