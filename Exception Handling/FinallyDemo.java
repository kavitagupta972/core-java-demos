class MultipleCatchDemo
{
  	public static void main(String[] args)
  	{
     	int x=10, y = 2;
       FileReader fr=null;
     	try{
     		int result = x/y;
        int arr[] = new int[5];
        System.out.println(arr[7]);
        //resources
         fr  = new FileReader("file name");

     	}catch(ArithmeticException exception) {
     		System.out.println("Exception has occured while dividing x/y " + exception);
     	}catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Error in arr array of out of index ");
      }finally {
        //close resources
        fr.close();
        System.out.println("Closing the opened connection before exiting");
      }
  	}
}