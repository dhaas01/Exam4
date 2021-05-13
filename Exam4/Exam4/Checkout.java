import java.util.ArrayList;

public class Checkout {

   private ArrayList<DessertItem> items;
   
   public Checkout() {
      items = new ArrayList<>();
   }
   
   // Clears the items list and initializes it to be 
   // a new list
   public void clear() {
      items = new ArrayList<>();
   }
   
   // A DessertItem is added to the end of 
   // the list of items
   public void enterItem(DessertItem item) {
      items.add(item);
   }
   
   // Returns the number of items in the cart
   public int numberOfItems() {
      return items.size();
   }

   // Returns the total cost
   public int totalCost() {
      int total = 0;
      for (int i=0; i<items.size(); i++) {
         total = total + items.get(i).getCost();
      }
      return total;
   }
   
   // Returns a string representation
   public String toString() {
      String result = "";
      for (int i=0; i<items.size(); i++) {
         result += items.get(i).getName() + "\t";
         result += items.get(i).getCost() + "\n";
      }
      return result;
   }
}