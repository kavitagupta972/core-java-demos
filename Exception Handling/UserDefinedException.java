class InvalidInputException extends Exception {
    InvalidInputException(String message) {
      super(message);
    }
}



public class UserDefinedException
{
    public static void validateInput(int age) throws InvalidInputException{
      if(age<18) {
        throw new InvalidInputException("User age is less than 18, Not authorised for Driving License");
      } else {
        System.out.println("User is authorised for Driving license");
      }
    }

  	public static void main(String[] args)
  	{
       int age = 11;
      try{
        validateInput(age);
     }catch(InvalidInputException e){
      e.printStackTrace();
       System.out.println("Exception ");
     }
  	}
}

