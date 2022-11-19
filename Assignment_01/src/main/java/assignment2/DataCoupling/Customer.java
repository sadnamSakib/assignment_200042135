package assignment2.DataCoupling;

import java.util.List;

public class Customer {
    List<FoodItem> order;
    public void orderItem(String itemName){
            if(Counter.isItemAvailable(itemName)){
                this.order.add(Counter.OrderFoodItem(itemName));
            }
    }
}
