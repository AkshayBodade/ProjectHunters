import java.util.Scanner;

public class Area
{
	public void calArea(float x,float y)
	{
		System.out.print("Area of Reactangle="+(x*y));
	}

	public void calArea(float x)
	{
		System.out.print("Area of square="+(x*x));
	}
	
	public void calArea(double con,float x,float y)
	{
		System.out.print("Area of triangle="+(con*x*y));
	}
	
	public void calArea()
	{
		int x;
		System.out.print("enter a value");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		System.out.print("Area of circle="+(x*x*3.14));
	}

public static void main(String[]args)
{
	float y,z;
	double x=0.5;
	System.out.print("enter 2 value");
	Scanner sc=new Scanner(System.in);
	y=sc.nextFloat();
	z=sc.nextFloat();
	Area a=new Area();
	a.calArea(x,y,z);
}

}
