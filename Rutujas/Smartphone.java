
public class Smartphone extends Mobile implements Testable{
String networkGeneration;
public Smartphone(String name,String brand,String operatingSystemName,String operatingSystemVersion,String
		networkGeneration)
{
	this.setName(name);
	this.setBrand(brand);
	this.setOperatingSystemName(operatingSystemName);
	this.setOperatingSystemVersion(operatingSystemVersion);
	this.networkGeneration=networkGeneration;
}
String getNetworkGeneration()
{
	return this.networkGeneration;
}
void setNetworkGeneration(String networkGeneration)
{
	this.networkGeneration=networkGeneration;
}
public boolean testCompatibility()
{
	
	
	if(this.getOperatingSystemName()=="saturn"&& this.networkGeneration=="3G"&&(this.getOperatingSystemVersion()=="1.1"||this.getOperatingSystemVersion()=="1.2"||this.getOperatingSystemVersion()=="1.3"))
		return true;
	else if(this.getOperatingSystemName()=="saturn"&& this.networkGeneration=="4G"&& ( this.getOperatingSystemVersion()=="1.1"||this.getOperatingSystemVersion()=="1.2"))
		return true;
	else if(this.getOperatingSystemName()=="saturn"&& this.networkGeneration=="5G"&& this.getOperatingSystemVersion()=="1.1");
	return true;
	
		
	
		
	
	
}
}
