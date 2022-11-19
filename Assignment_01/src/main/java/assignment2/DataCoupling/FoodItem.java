package assignment2.DataCoupling;

public class FoodItem {
    String name;
    int availability;
    public FoodItem(String name,int numberOfItems){
        this.name=name;
        availability=numberOfItems;
    }
     boolean isAvailable(){
        return availability>0;
    }
    public void orderItem(){
        if(isAvailable()) {
            this.availability--;
        }
    }
}
