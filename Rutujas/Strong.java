import java.util.Scanner;

public class Strong {

	public static void main(String[] args) 
	{
		int i,rem,s,b;
		int []a=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 no");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(i=0;i<5;i++)
		{
			s=0;
			rem=0;
			b=a[i];
			for(   ;a[i]>0;a[i]=a[i]/10)
			{
				rem=a[i]%10;
				s=s+(rem*rem*rem);
				
			
			}
			if(b==s)
				System.out.println(b+"Armstrong");
			else
				System.out.println(b+"not armstrong");
				
		}
		
		// TODO Auto-generated method stub

	}

}
