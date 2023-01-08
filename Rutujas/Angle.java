import java.util.Scanner;

public class Angle extends Shape
{
	int l,h;
	
		public void cal()
		{
			System.out.print("enter l and h");
			Scanner sc=new Scanner(System.in);
			l=sc.nextInt();
			h=sc.nextInt();
		System.out.print((1* l*h)/2);
	    }
	

		public static void main(String args[])
		{
			Angle ar=new Angle();
			ar.area();
			ar.cal();
		}
	

}
