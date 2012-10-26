import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		int counter = 90;
		int end;

		List<Conductor> data = generateConductors();
		List<Conductor> webData = new ArrayList<Conductor>();
		List<Conductor> tempData = data.subList(0, counter);
		
		do {
			List<Conductor> tempWebData = new ArrayList<Conductor>(webData);
			for(Conductor conductor : tempData) {
				if(webData.size() >= 5) {
					for(Conductor setConductor : tempWebData) {
						if(conductor.getName().compareTo(setConductor.getName()) < 0) {
							webData.remove(setConductor);
							webData.add(conductor);
						}
					}
				} else {
					webData.add(conductor);
				}
			}
			webData = tempWebData; //update webData
			end = counter + 90;
			tempData = data.subList(counter, end > data.size() ? data.size() : end);
		} while (tempData != null);
		
		int numConductors = 1;
		System.out.println("Web data size: " +webData.size());
		for(Conductor webConductor : webData) {
			System.out.println(numConductors++);
			System.out.println("Name: " +webConductor.getName());
			System.out.println("Role: " +webConductor.getRole());
		}
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

	private static List<Conductor> generateConductors() {
		List<Conductor> data = new ArrayList<>();
		for(int i = 0; i < 1000; i++) {
			data.add(new Conductor("name" + i, "role" + i+1));
		}
		
		return data;
	}
}