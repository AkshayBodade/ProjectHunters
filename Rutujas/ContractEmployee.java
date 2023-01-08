
class ContractEmployee extends Employee {
	    double wage;
	    float hoursWorked;
	    ContractEmployee(int empid,String name,double wage,float hoursWorked)
	    {
	        this.setEmployeeId(empid);
	        this.setEmployeeName(name);
	        this.wage=wage;
	        this.hoursWorked=hoursWorked;
	        
	    }
	     public void calculateSalary()
	     {
	               double salary=wage*hoursWorked;
	        setSalary(salary);
	     } 
	     
	    public double getWage()
	     {
	        return this.wage; 
	     }
	     public void setWage(double wage)
	     {
	         this.wage=wage;
	     }
	     public float getHoursWorked()
	     {
	        return this.hoursWorked;
	     }

}
