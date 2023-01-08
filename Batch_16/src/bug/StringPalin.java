package bug;

public class StringPalin {

	public static void main(String[] args) {
		String str="utu";
		String St="";

		for(int i=str.length()-1;i>=0;i--)
		{
			St=St+str.charAt(i);
		}
		System.out.println(str);
		System.out.println(St);
		if(str.equals(St))
		{
			System.out.println(str+" Palindrome");
		}
		else {
			System.out.print(str+" not Palindrome");}
		// TODO Auto-generated method stub

	}

	
}
