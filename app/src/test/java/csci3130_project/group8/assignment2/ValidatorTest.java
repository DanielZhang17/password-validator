package csci3130_project.group8.assignment2;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;


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
		assertFalse(v.validate("Password"));
	}
	@Test
	public void test4() {
		assertFalse(v.validate("12345678aa"));
	}
	@Test
	public void test5() {
		assertFalse(v.validate("12345678BB"));
	}
	@Test
	public void test6() {
		assertTrue(v.validate("12345678aaBB"));
	}
}
