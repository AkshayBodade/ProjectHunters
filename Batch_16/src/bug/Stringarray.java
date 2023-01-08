package bug;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		
		String s[]=new String[4];
		System.out.print("enter string");
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.next();
			
		}
		for(int i=0;i<s.length;i++)
		System.out.println( s[i]);
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.println( s[i]);
		}
		// TODO Auto-generated method stub

	}

}
