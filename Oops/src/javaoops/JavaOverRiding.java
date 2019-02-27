package javaoops;

class Employee extends ReportingManager
{
	public void show()
	{
		System.out.println("I am Employee");
	}
}
class ReportingManager extends Manager
{
	public void show()
	{
		System.out.println("I am ReportingManager");
	}
}
class Manager
{
	private void show()
	{
		System.out.println(" I am Manager"); 
	}
}
public class JavaOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Manager m1=new Manager();
		m1.show();
		Manager m2=new ReportingManager();
		m2.show();
		Manager m3=new Employee();
		m3.show();
		ReportingManager r1=new ReportingManager();
		r1.show();
		ReportingManager r2=new Employee();
		r2.show();
		Employee e1=new Employee();
		e1.show();*/
		//ReportingManager r1=new Manager();
		Manager m1=new Manager();
		m1.show();
		
		
	}

}
