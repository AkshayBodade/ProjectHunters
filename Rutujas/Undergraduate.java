
public  class Undergraduate extends Stud {
public Undergraduate(String StudentName)
{
this.setStudentName(StudentName);
}
public void generateResult()
{int i,s=0,avg;
String testResult;
	for(i=0;i<4;i++)
	{
		
		s=s+testScores[i];
	}
	avg=s/4;
	if(avg>=60)
	testResult="pass";
	else
		testResult="fail";
}
}
