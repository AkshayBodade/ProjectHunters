import java.util.Scanner;

public class College{
	int rollno;
	String name;
	public College()
	{
		rollno=this.rollno;
	}

public void	getInfo()
{
	System.out.println("enter roll no and name");
	Scanner sc =new Scanner(System.in);
	rollno=sc.nextInt();
	name=sc.nextLine();
}
	
public void putInfo()
{
	System.out.println( rollno +"and"+ name);
}
public void searchStud(int c[],int x)throws StudentNotFoundException
{
	for (int i=0;i<c.length;i++)

{
	
	if(x==c[i].rollno)
		break;
}

int i;
if( i==c.length)
  throw new StudentNotFoundException("not exist");
 else
	 System.out.print("exist");
	 
 
	
}
}