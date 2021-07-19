//blueprint
class Employee {
	int id = 0;

	public int getId(){
		return id;
	}

	public void setId(int updatedId){
		id = updatedId;
	}
}

public class EmployeeTest {
	public static void main(String[] arg){
		Employee emp1 = new Employee();
		emp1.setId(120);
		System.out.println(emp1.getId());
	}
}