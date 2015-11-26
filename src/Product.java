
public class Product {
	private String name;
	private int price;
	
	public Product(String name, int price) {
		if(price < 0){
				throw new IllegalArgumentException();
			}
		this.name = name;
		this.price = price;
	}
	
	public String getName(){
		return name;
	}
	
	public int getPrice(){
		return price;
	}
}
