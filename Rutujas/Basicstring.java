import java.util.Scanner;

public class Basicstring {

	public static void main(String[] args) 
	{
		String str;
		char ch;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		str=sc.next();
		System.out.println("enter char");
		ch=sc.next().charAt(0);
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
			
			System.out.println(ch+" exist");
			break;
			
			}
			
		}
		// TODO Auto-generated method stub

	}

}
