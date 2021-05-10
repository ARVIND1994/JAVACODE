package Basic;

public class thisdemo {
	
	int a = 2;
	
	public void getdata() {
		int a =3 ;
		int b = a + this.a;
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		thisdemo td = new thisdemo();
		td.getdata();

	}

}
