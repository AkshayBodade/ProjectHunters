package bug;

public class Homeloan implements Loan,Rate 
    {

	
		public void rate() {
			System.out.print("Homeloan interest = 8%");
			// TODO Auto-generated method stub
			
		}

		@Override
		public int loan() {
			int amt=3000000;
			
			// TODO Auto-generated method stub
			return amt;
		}
		public static void main(String[]args)
		{
			Homeloan H=new Homeloan();
			H.rate();
			
			System.out.println("amount for loan ="+H.loan());
		}
		// TODO Auto-generated method stub

	}


