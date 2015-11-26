import static org.junit.Assert.*;

import org.junit.Test;



public class ProductTest {
	@Test
	public void shouldCreateProduct() {
	Product p = new Product("TV", 5000);
	}
	
	@Test
	public void shouldReturnCorrectProduct() {
		Product p = new Product("Milk", 30);
		assertEquals("Milk", p.getProduct());
		assertEquals(30, p.getPrice());
	}
}
