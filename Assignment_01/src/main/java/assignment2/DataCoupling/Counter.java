package assignment2.DataCoupling;

import java.util.List;

public class Counter {
    static List<FoodItem> availableItems;
    public static FoodItem OrderFoodItem(String name){
        for(FoodItem i : availableItems) {
            if (i.name.equals(name) ) {
                i.orderItem();
                return i;
            }
        }
    }

    public static boolean isItemAvailable(String name){
        for(FoodItem i : availableItems) {
            if (i.name.equals(name) ) {
                return true;
            }
        }
        return false;
    }
}
