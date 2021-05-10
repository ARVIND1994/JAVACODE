package OOPConceptPart1;

import java.util.ArrayList;

public class arraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Anshul");
		a.add("Alex");
		System.out.println(a);
		a.add(0, "samsung");
		
		System.out.println(a.indexOf("samsung"));
		
		//a.remove(1);
		a.remove("Alex");
		
		//System.out.println(a);
	}

}
