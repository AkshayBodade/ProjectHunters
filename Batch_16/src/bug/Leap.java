package bug;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int yr=2004;
    if(((yr%4==0)&&(yr%100!=0))||(yr%400==0))
    	System.out.print("leap year");
    
    else
    	
    	System.out.print("not leap year");
    
	}

}