
public class Bills {
	
	    public double findPrice( int itemId)
	    {double price;
	    
	        if(itemId==1001)
	        	return price=25;
	        else if(itemId==1002)
	        	return price=20;
	        else if(itemId==1003)
	        	return price=23;
	        else if(itemId==1004)
	        	return price=18;
	        else 
	        	return price=0;
	    }
	    
	    public double findPrice(String brandName,String itemType,int size)
	    {
	        double price;
	        if((brandName=="Puma"||brandName=="Reebok")&&(itemType=="T-shirt"||itemType=="Skirt")&&(size==34||size==36
	        		||size==38||size==40))
	        {
	          if(brandName=="Puma"&& itemType=="T-shirt"&&(size==34||size==36))
	            	
	            		return price=25;
	            	else if(brandName=="Puma")
	            		return price=20;
	            	else if(brandName=="Reebok" && itemType=="T-shirt"&&(size==34||size==36)) 	
	            	return price=23;
	            	else
	            		return price=18;
	            		}
	            
	                
	            
	         
	        else
	        return price=0;
	    }
	    //Implement your code here
	

	

	     
	    

	    	public static void main(String[] args) {
	    		
	    		Bills bill = new Bills();
	    		
	    		double price = bill.findPrice(1001);
	    		if(price>0)
	    		    System.out.println("Price of the selected item is $"+price);
	    		else
	    		    System.out.println("The Item Id is invalid");
	    		price = bill.findPrice("Reebok","T-shirt",34);
	    		if(price>0)
	    		    System.out.println("Price of the selected item is $"+price);
	    		else
	    		    System.out.println("The values are not valid");
	    //Implement your code here
	

	    }
}