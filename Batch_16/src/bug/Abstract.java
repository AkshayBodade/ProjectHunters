package bug;

 abstract class BankA {
	abstract int getroi();

}
class SBI extends BankA{
	int roi=7;
	public int getroi() {
		return roi;
	}
}
 class HDFC extends BankA{
	 int roi=8;
		public int getroi() {
			return roi;
		}
		public void main(String[]agrs)
		{
			BankA b;
			b =new SBI();
			System.out.print(b.getroi());
			b =new HDFC();
			System.out.print(b.getroi());
			
		}
 }