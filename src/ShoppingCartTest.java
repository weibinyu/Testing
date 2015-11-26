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
		cart.addItem(milk);
		Mockito.verify(milk).getPrice();
		assertEquals(30, cart.getTotalPrice());
	}
	
	@Test
	public void shouldAddItemToRegister() {
		ShoppingCart cart = new ShoppingCart();
		List<Product> Products = new ArrayList<Product>();
		Product milk = Mockito.mock(Product.class);
		Products.add(milk);
		cart.addItem(milk);
		assertEquals(Products, cart.getProducts());
	}
}

