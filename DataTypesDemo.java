class DataTypesDemo {
	public static void main(String[] arg) {
		String greetings = "Hello JAVA World!!!!";
		printMessage(greetings);
		
	}
	public static void printMessage(String message){
		int sum = 20;
		float sum1 = 20.87f;
		final char ch = 'K';
		boolean flag = true;
		double doubleValue = 29.99;
		long longValue = 123456;
		final double PI = 3.14;
		
		System.out.println(message +" "+  sum +" "+ sum1+" "+ch+" "+flag);
		System.out.println(doubleValue+" "+longValue);
	}
}