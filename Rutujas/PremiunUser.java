
public class PremiunUser extends User {
	int rewardPoints;

	PremiunUser(int id,String Username,String emailId,double walletBalance)
	{
		this.setId(id);
		this.setUserNmae(Username);
		this.setEmailId(emailId);
		this.setWalletBalance(walletBalance);
		
	}
	public boolean makePayment(double billAmount)
	{
		if(this.walletBalance>billAmount)
		{
		
		return true;
		}
		else
			return false;
	
	}
	public int getRewardPoints() {
	double billAmount = 0;
	if(this.makePayment( billAmount))
	{
	int	reward=(int) (billAmount*(10/100));
	
	
	this.rewardPoints=reward;
}
	
		return this.rewardPoints;
	
		
	}
	public void setRewardPoints(int rewardPoints)
	{
		this.rewardPoints=rewardPoints;
		
	}
	 public static void main(String[] args) {

	        User user = new User(101, "Joe", "joe@abc.com", 100);

			PremiunUser premiumUser = new PremiunUser(201, "Jill", "jill@abc.com", 300);

			processPayment(user, 70);

			processPayment(premiumUser, 150);

			processPayment(premiumUser, 80);

			processPayment(premiumUser, 120);

	    }

	    public static void processPayment(User user, double billAmount) {
	        if (user.makePayment(billAmount)) {
				System.out.println("Congratulations " + user.getUserName() + ", payment of $" + billAmount + " was successful!");
			} else {
				System.out.println("Sorry " + user.getUserName() + ", you do not have enough balance to pay the bill!");
			}
			System.out.println("Your wallet balance is $" + user.getWalletBalance());

			if (user instanceof PremiunUser) {
				PremiunUser premiumUser = (PremiunUser) user;
				System.out.println("You have " + premiumUser.getRewardPoints() + " points!");
			}
			System.out.println();
	    }
}
