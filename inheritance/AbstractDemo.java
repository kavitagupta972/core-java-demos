  abstract class Vehicle {
	String color;
	int no_of_tyres;
	public Vehicle(String color, int n) {
		this.color = color;
		this.no_of_tyres = n;
	}
	public void printDetail() {
		System.out.println("Color of vehicle is "+ color);
		System.out.println("Tyres in vehicle is "+ no_of_tyres);
	}
	abstract public void moving();
}
class Car extends Vehicle {

	public Car(int n, String color){
		super(color, n);
		}

	public void moving() {
		System.out.println("A person is driving a car");
	}
	
}
 class Bike extends Vehicle {
	public Bike(int n, String color){
		super(color, n);
		
	}
	public void moving() {
		System.out.println("A person is riding a bike");
	}
}
class AbstractDemo {
	public static void main(String[] arg) {
		//Vehicle obj = new Vehicle("White", 4); //Can not instantiate abstract class
			//Vehicle car = new Car(4, "Grey");
			Car car = new Car(4, "Grey");
			Bike enfield = new Bike(2, "Black");
			car.moving();
			enfield.moving();
	}
}