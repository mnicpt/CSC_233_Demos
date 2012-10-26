package factory;

public class PizzaFactory {

	public static Pizza makePizza(String type) {
		System.out.println("Making a " +type+ " pizza.");
		
		Pizza pizza = null;
		if("sausage".equals(type)) {
			pizza = new SausagePizza();
		} else if("pepperoni".equals(type)) {
			pizza = new PepperoniPizza();
		}
		return pizza;
	}
}
