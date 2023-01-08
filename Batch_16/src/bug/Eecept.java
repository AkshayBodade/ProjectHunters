package bug;

public class Eecept {

	

	public static void main(String[] args) {
		int a=5,b=0,c;
		try
		{
			c=a/b;
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		finally
		{
			System.out.print("-");
			
		}
		// TODO Auto-generated method stub

	}

}
