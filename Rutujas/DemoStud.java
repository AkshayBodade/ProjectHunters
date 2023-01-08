import java.util.Scanner;

public class DemoStud {

	public static void main(String[] args)
	{
		int x,i;
		Students temp=new Students();
		Students s[]=new Students[3];
		for(i=0;i<s.length;i++)
		{
			s[i]=new Students();
			s[i].getInfo();
			s[i].putInfo();
		}
		System.out.println("enter a roll");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		temp.searchRollno(s, i);
		
		// TODO Auto-generated method stub

	}

}
