package Demo;

public class Pyramidd {

	public static void main(String[] args) {
		int r,c,sp,n=4;
		for(r=1;r<=4;r++)
		{
			for(sp=n-1;sp>=r;sp--)
				System.out.print(" ") ; 
			for(c=1;c<=r;c++)
			{
			System.out.print("* ") ;  
			}
			System.out.print("\n") ; 
		}//   *
		                                    //*   *
		                                // *    *     *    
		// TODO Auto-generated method stub

	}

}
