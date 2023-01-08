
public class Tester3 {
	public static void main(String args[]){
		int x=1;
		Smartphone smartPhone = new Smartphone("KrillinM20", "nebula", "saturn", "1.3", "6G");
		if(smartPhone.testCompatibility())
		    System.out.println("The mobile OS is compatible with the network generation!");
		else
		    System.out.println("The mobile OS is not compatible with the network generation!");
}
}