
public abstract class Stud {
String studentName;
int[] testScores;
String testResult;
Stud(String studentName)
{
	this.studentName=studentName;
}
Stud()
{
}


public abstract void generateResult();
	public void setTestScore(int testNumber,int Scores)
	{
		this.testScores[testNumber]=Scores;
		System.out.print("hii");
		
	}
 public String	getStudentName()
 {
	 return this.studentName;
 }
 public void setStudentName(String studentName )
 {
	 this.studentName=studentName;
 }
 public int[] getTestScores()
 {return this.testScores;
 }
 public String getResult()
 {
	 return this.testResult;
 }
 public void setResult(String testResult)
 {
	 this.testResult=testResult;
 }
}
