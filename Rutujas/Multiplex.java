import java.util.Scanner;

public class Multiplex
{
	int r,q;
	
	public void getInfo()
	{
		System.out.println("enter r and q");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		q=sc.nextInt();
	}
public void ticketAvailability() throws UnavailableSeatsException

{
	int totseats=60,availableseats=8;
	if(q>availableseats)
		throw new UnavailableSeatsException("Housefull");
	else
		System.out.println("Tickets booked Successfully");
		
}

public void putInfo()
{
	int totamt;
	totamt=r*q;

	System.out.println(totamt);
}
}