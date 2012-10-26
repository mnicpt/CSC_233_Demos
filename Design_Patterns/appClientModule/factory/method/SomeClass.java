package factory.method;

import factory.Pizza;
import factory.PizzaFactory;

public class SomeClass {
	
	public Pizza buildPizza(String type) {
		return getPizza(type);
	}
	
	protected Pizza getPizza(String type) {
		return PizzaFactory.makePizza(type);
	}
}
