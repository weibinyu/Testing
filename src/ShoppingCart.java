
public class ShoppingCart {
	private int TotalPrice;
	
	public ShoppingCart() {
		TotalPrice = 0;
	}
		
	public int getTotalPrice() {
		return TotalPrice;
	}
	public void addItem(Product p){
		TotalPrice += p.getPrice();
}
}
