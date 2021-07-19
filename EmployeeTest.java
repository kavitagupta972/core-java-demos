//blueprint
class Employee {
	int id = 0;
	String name;
	String organization;

	public int getId(){
		return id;
	}

	public void setId(int updatedId){
		id = updatedId;
	}

	public String getName() {
		return name;
	}

	public void setName(String updatedName) {
		name = updatedName;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String updatedOrganization) {
		organization = updatedOrganization;
	}
}

public class EmployeeTest {
	public static void main(String[] arg){
		Employee emp1 = new Employee();
		emp1.setId(120);
		emp1.setName("Kavita");
		emp1.setOrganization("Trainer");
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getOrganization());
	}
}