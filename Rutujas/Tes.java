
class Tes {
	public static void main(String args[]) {
		
	   Bank	bank = new ABCBank();
		System.out.println("ABCBank - Rate of Interest(%): "
				+ bank.getRateOfInterest());
	   DEFBank	b1= new DEFBank();
		System.out.println("DEFBank - Rate of Interest(%): "
				+ b1.getRateOfInterest());
	  GHIBank	b2 = new GHIBank();
		System.out.println("GHIBank - Rate of Interest(%): "
				+ b2.getRateOfInterest());
	}
}

class Bank {
	public float getRateOfInterest() {
		return 0;
	}
	// remove the access specifier and observe the output
}

class ABCBank extends Bank {
	public float getRateOfInterest() {
		return 8.99f;
	}
	// Keeping the parent access specifier as public, remove the child access
	// specifier and observe the output
}

class DEFBank extends Bank {
	public float getRateOfInterest() {
		return 9.4f;
	}
	// Keeping the parent access specifier as public, change the child access
	// specifier to private/protected and observe the output
}

class GHIBank extends Bank {
	public float getRateOfInterest() {
		return 8.1f;
	}
}
