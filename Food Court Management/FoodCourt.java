
public class FoodCourt implements RestaurentOperations,EmployeeOperation {
    
    static Restaurent restaurent[]=new Restaurent[100];
    static Employee employees[]=new Employee[100];
    static int NumberOfRestaurent=-1;
    static int NumberOfEmployee=-1;
    static int p=0;
    
     int get_Res_Num()
    {
        return p;
    }
    
     public boolean insertRestaurent(Restaurent r)
        {
             p++;
            NumberOfRestaurent++;
            restaurent[NumberOfRestaurent]=r;
            return true;
        }
   public boolean removeRestaurent(Restaurent r)
        {
    for(int i=0;i<=NumberOfRestaurent;i++)
    {
        if(restaurent[i].RestaurantId==r.RestaurantId) 
        {
            p--;
            for(int j=i;j<=NumberOfRestaurent;j++)
            {
               restaurent[j]=restaurent[j+1];
            }
            NumberOfRestaurent--;
        }
    }
   
    
    return true;
        }
   
   
   
public Restaurent searchRestaurent(String rid)//restaurent id
        {
    
    boolean check=false;
    int x=0;
    for (int i=0;i<=NumberOfRestaurent;i++)
    {
        if(restaurent[i].RestaurantId.equals(rid))
        {
           x++;
            System.out.println("Restaurent Found !!\n----------------------");
            //restaurent[i].ShowAllFoodItems();
            restaurent[i].RestaurentInfo();
           check=true;
           break;
        }
        x++;
    }
    
    
    if(check==false)
    {
     System.out.println("Restaurent does not Found !!");
    }
    
    return restaurent[x];
        
}
        
        
    public void ShowAllRestaurents()
    {
        for(int i=0;i<=NumberOfRestaurent;i++)
    {
		System.out.println("Restaurent : "+(i+1));
        restaurent[i].ShowAllFoodItems();
    }
        
    }
        
        
        ///
   public boolean insertEmployee(Employee e)
    {
            NumberOfEmployee++;
            employees[NumberOfEmployee]=e;
            return true;
    }
   
   public boolean removeEmployee(Employee e)
    {
    for(int i=0;i<=NumberOfEmployee;i++)
    {
        if(employees[i].EmpId==e.EmpId) 
        {
            for(int j=i;j<=NumberOfEmployee;j++)
            {
               employees[j]=employees[j+1];
            }
            NumberOfEmployee--;
        }
    }
    return true;
    
    }
   public Employee searchEmployee(String empid)//employee id
    {
        boolean check=false;
    int x=0;
    for (int i=0;i<=NumberOfEmployee;i++)
    {
        if(employees[i].EmpId.equals(empid))
        {
           x++;
            System.out.println("Restaurent Found !!\n----------------------");
            employees[i].ShowEmployeesInfo();
           check=true;
           break;
        }
        x++;
    }
    
    
    if(check==false)
    {
     System.out.println("Employee does not Found !!");
    }
    
    return employees[x];
    }
   public void ShowAllEmployee()
    {
        
    for(int i=0;i<=NumberOfEmployee;i++)
    {
      System.out.println("Employee : "+(i+1));
        employees[i].ShowEmployeesInfo();
    }
    }
    
    
}
