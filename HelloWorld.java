class HelloWorld {
	static int i =10;
	public static void main(String[] arg) {
		String greetings = "Hello JAVA World!!!!";
		System.out.println(i);
		HelloWorld obj = new HelloWorld();
		obj.printMessage(greetings);
		staticPrintMessage("hello world");
		
	}

	 void printMessage(String message){
		int sum = 20;
		float sum1 = 20.87f;
		char ch = 'K';
		boolean flag = true;
		System.out.println(message +" "+  sum +" "+ sum1+" "+ch+" "+flag);
	}

	static void staticPrintMessage(String message){
		int sum = 20;
		float sum1 = 20.87f;
		char ch = 'K';
		boolean flag = true;
		System.out.println(message +" "+  sum +" "+ sum1+" "+ch+" "+flag);
	}
}