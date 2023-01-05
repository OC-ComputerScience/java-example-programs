
public class LoopExample {

	public static void main(String[] args) {
		
		int i;
		
		//While loop
		System.out.println("While Loop");
		i = 0;
		
		while (i < 10) { 
		    System.out.println("Value: "+i);
		    i++;
		}
	
		//Do While
		System.out.println("\nDo While Loop");
		i = 0;
		
		do { 
			System.out.println("Value: "+i);
			i++;
		}
		while (i < 10);
	
		//For Loop
		System.out.println("\nFor Loop");
		
		for (i = 0; i < 10; i++){ 
			System.out.println("Value: "+i);
		}	

	}

}
