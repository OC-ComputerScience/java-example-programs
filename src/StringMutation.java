
public class StringMutation {

	public static void main(String[] args) {
		
		String phrase = "Change is inevitable";
		String mutation1, mutation2, mutation3, mutation4;
		
		System.out.println("Original String: \""+phrase+"\"");
		System.out.println("Length of string: "+phrase.length());
		
		//	phrase=phrase.concat(" add more characters");
		mutation1 = phrase.concat(", execpt from vending machines");
		mutation2 = mutation1.toUpperCase().replace('A','Z');;
		mutation3 = mutation2.replace('E','X');
		mutation4 = mutation3.substring(3, 30);
		
		System.out.println("Reassigned String: \""+phrase+"\"");
		System.out.println("Length of string: "+phrase.length());
		System.out.println("Mutation #1: "+mutation1);
		System.out.println("Mutation #2: "+mutation2);
		System.out.println("Mutation #3: "+mutation3);
		System.out.println("Mutation #4: "+mutation4);
		
	}

}
