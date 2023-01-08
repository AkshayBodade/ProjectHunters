
public class Palindrome {

	public static void main(String[] args) 
	{
		int num,ori,rem,rev=0;
		num=121;
		ori=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		if(ori==rev)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
			
		// TODO Auto-generated method stub

	}

}
