package helpers;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Helper {
	public void sleepSeconds(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}	 
	}
	

}	