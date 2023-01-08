
public class Tester2 {

	public static void main(String[] args) {
		OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");
		System.out.println("Office Staff Details\n***************");
		System.out.println("Name: "+officeStaff.getName());
		
		System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary()*100)/100.0); 
		// TODO Auto-generated method stub

	}

}
