package bug;

public class ICICI extends Bank{
	int rof=7;
	public int getrot()
	{
		return rof;
	}
public static void main(String[]args)
{
	Bank a;
	a =new ICICI();
	System.out.print(a.getrot());
	a =new Axis();
	System.out.print(a.getrot());
}
}
