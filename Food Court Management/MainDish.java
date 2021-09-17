
import java.lang.*;

public class MainDish extends FoodItem
{
   private String Category;
   
   MainDish(){}
   
    MainDish(String FoodId,String Name,int AvailableQuantity,double Price,String Category)
    {
	   super(FoodId,Name,AvailableQuantity,Price);	   
	   this.Category=Category;
    }
    public void setCategory(String Category)
	{
		this.Category=Category;
	}
    public String getCategory()
    {
	    return Category;
    }
   
	void ShowInfo(){	
	        System.out.println("---------------------------------");
		System.out.println("foodId  is: "+getFoodId());
		System.out.println("foodName is: "+getFoodName());
                System.out.println("availableQuantity   is: "+getAvailableQuantity());
                System.out.println("Price is: "+getPrice());			
		System.out.println("Category is: "+getCategory());
		System.out.println();
	}

}

