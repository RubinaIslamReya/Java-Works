
import java.lang.*;

public class Employee

{
	private String Name;
	String EmpId;
	private double Salary;
	
	public Employee()
        {
        Name="Rubina";
        EmpId="111";
        Salary=5000;
        }
	public Employee(String Name, String EmpId, double Salary)
	{
		this.Name = Name;
		this.EmpId = EmpId;
		this.Salary = Salary;		
	}
	
	
	public void setName(String Name)
        {
            this.Name = Name;
        }
	public void setEmpId(String EmpId)
        {
            this.EmpId = EmpId;
        }
	public void setSalary(double Salary)
        {
            this.Salary = Salary;
        }
	
	
	public String getName()
        {
            return Name;
        }
	public String getEmpId()
        {
            return EmpId;
        }
	public double getSalary()
        {
            return Salary;
        }
        
        void ShowEmployeesInfo()
        {
            System.out.println("Name : "+getName());
            System.out.println("Id : "+getEmpId());
            System.out.println("Salary : "+getSalary());
			System.out.println("-----------------------");
        }
	
}


   