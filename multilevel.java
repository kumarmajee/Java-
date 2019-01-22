abstract class College
{
	College()
	{
		System.out.println("Inside College constructor");
	}
	abstract void show();
}
abstract class Deptt extends College
{
	Deptt()
	{
		System.out.println("Inside Deptt constructor");
	}
	void show()
	{
		System.out.println("5 Deptts are present in our college");
	}
	abstract void display();
}
class Teacher extends Deptt
{
	Teacher()
	{
		super();//parent's constructors
		System.out.println("Inside Teacher constructor");
	}
	void show()
	{
		System.out.println("100 teachers are present in each deptt ");
	}
	void display()
	{
		super.show();//Deptt's show
		show();
	}
}
class Main
{
	public static void main(String args[])
	{
		Teacher T=new Teacher();
		T.display();
	}
}
	