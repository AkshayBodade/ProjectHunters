import java.util.Scanner;

public class CountString {

	public static void main(String[] args) 
	{
		String str="Rutuja";
		String str1="Rutuja";
		char ch;
		int i,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter char");
		
	ch=sc.next().charAt(0);
		
		
		for(i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)==ch)
			
					
			c++;
			
			
		    }
		System.out.println(ch+" "+c);
		}
		// TODO Auto-generated method stub

	}


