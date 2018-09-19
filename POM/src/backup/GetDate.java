package backup;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDate {

	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyyhhmmss");
		Date date = new Date();
		String nowDate = dateFormat.format(date);
		System.out.println(nowDate);
	}
}
