package Basic;

public class constructdemo {
	
	public constructdemo()
	{
	     System.out.println("I am in the constructor");	
	}
	public constructdemo(int a, int b)
	{
		System.out.println("I am in Paramerized constructor");
	}
	public constructdemo(String str)
	{
		System.out.println(str);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructdemo cd = new constructdemo("hello");
		constructdemo c = new constructdemo(4,5);	

	}

}
