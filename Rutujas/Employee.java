
public class Employee {
	
	    int employeeId;
	    String empolyeeName;
	    double salary;
		
	    public Employee(int  employeeId, String empolyeeName )
	    {
	        this.employeeId=employeeId;
	        this.empolyeeName=empolyeeName;
	    }
	    public Employee()
	    {
	    	
	    }
	    
	      public void getEmployeeId()
	      {
	    	  System.out.print(employeeId);
	    	  this.getSalary();
	      }
	      public void setEmployeeId(int employeeId)
	      {
	          this.employeeId=employeeId;
	      }
	       
	      public void setEmployeeName(String employeeName)
	      {
	       this.empolyeeName=employeeName;
	      }
	      public String getEmployeeName()
	      {
	    	  String employeeNmae =this.empolyeeName;
	          return employeeNmae;
	          
	      }
	       public void getSalary()
	      {
	         System.out.print(salary);
	      }
	      public void setSalary(double salary)
	      {
	          this.salary=salary;
	      }

	      public static void main(String[]args)
	      {
	    	  Employee e=new Employee();
	    	  e.setEmployeeId(11);
	    	  e.setSalary(10000);
	    	e.getEmployeeId();
	      }
}
