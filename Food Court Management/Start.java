
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Start {

    int ln=0;
    File f=new File("D:\\Food Court Management");

    
    void checkFolder()
    {
        if(!f.exists())
        {
            f.mkdirs();
        }
    }
    void CountLine()
    {
        try {
            ln=0;
            RandomAccessFile raf=new RandomAccessFile(f+"\\Add_Sell Info.txt","rw");
            for(int i=0;raf.readLine()!=null;i++){
                ln++;
            }
        } catch (FileNotFoundException ex) {
          
        } 
        catch (IOException ex) 
        {
           
        }
    }
    
  void addData(int amount,String F_Id,String Catagory)
    {
        try {
            RandomAccessFile raf=new RandomAccessFile(f+"\\Add_Sell Info.txt","rw");
            for(int i=0;i<ln;i++)
            {
                raf.readLine();
            }
            
            raf.writeBytes("Food Id :"+F_Id+ " --- "+amount+" item "+Catagory +"\n");
            
        } 
        catch (FileNotFoundException ex) {
          
        }
        catch (IOException ex) {
          
        }
         
    } 
  
  void CheckHistory()
  {
      try{
           RandomAccessFile raf=new RandomAccessFile(f+"\\Add_Sell Info.txt","rw");
            for(int i=0;i<ln;i++)
            {
                System.out.println("Food -"+(i+1));
                System.out.println(raf.readLine());
                System.out.println("-----------------------------");
            }
            
      }
      catch(Exception E)
      {
      }
      
  }
    
    
    
    
    static MainDish MDish[]=new MainDish[100];
    static Appetiziers app[]=new Appetiziers[100];
    static Restaurent res[]=new Restaurent[100];
    static Restaurent Food=new Restaurent();
    static MainDish add_sell_md=new MainDish();
    static Appetiziers add_sell_app=new Appetiziers();
    
    static int Count=0,Res_Count=0,Food_Count=0;
    static Employee e1[]=new Employee[100];
    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);
        int MainOption,SecondOption,ThirdOption,FourthOption,FifthOption;
        boolean checkMainOption=true,checkSecondOption=true,checkthirdOption=true,checkfourthOption=true,checkfifthOption=true;
        
        while(checkMainOption==true)
        {
        System.out.println("1.Employee Management \n2.Restaurent Management \n3.Restaurent Food Item Management"
                + "\n4.Food Item Quantity Add-sell \n5.Exit");
        MainOption=obj.nextInt();
        
        switch(MainOption)
        {
            case 1:
        while(checkSecondOption==true)
        {
            FoodCourt Emp=new FoodCourt();
            
              Employee e=new Employee();
              
              
              String Name,Id;
              double Salary;
            System.out.println("Employee Management "); 
            System.out.println("1.Insert New Employee  2.Remove Existing Employee  3.Show All Employees"
                    + "  4.Search An Employee  5.Go Back");
            SecondOption=obj.nextInt();
            switch(SecondOption)
            {
                case 1:
                    //String Name, String EmpId, double Salary
                    System.out.print("Enter Name : ");
                    obj.nextLine();
                    Name=obj.nextLine();
                    System.out.print("Enter Id : ");
                    Id=obj.nextLine();
                    System.out.print("Enter Salary : ");
                    Salary=obj.nextDouble();
                    
                    //e=new Employee(Name,Id,Salary);
                    
                    e1[Count]=new Employee(Name,Id,Salary);
                    Emp.insertEmployee(e1[Count]);
                    Count++;
                    System.out.println("Employee Added Successfully !!!");
                    break;
                    
                    case 2: 
                        int remove=0;
						try{
                        System.out.println("You have total "+(Count)+" Employee");
                        if(Count>=1)
                        {   
                        System.out.print("Which Employee do you want to remove?");
                        remove=obj.nextInt();
                        }
                        Emp.removeEmployee(e1[remove-1]);
                        System.out.println("Employee Removed !!");
                        Count--;
						}
						catch(Exception E)
						{
							
						}
                    break;
                    
                    case 3:
                       try{                       
                        Emp.ShowAllEmployee();
                          }
                        
                        catch(Exception E)
                        {
                            System.out.println("Error "+E.getMessage()); 
                        }
                        break;
                    
                    case 4: 
                        String id="";
                        System.out.print("Enter an id to search employee : ");
                        obj.nextLine();
                        id=obj.nextLine();
                        Emp.searchEmployee(id);
                    break;
                    
                    case 5: checkSecondOption=false;
                    break;
            }
            
            
            
            
        }
            checkSecondOption=true;
            break;
            
            //Restaurent management starts from here
            
            case 2:
                
            while(checkthirdOption==true)
            {
                 FoodCourt Res=new FoodCourt();
                 String Id,Name;
                
                 
                 
                System.out.println("Restaurent Management ");
                System.out.println("1.Insert New Restaurant 2.Remove Existing Restaurant"
                        + " 3.Show All Restaurants 4.Search a Restaurant 5.Go Back");
                ThirdOption=obj.nextInt();
                switch(ThirdOption)
                {
                   
                   
                    
                    case 1:
                        System.out.println("Enter Restaurent Id : ");
                        obj.nextLine();
                        Id=obj.nextLine();
                        System.out.println("Enter Restaurent Name : ");
                        Name=obj.nextLine();
                        res[Res_Count]=new Restaurent(Id,Name);
                        Res.insertRestaurent(res[Res_Count]);
                        Res_Count++;
                        System.out.println("Restaurent Added");
                        break;
                        
                        case 2:
                            int remove=0;
                            System.out.println("You have Total "+Res_Count+" Restaurent");
                         if(Res_Count>=1)
                        {   
                        System.out.print("Which Restaurent do you want to remove?");
                        remove=obj.nextInt();
                        }
                         if(remove<=Res_Count)
                         {
                        Res.removeEmployee(e1[remove-1]);
                        System.out.println("Restaurent Removed !!");
                        Res_Count--;
                         }
                         else
                         {
                             System.out.println("Wrong input...try again");
                         }
                            
                        break;
                        
                        case 3:
                            System.out.println("You have Total "+Res_Count+" Restaurent");
                            for(int i=0;i<Res_Count;i++)
                            {
							System.out.println("Restaurent : "+(i+1));
                                res[i].RestaurentInfo();
								System.out.println("-----------------------");
                            }
                           
                        break;
                        
                        case 4:
                             String res_id="";
                            System.out.print("Enter restaurent id to search : ");
                            obj.nextLine();
                            res_id=obj.nextLine();
                            
                            Res.searchRestaurent(res_id);
                        break;
                        
                        case 5:checkthirdOption=false;
                        break;
                }
            }
                       checkthirdOption=true;
                
                       break;
                       
                 //RestaurantFoodItemManagement startd from here
                
                 case 3:
                    
                     
                     while(checkfourthOption==true)
                     {
                         System.out.println("1.Insert New FoodItem 2.Remove Existing FooItem "
                                 + "3.Show All FoodItems 4.Search a FoodItem5.Go Back");
                         FourthOption=obj.nextInt();
                         switch(FourthOption)
                         {
                         case 1:
                             System.out.println("1. Main Dish \n2. Appetiziers");
                             int choice=obj.nextInt();
                             if(choice==1)
                             {
                                // MainDish(String FoodId,String Name,int AvailableQuantity,
                                 //double Price,String Category) 
                                 
                                 System.out.print("Enter food id : ");
                                 obj.nextLine();
                                 String id=obj.nextLine();
                                  System.out.print("Enter food Name : ");
                                  String name=obj.nextLine();
                                   System.out.print("Enter food Available Quantity : ");
                                   int quantity=obj.nextInt();
                                    System.out.print("Enter food Price : ");
                                    double price=obj.nextDouble();
                                     System.out.print("Enter food Catagory : ");
                                     obj.nextLine();
                                     String catagory=obj.nextLine();
                                     
                                     MDish[Food_Count]=new MainDish(id,name,quantity,price,catagory);
                                     
//                                     MDish[Food_Count].setfoodId(id);
//                                     MDish[Food_Count].setName(name);
//                                     MDish[Food_Count].setAvailableQuantity(quantity);
//                                      MDish[Food_Count].setPrice(price);
//                                       MDish[Food_Count].setCategory(catagory);
                                     Food.insertFoodItem(MDish[Food_Count]);
                                     System.out.println("Food Item Addded");
                                     
                                     
                                   int qntt=  MDish[Food_Count].getAvailableQuantity();
                                  // System.out.println("aaaaaaaavvvvvvvvl qnttt : "+qntt);
                                    Food_Count++;
                                     
                             }
                             else if(choice==2)
                             {//String FoodId,String Name,int AvailableQuantity,double Price,String Size
                                   System.out.print("Enter food id : ");
                                 obj.nextLine();
                                 String id=obj.nextLine();
                                  System.out.print("Enter food Name : ");
                                  String name=obj.nextLine();
                                   System.out.print("Enter food Available Quantity : ");
                                   int quantity=obj.nextInt();
                                    System.out.print("Enter food Price : ");
                                    double price=obj.nextDouble();
                                     System.out.print("Enter food size : ");
                                     obj.nextLine();
                                     String size =obj.nextLine();
                                     app[Food_Count]=new Appetiziers(id,name,quantity,price,size);
                                     Food.insertFoodItem(app[Food_Count]);
                                     Food_Count++;
                                 
                             }
                             else
                             {
                                 System.out.println("Wrong input !!");
                             }
                             
                         break;
                         
                           case 2:
                               int remove=0;
							   try{
                               System.out.println("You have total "+Food_Count+" Food Items");
                               Food.ShowAllFoodItems();
 
                        if(Food_Count>=1)
                        {   
                        System.out.print("Enter the Food item number that you want to remove : ");
                        remove=obj.nextInt();
                        }
                        
                         if(remove<=Food_Count)
                         {
                            
                        Food.removeFoodItem(MDish[remove-1]);
                        Food.removeFoodItem(app[remove-1]);
                        System.out.println("Food Item Removed !!");
                        Res_Count--;
                        Food_Count--;
                         }
                         else
                         {
                             System.out.println("Wrong input...try again");
                         }
						 }
						 catch(Exception E)
						 {
							 
						 }
                         break;
                         
                           case 3:
                            
                               Food.ShowAllFoodItems();
                         break;
                           case 4:
                               System.out.println("Enter a food id to remove an food item : ");
                               obj.nextLine();
                               String id=obj.nextLine();
                               Food.searchFoodItem(id);
                         break;
                         
                           case 5:checkfourthOption=false;
                         break;
                         
                         }
                         
                     }
                  checkfourthOption=true;   
                     
                break;
                
                //add sell quantity
                 case 4:
                     boolean check_id;
                     while(checkfifthOption==true)
                     {
                         System.out.println("1.Add FoodItem 2.Sell FoodItem 3.Show Add Sell History 4.Go Back");
                         FifthOption=obj.nextInt();
                         switch(FifthOption)
                         {
                             case 1:
                                 System.out.println("1.MainDish \n2.Appetizers");
                                 System.out.print("Option : ");
                                 int x=obj.nextInt();
                                 if(x==1)
                                 {
                                  check_id=true;   
                                     System.out.print("Enter food id: ");  
                                     obj.nextLine();
                                     String f_id=obj.nextLine();
                                     for(int p=0;p<Food_Count;p++)
                                     {
                                         try{
                                         
                                         System.out.println("Food "+(p+1)+" , id "+MDish[p].getFoodId());
                                         
                                        
                                         if(f_id.equals(MDish[p].getFoodId()))
                                          {
                                              check_id=false;
                                              System.out.println("Id Matched !");
                                              System.out.println("Enter amount of Add item : ");
                                               int quantity=obj.nextInt();
                                               MDish[p].addQuantity(quantity);
                                               Start s=new Start();
                                                s.checkFolder();
                                               s.CountLine();
                                              s.addData(quantity, f_id, "Added");

                                          }
                                         }
                                          catch(Exception E)
                                         {
                                         
                                         }
                                        
                                     }
                                      if(check_id==true){
                                           System.out.println("Id doesn't  Match !");
                                          }
                                     
                                 
                                 }
                                 else if(x==2)
                                    {
                                  check_id=true;   
                                     System.out.print("Enter food id: ");  
                                     obj.nextLine();
                                     String f_id=obj.nextLine();
                                     for(int p=0;p<Food_Count;p++)
                                     {
                                         try{
                                         System.out.println("Food "+(p+1)+" , id "+app[p].getFoodId());
                                          if(f_id.equals(app[p].getFoodId()))
                                          {
                                              check_id=false;
                                              System.out.println("Id Matched !");
                                              System.out.println("Enter amount of Add item : ");
                                               int quantity=obj.nextInt();
                                               app[p].addQuantity(quantity);
                                                  Start s=new Start();
                                                s.checkFolder();
                                               s.CountLine();
                                              s.addData(quantity, f_id, "Added");

                                          }
                                         }
                                          catch(Exception E)
                                         {
                                         
                                         }
                                        
                                     }
                                      if(check_id==true){
                                           System.out.println("Id doesn't  Match !");
                                          }
                                 }
                                 
                                 
                                 
                                 else{
                                     System.out.println("Wrong input !!!");
                                 }
                                
                                 
                                 break;
                                 
                                 case 2:
                                     System.out.println("1.MainDish \n2.Appetizers");
                                 System.out.print("Option : ");
                                 x=obj.nextInt();
                                 if(x==1)
                                 {
                                  check_id=true;   
                                     System.out.print("Enter food id : ");  
                                     obj.nextLine();
                                     String f_id=obj.nextLine();
                                     for(int p=0;p<Food_Count;p++)
                                     {
                                         try{
                                         System.out.println("Food "+(p+1)+" , id "+MDish[p].getFoodId());
                                          if(f_id.equals(MDish[p].getFoodId()))
                                          {
                                              check_id=false;
                                              System.out.println("Id Matched !");
                                              System.out.println("Enter amount of sell item : ");
                                               int quantity=obj.nextInt();
                                               MDish[p].sellQuantity(quantity);
                                                  Start s=new Start();
                                                s.checkFolder();
                                               s.CountLine();
                                              s.addData(quantity, f_id, "Sold");

                                          }}
                                          catch(Exception E)
                                         {
                                         
                                         }
                                        
                                     }
                                      if(check_id==true){
                                           System.out.println("Id doesn't  Match !");
                                          }
                                     
                                 
                                 }
                                 else if(x==2)
                                    {
                                  check_id=true;   
                                     System.out.print("Enter food id: ");  
                                     obj.nextLine();
                                     String f_id=obj.nextLine();
                                     for(int p=0;p<Food_Count;p++)
                                     {
                                         try{
                                         System.out.println("Food "+(p+1)+" , id "+app[p].getFoodId());
                                          if(f_id.equals(app[p].getFoodId()))
                                          {
                                              check_id=false;
                                              System.out.println("Id Matched !");
                                              System.out.println("Enter amount of sell item : ");
                                               int quantity=obj.nextInt();
                                               app[p].sellQuantity(quantity);
                                                Start s=new Start();
                                                s.checkFolder();
                                               s.CountLine();
                                              s.addData(quantity, f_id, "Sold");

                                          }
                                         }
                                          catch(Exception E)
                                         {
                                         
                                         }
                                     }
                                      if(check_id==true){
                                           System.out.println("Id doesn't  Match !");
                                          }
                                 }
                                 
                                 
                                 
                                 else{
                                     System.out.println("Wrong input !!!");
                                 }
                                     
                                     
                                     
                                   
                                     
                                 break;
                                 
                                 case 3:
                                       Start s=new Start();
                                        s.checkFolder();
                                        s.CountLine();
                                     s.CheckHistory();
                                 break;
                                 
                                 case 4:checkfifthOption=false;
                                 break;
                         }
                         
                     }
                     checkfifthOption=true;
                break;
                
                 case 5: checkMainOption=false;
                break;
            
            
            
        }
        
        
        }
        
        
    }
    
}
