import factory.Pizza;
import factory.PizzaFactory;


public class Main {

	public static void main(String[] args) {
		Pizza sausagePizza = PizzaFactory.makePizza("sausage");
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}