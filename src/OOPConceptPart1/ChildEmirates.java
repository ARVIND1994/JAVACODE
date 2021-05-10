package OOPConceptPart1;

public class ChildEmirates extends ParentAircraftAbstract {
	
	
	
	
	public static void main(String[] args) {
		
		ChildEmirates a = new ChildEmirates();
		a.bodycolor();
		a.engine();
		a.safetyguidelines();
		
	}

	@Override
	public void bodycolor() {
		System.out.println("Red color body");
		
	}

}
