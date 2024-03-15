package gr.atc.training.greekIsoDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateProcessor {

	public String printGreekDate(String isoDate) {
		LocalDateTime date = LocalDateTime.parse(isoDate, DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'"));
		DateTimeFormatter greekFormatter = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy");
		String greekDate = date.format(greekFormatter);
		
		System.out.println(greekDate);
		return isoDate;
	}
}