 public class Prime 
 {

	public static void main(String[] args) 
	{
		int n,cnt;
		for(n=3;n<=20;n++)
		{
			for(cnt=2;cnt<n;cnt++)
			
			  {
				
				if(n%cnt==0)
					break;
				
			  }	
				if(n==cnt)
				    System.out.println(n+" prime no");
				else
					System.out.println(n+" not prime");
				
		    }	
			
		

	}

}
