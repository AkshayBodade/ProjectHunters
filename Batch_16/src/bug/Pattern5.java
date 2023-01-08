package bug;

public class Pattern5 {

	public static void main(String[] args) {
		int space,r,c;
		for( r=0;r<5;r++)
		{
			for( space=0;space<=r;space++)
			{
				if(r!=space) {
				
					System.out.print(" ");
				}
				else if(r==space)
					System.out.print("*");
					
			}
			System.out.println();
		// TODO Auto-generated method stub
		}
	}

}
