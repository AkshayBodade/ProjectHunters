
public class Student {
	
final int stipend;
int studentId;
int aggregateMarks;
Student()
{
	stipend=100;
}
public void setStudentId(int studentId)
{
	this.studentId=studentId;
}
public void setAggregateMarks(int aggregateMarks)
{
	this.aggregateMarks=aggregateMarks;
}
public int getStudentId()
{
	return this.studentId;
}
public int getAggregateMarks()
{
	return this.aggregateMarks;
}
public double calculateTotalStipend()
{
	if(this.aggregateMarks>=85 && aggregateMarks<90)
	{
	int i= (stipend+10);
	Double d = Double.valueOf(i);
	      return d;
	}
	else if(this.aggregateMarks>=90 && aggregateMarks<95)
	{
	int i= (stipend+15);
	Double d = Double.valueOf(i);
	      return d;
	}
	else if(this.aggregateMarks>=95&& aggregateMarks<=100)
	{
	int i= (stipend+20);
	Double d = Double.valueOf(i);
	      return d;
	}
	else
		return stipend;
}


	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setStudentId(1212);
		student1.setAggregateMarks(93);

		double totalStipend = student1.calculateTotalStipend();
		System.out.println("The final stipend of " + student1.getStudentId()+" is $" + totalStipend);

		Student student2 = new Student();
		student2.setStudentId(1222);
		student2.setAggregateMarks(84);

		totalStipend = student2.calculateTotalStipend();
		System.out.println("The final stipend of " + student2.getStudentId()+" is $" + totalStipend);
	}
}

