class student
{
	String name;
	int rollno;
	double mark;
}
public class ArrayObj
{
	public static void main(String args[])
	{
	 	student s1=new student();
	 	s1.name="anu";
	 	s1.rollno=1;
	 	s1.mark=90;
	 	student s2=new student();
	 	s2.name="arun";
	 	s2.rollno=2;
	 	s2.mark=85;
	 	student students[]=new student[2];
	 	students[0]=s1;
	 	students[1]=s2;
	 	int i;
	 	for(i=1;i<students.length;i++)
	 	{
	 	System.out.println(s1.name+":"+s1.mark);
	 	System.out.println(s2.name+":"+s2.mark);
	 	
	 }
}
}


