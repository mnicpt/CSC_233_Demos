package factory.method;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import factory.Pizza;
import factory.SausagePizza;

public class SomeClassTest {

	private SomeClass someclass;
	private Pizza mockPizza;
	
	@Before
	public void setUp() {
		mockPizza = new SausagePizza();
		someclass = new SomeClass() {

			@Override
			protected Pizza getPizza(String type) {
				return mockPizza;
			}
			
		};
	}
	
	@After
	public void tearDown() {
		someclass = null;
	}
	
	@Test
	public void testBuildPizza() {
		assertEquals("sausage", someclass.buildPizza("sausage").getType());
	}

}
