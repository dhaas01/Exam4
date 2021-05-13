public class TestCheckout {

  public static void main(String[] args) {
  
    Checkout checkout = new Checkout();
    
    checkout.enterItem(new Candy("Peanut Butter Fudge", 2, 4));
    checkout.enterItem(new IceCream("Vanilla Ice Cream",5));
    checkout.enterItem(new Cookie("Oatmeal Raisin Cookies", 4, 24));
    
    System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
    System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
    System.out.println(checkout);
    
    checkout.clear();
    
    checkout.enterItem(new IceCream("Strawberry Ice Cream",7));
    checkout.enterItem(new Candy("Gummy Worms", 1, 9));
    checkout.enterItem(new Cookie("Chocolate Chip Cookies", 4, 36));
    checkout.enterItem(new Candy("Salt Water Taffy", 2, 5));
    checkout.enterItem(new Candy("Candy Corn",3, 11));
    
    System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
    System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
    System.out.println(checkout);
  }
}