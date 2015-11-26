import java.io.PrintStream;
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
	
	public void addProduct(Product p){
		TotalPrice += p.getPrice();
		Products.add(p);
	}
	
	public List<Product> getProducts(){
		return Products;
	}
	
	public String getReceipt(){
		StringBuilder sb = new StringBuilder();
		
		for(Product i : Products){
			sb.append(i.getName() + " " + i.getPrice() + ", ");
		}
		
		sb.append("Number of Products " + Products.size());
		sb.append(", Total " + TotalPrice);
		
		return sb.toString();
	}
	
	public void printReceipt(String receipt, PrintStream printStream) {
		Printer p = new Printer();
		p.print(receipt, printStream);
		
	}
}
