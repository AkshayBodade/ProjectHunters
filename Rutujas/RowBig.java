import java.util.Scanner;

public class RowBig {

	public static void main(String[] args) 
	{
		int r,c,big;
		int i,j;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter i and j");
		i=sc.nextInt();
		j=sc.nextInt();
		int [][]a=new int[i][j];
		System.out.println("enter"+(i*j)+ "elements");
		for(r=0;r<i;r++)
		 for(c=0;c<j;c++)
		  a[r][c]=sc.nextInt();
			 for(r=0;r<i;r++)
			 {
				 for(c=0,big=0;c<j;c++)
				 {
					 System.out.print(" "+a[r][c]);
					 if(a[r][c]>big)
						 big=a[r][c];
				 }
					 System.out.print(" "+big);
				  
					 System.out.println();
				
				
			 }
		
		
		// TODO Auto-generated method stub

	}

}
