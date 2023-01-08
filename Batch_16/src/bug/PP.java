package bug;

public class PP {

	public static void main(String[] args) {
		int n=5;
		for(int r=1;r<=n;r++)
		{
			for(int sp=n-1;sp>=r;sp--)
				System.out.print(" ");
			for(int st=1;st<=r;st++)
				System.out.print("* ");
			System.out.println();		
			
		}
		// TODO Auto-generated method stub

	}

}
