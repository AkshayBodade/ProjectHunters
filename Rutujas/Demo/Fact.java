package Demo;

public class Fact {

	public static void main(String[] args) {
		int n=8,i=1,Fact=1,j=1; 
		while(i<=n)
		{
			Fact=Fact*i; //1 //2 //6//24 //120 fact=120
			
			i++;
		}
		System.out.print("factorial of 8 is "+Fact);
		// TODO Auto-generated method stub

	}

}
// 5=1*2*3*4*5