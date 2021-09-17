
public interface EmployeeOperation {
    
    boolean insertEmployee(Employee e);
    boolean removeEmployee(Employee e);
    Employee searchEmployee(String empid);//employee id
    void ShowAllEmployee();
    
}
