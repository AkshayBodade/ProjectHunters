package bug;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		String str;
		System.out.print("enter string");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	
	}

}
