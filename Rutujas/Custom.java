import java.util.Scanner;

public class Custom {
	public void Custom() {
		
	}

	public static void main(String[] args)
	{
		int n,v,p ,p1 ,d,totbill;
		System.out.println("enter veg dishes and non dishes");
		Scanner sc=new Scanner(System.in);
		p=sc.nextInt();
		p1=sc.nextInt();
		n=p*948;
		v=p1*790;
		d=5;
		{
		if(d<=3)
			totbill=(d*0)+v+n;
		
		else if(d>3 && d<=6)
		
			totbill=(79*(d-3))+v+n;
		
		
		else
		totbill=((158*(d-6))-237)+v+n;
		
		// TODO Auto-generated method stub

	}
	System.out.println(totbill);
	}
}
