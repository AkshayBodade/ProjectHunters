import java.util.Scanner;

public class Armstrong 
{

	public static void main(String[] args) 
	{
		int ori,num,rem,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		num=sc.nextInt();
		ori=num;
		while(num!=0)
		{
			rem=num%10;
			s=s+(rem*rem*rem);
			num=num/10;
			
		}
		if(ori==s)
		System.out.println("armstrong no");
		else
			System.out.println("not armstrong no");
		// TODO Auto-generated method stub

	}

}
