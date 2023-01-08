package Demo;

public class ArmstrongN {

	public static void main(String[] args) {
		//121=(1*1*1)+(2*2*2)+(1*1*1)
		int n=121,n1,sum=0,rem;
		n1=n;
		while(n>0) //12 //1
		{
			rem=n%10;  //1 //2 //1
			sum=(rem*rem*rem)+sum; //1 //9 //10
			n=n/10; // (121/10) //(12/10) //(1/10)
		}
		System.out.println(sum);
		if(n1==sum)
			System.out.println("no is armstrong");
		else
			System.out.println("no is not armstrong");
		// TODO Auto-generated method stub

	}

}
