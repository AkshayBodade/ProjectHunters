
public class Bill {
	 static int counter;
	static String billid;
	String paymentmode;
	
	public Bill(String mode)
	{
		paymentmode=mode;
		
	}
	static 
	
	
	    {
		counter=9000;
		}
	public void setId()	
	{
		counter++;
	    String    bilid="BOO";
		String str=Integer.toString(counter);
        billid	=bilid.concat(str);
	}
	
	public String getId()
{
		
	return billid;
		
	
}
	
public static void main(String args[])
{
	Bill bill1=new Bill("Debitcard");
	
	Bill bill2=new Bill("phonepay");
	
	
	System.out.println( bill1.paymentmode);
	bill1.setId();
	String id=bill1.getId();
	System.out.println(id);
	System.out.println( bill2.paymentmode);
	bill2.setId();
	
	String Id=bill2.getId();
	System.out.println(Id);
}
}
