
public class Restaurent implements FoodItemOperation
{
	String RestaurantId;
	String Name;
       static FoodItem fooditems[]=new FoodItem[100];
        static int NumberOfFoodItem=-1,p=1;
	
       // FoodCourt f=new FoodCourt();
	Restaurent()
        {
        
        }
	Restaurent(String RestaurantId,String Name)
	{
            
	this.RestaurantId=RestaurantId;
	this.Name=Name;
	}
    
        void RestaurentInfo()
        {
            
            System.out.println("Id : "+RestaurantId);
            System.out.println("Name "+Name);
            
        }
	void setName(String Name)
	{
	this.Name=Name;
	}	
	void setRestaurantId(String RestaurantId)
	{
		this.RestaurantId=RestaurantId;
	}
	String getName()
	{
	
         return Name;
	}
        
	String getRestaurantId()
	{
            
	return RestaurantId;
	}
	
   public boolean insertFoodItem(FoodItem f)
    {
        
         NumberOfFoodItem++;
         fooditems[NumberOfFoodItem]=f;
         return true;
    }
   public boolean removeFoodItem(FoodItem f)
    {
        try{
          for(int i=0;i<=NumberOfFoodItem;i++)
    {
        if(fooditems[i].FoodId==f.FoodId) 
        {
            
            for(int j=i;j<=NumberOfFoodItem;j++)
            {
               fooditems[j]=fooditems[j+1];
            }
            NumberOfFoodItem--;
        }
    }
    }
        catch(Exception E)
        {
            //System.out.println(E.getMessage());
        }
        return true;
    }
   public FoodItem searchFoodItem(String fid)//Food Id
    {
     boolean check=false;
    int x=0;
    for (int i=0;i<=NumberOfFoodItem;i++)
    {
        if(fooditems[i].FoodId.equals(fid))
        {
           x++;
            System.out.println("Food Found !!\n----------------------");
            fooditems[i].ShowInfo();
           check=true;
           break;
        }
        x++;
    }
    if(check==false)
    {
     System.out.println("Food does not Found !!");

    }
    return fooditems[x];
    }
   
    public void ShowAllFoodItems()
    {
   if(NumberOfFoodItem<0)
    {
        System.out.println("You have no food items");
    }
   else{ 
       
    for(int i=0;i<=NumberOfFoodItem;i++)
    {
        System.out.println("Food Items : "+(i+1));
        fooditems[i].ShowInfo();
    }
   }
   
    }
       
//    void addquantity(int amount)
//    {
//        fooditems[NumberOfFoodItem].addQuantity(amount);
//        System.out.println(amount+ " Food items added");
//    }
//    
//    void sellquantity(int amount)
//    {
//        fooditems[NumberOfFoodItem].sellQuantity(amount);
//        System.out.println(amount+ " Food items sold");
//    }
    
    
    
}
