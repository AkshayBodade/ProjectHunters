import java.util.Scanner;

public class Students
    {

	
	
		int rollno;
		String name;
		
		public void getInfo()
		{
			System.out.println("enter rollno and name");
			Scanner sc=new Scanner(System.in);
			rollno=sc.nextInt();
			name=sc.next();
			
		}
		
		public void putInfo()
		{
			System.out.println(rollno + " "+name);
		}
		
		public void searchRollno(Students []stud,int j)
		{
			int i;
			for( i=0;i<stud.length;i++)
				
			{
				if(j==stud[i].rollno)
					break;
				
			}
			if( i==stud.length)
				System.out.println("student not exist");
			else
				System.out.println("exist");
			
		}
		// TODO Auto-generated method stub

	}


