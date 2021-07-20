class Vehicle {
	String color = "Green";
	public void moving() {
		System.out.println("Vehicle is moving");
	}
}

class TwoWheeler extends Vehicle {
	int no_of_tyres = 2;
	public void printDetail() {
		System.out.println("Color of vehicle is "+ color);
		moving();
	}
}

class BasicDemo {
	public static void main(String[] arg) {
			TwoWheeler obj = new TwoWheeler();
			obj.printDetail();
	}
}