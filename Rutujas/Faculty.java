
public class Faculty {
String name;
float basicSalary,bonusPercentage=4,carAllowancePercentage=(float) 2.4;
public Faculty(String name,float basicSalary)
{
	this.name=name;
	this.basicSalary=basicSalary;
}
public Faculty()
{
	}
double calculateSalary()
{
	return this.basicSalary+this.bonusPercentage+this.carAllowancePercentage;
}
String getName()
{
	return this.name;
}
void setName(String name)
{
	this.name=name;
}
float getBasicSalary()
{
	return this.basicSalary;
}
void setBasicSalary(float basicSalary)
{
	this.basicSalary=basicSalary;
}
float getBonusPercentage()
{
	return this.bonusPercentage;
}
void setBonusPercentage(float bonusPercentage) {
	this.bonusPercentage=bonusPercentage;
}
float getCarAllowancePercentage()
{
	return this.carAllowancePercentage;
}
void setCarAllowancePercentage(float carAllowancePercentage)
{
	this.carAllowancePercentage=carAllowancePercentage;
}
}
