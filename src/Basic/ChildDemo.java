package Basic;

public class ChildDemo extends ParentDemo {
	
	
	String name = "Trick";
	public void getstringdata() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		
		
		ChildDemo cd = new ChildDemo();
		cd.getstringdata();

	}

}
