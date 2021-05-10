package Basic;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendardemo {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("M/d/YYYY hh:mm:ss");
		System.out.println(cal.getTime());
		System.out.println(sd.format(cal.getTime()));
		System.out.println((cal.get(Calendar.MINUTE)));
	}

}
