class MethodOverloadingDemo {
	
	public static void main(String[] arg) {
		System.out.println(addition(2,3));
		System.out.println(addition(2,3,4));
		System.out.println(addition(2.7,3.5));
		System.out.println(addition(2.4f,3.9f));
		System.out.println(addition("Kavita ", "Gupta"));


	}
//There is nothing to do with the return type in case of method overloading
	static int addition(int x, int y){
		return x+y;
	}
	static int addition(int x, int y){
		return x+y;
	}

	static int addition(int x, int y, int z){
		System.out.println("int method is called");
		return x+y+z;
	}

		static float addition(float x, float y){
			System.out.println("float method is called");
		return x+y;
	}

	static 	String addition(String s1 , String s2){
		System.out.println("string method is called");
		return s1+s2;
	}

	static 	double addition(double x, double y) {
		System.out.println("double method is called");
		return x+y;
	}
}
