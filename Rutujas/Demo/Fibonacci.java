package Demo;

public class Fibonacci {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,c=10,i=1;
		while(i<=c)
		{
			n3=n1+n2;  //1
			System.out.println(n3); //1 //2 //3 //5 //8
			n2=n3;  // n2=1  ,n2=2,n2=3,n3=5
			n1=n2;  //n1=1    ,n1=1,n1=2,n1=3
			i++;
		}
		// TODO Auto-generated method stub

	}

}
