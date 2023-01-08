
public class StringMethod {

	public static void main(String[] args)
	{
		String str="Proact Computer";
		String str2;
		int len,x;
		len=str.length();
		System.out.println(len);
		str=str.toUpperCase();
		System.out.println(str);
		str2=str.toLowerCase();
		System.out.println(str2);
		System.out.println(str.concat(" Aurangabad"));
		
		
		System.out.println(str2);
		System.out.println(str);
		System.out.println(str.equals("proact computer"));
		System.out.println(str.equalsIgnoreCase("proact computer"));
		
		x=str2.compareTo("PROACT COMPUTER");
		System.out.println(x);
		// TODO Auto-generated method stub

	}

}
