package bug;

public class Pattern2 {

	public static void main(String[] args) {
		int r,n=4,c;
		for(r=0;r<n;r++)
		{
			for(c=n;c>r;c--)
				System.out.print("*");
			System.out.print("\n");
		}
		// TODO Auto-generated method stub

	}

}
