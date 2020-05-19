package date;

import java.util.Date;

public class EpochTime {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		long timeinmiliseconepoch = date.getTime();
		System.out.println(timeinmiliseconepoch/1000);

	}

}
