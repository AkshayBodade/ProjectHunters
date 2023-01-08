
public class Mobile {
	String name;
	String brand;
	String operatingSystemName,operatingSystemVersion;
public Mobile(String name,String brand,String operatingSystemName,String operatingSystemVersion)
{
	this.name=name;
	this.brand=brand;
	this.operatingSystemName=operatingSystemName;
	this.operatingSystemVersion=operatingSystemVersion;
}
public Mobile()
{
	
}
public String getName()
{
 return this.name;	
}
public void setName(String name)
{
	this.name=name;
}
public String getBrand()
{
 return this.brand;	
}
public void setBrand(String brand)
{
	this.brand=brand;
}
public String getOperatingSystemName()
{
	return this.operatingSystemName;
}
public void setOperatingSystemName(String operatingSystemName)
{
 this.operatingSystemName=operatingSystemName;
}
public String getOperatingSystemVersion()
{
	return this.operatingSystemVersion;
}
public void setOperatingSystemVersion(String operatingSystemVersion)
{
	this.operatingSystemVersion=operatingSystemVersion;
}
}
