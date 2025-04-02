 class Person
{
	String name;
	int phone;
	public void showAddress()
	{
		System.out.println("Name:"+name);
		System.out.println("phone:"+phone);
	}
}
class Teacher extends Person
{
}
		
class Student extends Person
{
}
class Staff extends Person
{
}
public class Main
{
	public static void main(String args[])
	{
		Teacher t1=new Teacher();
		t1.name="John";
		t1.phone=9076;
		t1.showAddress();
		Student st1=new Student();
		st1.name="Anil";
		st1.phone=4320;
		st1.showAddress();
		Staff s1=new Staff();
		s1.name="liyo";
		s1.phone=4787;
		s1.showAddress();
		
	} 
}

