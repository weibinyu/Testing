import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


public class ShoppingCartTest {
	@Test
	public void CreateInstanceOfRegister() {
		ShoppingCart cart = new ShoppingCart();
		assertEquals(0, cart.getTotalPrice());
	}
	
	@Test
	public void shouldAddPriceToTotal() {
		ShoppingCart cart = new ShoppingCart();
		Product milk = Mockito.mock(Product.class);
		Mockito.when(milk.getPrice()).thenReturn(30);
		cart.addProduct(milk);
		Mockito.verify(milk).getPrice();
		assertEquals(30, cart.getTotalPrice());
	}
	
	@Test
	public void shouldAddItemToRegister() {
		ShoppingCart cart = new ShoppingCart();
		List<Product> Products = new ArrayList<Product>();
		Product milk = Mockito.mock(Product.class);
		Products.add(milk);
		cart.addProduct(milk);
		assertEquals(Products, cart.getProducts());
	}
	
	@Test
	public void shouldGetReceipt() {
		ShoppingCart cart = new ShoppingCart();
		Product milk = new Product("Milk", 30);
		Product eggs = new Product("Eggs", 25);
		Product candy = new Product("Candy", 10);
		cart.addProduct(milk);
		cart.addProduct(eggs);
		cart.addProduct(candy);
		assertEquals("Milk 30, Eggs 25, Candy 10, Number items 3, Sum 65", cart.returnReceipt());
	}
}

