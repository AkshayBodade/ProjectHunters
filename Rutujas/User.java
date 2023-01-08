
public class User
{
	int id;
	String Username;
	String emailId;
	double walletBalance;
	User(int id,String Username,String emailId,double walletBalance)
	{
		this.id=id;
		this.Username=Username;
		this.emailId= emailId;
		this.walletBalance=walletBalance;
		
	}
	User()
	{
		
	}
	public boolean makePayment(double billAmount)
	{
		if(this.walletBalance>billAmount)
		return true;
		else
			return false;
	}
public int getId()
{
	return this.id;
}
public void setId(int id)
{
	this.id=id;
}
public String getUserName()
{
	return this.Username; 
}
public void setUserNmae(String Username)
{
	this.Username=Username; 
}
public String getEmailId()
{
	return this.emailId;
}
public void setEmailId(String emailId)
{
	this.emailId=emailId;
}
public double getWalletBalance()
{
	return this.walletBalance;
}
public void setWalletBalance(double walletBalance)
{
	this.walletBalance=walletBalance;
}
}
