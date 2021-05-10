package Basic;

public class StringConcatenation {

	public static void main(String[] args) {
		int a = 200;
		int b = 300;
		
		double c = 12.33;
		double d = 23.44;
		
		String x = "Hello" ;
		String y =  "world" ;
		
		System.out.println(a+b);
		System.out.println(c+d);
		System.out.println(x+y);
		System.out.println(x+" "+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);//Major difference
		
		System.out.println(a+b+x+y+c+d);//500Helloworld12.3323.44

	}

}
