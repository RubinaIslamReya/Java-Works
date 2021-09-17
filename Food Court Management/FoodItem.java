
public abstract class FoodItem implements IQuantity
{ 
        String FoodId;
	private String Name;
	int AvailableQuantity;
	private double Price; 
	
    FoodItem(){}
    
    FoodItem(String FoodId,String Name,int AvailableQuantity,double Price)
    {
		this.FoodId=FoodId;
		this.Name=Name;
		this.AvailableQuantity=AvailableQuantity;
		this.Price=Price;
	}
		
	public void setfoodId(String FoodId)
	{
		this.FoodId=FoodId;
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public void setAvailableQuantity(int Quantity)
    {
		this.AvailableQuantity=Quantity;
	}
	public void setPrice(double Price)
    {
	    this.Price=Price;
	}

	public String getFoodId()
        {
		return FoodId;
	}
	public String getFoodName(){
		return Name;
	}
	public int getAvailableQuantity(){
		return AvailableQuantity;
	}
	public double getPrice(){
		return Price;
	}
	
      public boolean addQuantity(int amount)
        {
           AvailableQuantity+=amount;
            System.out.println(amount+" Food added !");
           return true;
        }
       public boolean sellQuantity(int amount)
        {
         AvailableQuantity-=amount;
          System.out.println(amount+" Food sold !");
         return true;
        }
        
        abstract  void ShowInfo();
       
}



