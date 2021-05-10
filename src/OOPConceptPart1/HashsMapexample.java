package OOPConceptPart1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashsMapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Monday");
		hm.put(1, "Tuesday");
		hm.put(2, "Wednesday");
		hm.put(4, "Thursday");
		System.out.println(hm.get(0));
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		

	}

}
