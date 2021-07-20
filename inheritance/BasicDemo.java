 class Vehicle {
	String color;
	public Vehicle(String color) {
		this.color = color;
	}
	public void moving() {
		System.out.println("Vehicle is moving");
	}
}

class TwoWheeler extends Vehicle {

	int no_of_tyres;

	public TwoWheeler(int n, String color){
		super(color);
		no_of_tyres = n;
	}
	public void printDetail() {
		System.out.println("Color of vehicle is "+ color);
		System.out.println("Tyres in vehicle is "+ no_of_tyres);
		moving();
	}
}

class BasicDemo {
	public static void main(String[] arg) {
			TwoWheeler obj = new TwoWheeler(2, "Yellow");
			obj.printDetail();
	}
}