
public class OfficeStaff extends Faculty {
String designation;
public OfficeStaff(String name,float basicSalary,String designation)
{
	this.setName(name);
	this.setBasicSalary(basicSalary);
	this.designation=designation;
}
double calculateSalary()
{
	if (this.designation=="Accountant")
	{
		return (this.getBasicSalary()+this.getBonusPercentage()+this.getCarAllowancePercentage()+10000.0);
	}
	else if(this.designation=="Clerk")
	{
		return (this.getBasicSalary()+this.getBonusPercentage()+this.getCarAllowancePercentage()+7000.0);
	}
	else
		return (this.getBasicSalary()+this.getBonusPercentage()+this.getCarAllowancePercentage()+4500.0);
}
}
