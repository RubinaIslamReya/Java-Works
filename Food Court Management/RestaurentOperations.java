
public interface RestaurentOperations {
    
    boolean insertRestaurent(Restaurent r);
    boolean removeRestaurent(Restaurent r);
    Restaurent searchRestaurent(String rid);//restaurent id
    void ShowAllRestaurents();
    
}
