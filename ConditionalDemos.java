class conditionalDemos {
	public static void main(String[] arg) {
		
		conditionalChecks();
		loopsDemo();
		
	}
	public static void conditionalChecks(){
		int a = 10;
		if(a>5){
			System.out.println("a is greater than 5");
		}else if(){
			System.out.println("a is less than 5");
		}

		int day = 2;
		switch(day) {
			case 1: 
			System.out.println("Learning basics concepts of java");
			break;
			case 2:
			System.out.println("Learning advanced concepts of java");
			break;
			case 3:
			System.out.println("Learning advanced concepts of java");
			break;
			default :
			System.out.println("Learning advanced concepts of java");
			}
		}

		public static void loopsDemo(){
			int[] arr = new int[]{1,2,4,5,6,23,6};
			//for, while, do while
			for(int i = 0; i< arr.length;i++) {
				System.out.println(arr[i]);
			}
			int a = 5;
			boolean flag  =  true;
			while(flag){
				
				System.out.println("inside while loop");
				a++;
				if(a>5){

					flag = false;
				}
			}
			System.out.println("Exited from while loop");

			do{
				
				System.out.println("inside do while loop");
				
			}while(flag);
		}
}