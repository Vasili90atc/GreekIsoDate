package gr.atc.training.greekIsoDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class DateProcessor {

	public String printGreekDate(String isoDate) {
		LocalDateTime date = LocalDateTime.parse(isoDate, DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'"));
		DateTimeFormatter greekFormatter = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy");
		String greekDate = date.format(greekFormatter);
		
		System.out.println(greekDate);
		return isoDate;
	}
	
	public String printGreekDifferenceDate(String isoDate1, String isoDate2) {
		LocalDateTime date1 = LocalDateTime.parse(isoDate1, DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'"));
		LocalDateTime date2 = LocalDateTime.parse(isoDate2, DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'"));
		LocalDateTime result = date1.minusYears(date2.getYear());
		result = result.minusDays(date2.getDayOfYear());
		result = result.minusHours(date2.getHour());
		result = result.minusMinutes(date2.getMinute());
		result = result.minusSeconds(date2.getSecond());
		
		
		int days = result.getDayOfYear() + result.getYear()*365;
		String hours_str = String.valueOf(result.getHour());
		String minutes_str = String.valueOf(result.getMinute());
		String seconds_str = String.valueOf(result.getSecond());
		
		if (result.getHour() == 0)hours_str = "00";
		if (result.getMinute() == 0) minutes_str = "00";
		if (result.getSecond() == 0) seconds_str = "00";
		
		String answer = String.valueOf(days) + " μέρες " + hours_str + ":" + minutes_str + ":" + seconds_str;
		
		System.out.println(answer);
		return answer;
		
		/* 
		 * 
		 * DateTimeFormatter fmt = DateTimeFormatter.ofPattern("D μέρες H:m:s");
		String diffDate = result.format(fmt);
		System.out.println(diffDate);
		*/
		
	}
}