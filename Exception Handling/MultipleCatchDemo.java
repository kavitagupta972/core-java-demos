class MultipleCatchDemo
{
  	public static void main(String[] args)
  	{
     	int x=10, y = 2;
     	try{
     		int result = x/y;
        int arr[] = new int[5];
        System.out.println(arr[7]);

     	}catch(ArithmeticException exception) {
     		System.out.println("Exception has occured while dividing x/y " + exception);
     	} catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Error in arr array of out of index ");
      }catch(Exception e) {
     		System.out.println("Generic exception has occured " + e);
     	}
     	
     	System.out.println(" Working on exception handling of my project");

  	}
}