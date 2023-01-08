import java.util.Scanner;

public class SumRow {

	public static void main(String[] args) 
	{
		int r,c,s;
		int [][]a=new int[3][3];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 9 elements");
		for(r=0;r<3;r++)
		 for(c=0;c<3;c++)
		  a[r][c]=sc.nextInt();
			 for(r=0;r<3;r++)
			 {
				 for(c=0,s=0;c<3;c++)
				 {
					 System.out.print(" "+a[r][c]);
					 s=s+a[r][c];
						 
				 }
					 System.out.print(" "+s);
				  
					 System.out.println();
				
				
			 }
		
		// TODO Auto-generated method stub

	}

}
