package trigger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		Date now = new Date();
		c.setTime(now);
		
		Calendar c1 = Calendar.getInstance();
		Date d1 = sf.parse("2016-09-02");
		c1.setTime(d1);
//		System.out.println(c1.get(Calendar.DAY_OF_YEAR));
		
		
		long betweenDays = (c.getTimeInMillis()-c1.getTimeInMillis())/(24*60*60*1000);
		System.out.println(betweenDays);
		
	   
		
	}
}
