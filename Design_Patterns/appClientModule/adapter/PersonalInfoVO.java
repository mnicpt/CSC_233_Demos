package adapter;

public class PersonalInfoVO {
	private Customer cust;
	private Employment employment;
	
	public String getFirstName() {
		return cust.getFirstName();
	}
	public void setFirstName(String firstName) {
		cust.setFirstName(firstName);
	}
	public String getLastName() {
		return cust.getLastName();
	}
	public void setLastName(String lastName) {
		cust.setLastName(lastName);
	}
	
	public String getEmploymentCity() {
		return employment.getCurrentCity();
	}
	
	public void setEmploymentCity(String currentCity) {
		employment.setCurrentCity(currentCity);
	}
}
