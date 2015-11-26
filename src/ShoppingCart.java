import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private int TotalPrice;
	List<Product> Products = new ArrayList<Product>();
	
	public ShoppingCart() {
		TotalPrice = 0;
	}
		
	public int getTotalPrice() {
		return TotalPrice;
	}
	public void addItem(Product p){
		TotalPrice += p.getPrice();
		Products.add(p);
	}
	public List<Product> getProducts(){
		return Products;
	}
}
