import org.junit.Test;
import static org.junit.Assert.*;

public class ShoppingCartTest {
	@Test
	public void CreateInstanceOfRegister() {
		ShoppingCart cart = new ShoppingCart();
		assertEquals(0, cart.getTotalPrice());
	}
}
