package java8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Calendar.Builder;
import java.util.Date;

public class DayCalendar {

	public static void main(String args[]) {
		Builder dtBuilder = new Calendar.Builder();
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
        
		System.out.println(simpleDateformat.format(new Date()).toUpperCase());
	}
}
