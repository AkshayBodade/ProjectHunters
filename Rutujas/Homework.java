import java.util.Arrays;
import java.util.Scanner;

public class Homework 
{

	public static void main(String[] args) 
	{
		int j,itr,i,x;
		String k="";
		
		String []s=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 strings");
		for(i=0;i<s.length;i++)
			s[i]=sc.next();
		for(i=0;i<s.length;i++)
			System.out.println(s[i]);
		for(itr=1;itr<5;itr++)
		{
			for(i=0;i<5-itr;i++)
			{
		       if(s[i].compareTo(s[i+1])>0)
		        {
			      k=s[i];
		         s[i]=s[i+1];
		          s[i+1]=k;
		         }
			}
		}
		for(i=0;i<5;i++)
			System.out.println(s[i]);
		
		
		
	}
}
