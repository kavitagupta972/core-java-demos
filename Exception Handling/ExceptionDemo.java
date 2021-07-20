class ExceptionDemo
{
  	public static void main(String[] args)
  	{
     	int x=10, y = 0;
     	try{
     		int result = x/y;
     		System.out.println(result);

     	}catch(ArithmeticException exception) {
     		System.out.println("Exception has occured while dividing x/y" + exception);
     	}
     	
     	System.out.println(" Working on exception handling of my project");

  	}
}