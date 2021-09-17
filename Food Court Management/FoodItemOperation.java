
public interface FoodItemOperation {
    
    boolean insertFoodItem(FoodItem f);
    boolean removeFoodItem(FoodItem f);
    FoodItem searchFoodItem(String fid);//Food Id
    void ShowAllFoodItems();
    
}
