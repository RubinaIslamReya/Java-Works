
import java.lang.*;

public class Appetiziers extends FoodItem
{
    
	private String Size;
	
	Appetiziers(){}
	
	Appetiziers(String FoodId,String Name,int AvailableQuantity,double Price,String Size)
	{
		super(FoodId,Name,AvailableQuantity,Price);
		
		this.Size=Size;
	}
	
	public void setSize(String Size)
	{
		this.Size=Size;
	}
   public String getSize()
   {
		return Size;
   }
   
	void ShowInfo()
        {
		System.out.println("---------------------------------");
		System.out.println("foodId  is: "+getFoodId());
		System.out.println("foodName is: "+getFoodName());
                System.out.println("availableQuantity   is: "+getAvailableQuantity());
                System.out.println("Price is: "+getPrice());
		System.out.println("Size is: "+getSize());
		System.out.println();
	}
}

