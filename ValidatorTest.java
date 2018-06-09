import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ValidatorTest {
	private Validator v = new Validator();
	@Test
	public void test1() {
		assertFalse(v.validate("password"));
	}
	@Test
	public void test2() {
		assertFalse(v.validate("123456"));
	}
	@Test
	public void test3() {
		assertTrue(v.validate("Password"));
	}
	@Test
	public void test4() {
		assertTrue(v.validate("12345678"));
	}
}
