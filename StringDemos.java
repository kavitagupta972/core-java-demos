class StringDemos {
	public static void main(String[] arg) {
		String greetings = "Hello JAVA World!!!!";
		printMessage(greetings);
		/*
		concat
		length
		charAt(index)
		*/
		
	}
	public static void printMessage(String message){
		String s1 = "First String";
		String s2 = "Second String";
		String firstName = "Kavita ";
		String lastName = "Gupta";
		String fullName = "";
		// fullName = firstName.concat(lastName);
		fullName = "Kavita ".concat(lastName);
			System.out.println(fullName);
			System.out.println(s1.charAt(4));
		}
}