import java.util.Scanner;

public class Calsi {

	public static void main(String[] args) {
		int a,b;
		char sign;
		Scanner sc =new Scanner (System.in);
		System.out.print("enter a and b and operation symbol");
		a=sc.nextInt();
		b=sc.nextInt();
		sign=sc.next().charAt(0);
		switch(sign) {
		case '+':
			System.out.print(a+b);
			break;
		case '-':
			System.out.print(a-b);
			break;
		case '*':
			System.out.print(a*b);
			break;
			default:
				System.out.print(a%b);
			
		}
		

	}

}
