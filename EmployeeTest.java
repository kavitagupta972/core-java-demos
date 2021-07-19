//blueprint
class Employee {
	int id;
	String name;
	String organization;

	public Employee(String empName, int empId, String empOrganization){
		System.out.println("Inside parameterised constructor");
		id = empId;
		name = empName;
		organization = empOrganization;


	}

	public Employee() {
			System.out.println("Inside default constructor");
	}

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
		Employee emp1 = new Employee();// default constructor
		Employee amanEmp = new Employee("Aman", 1092, "Intellect");
		//aman, 1092, Intellect
		// emp1.setId(120);
		// emp1.setName("Kavita");
		// emp1.setOrganization("Trainer");
		System.out.println(amanEmp.getId());
		System.out.println(amanEmp.getName());
		System.out.println(amanEmp.getOrganization());
	}
}