package com.rupak;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		String inputDate = "2022-02-28";
		System.out.println("month from the date : "+getMonthFromDate(inputDate));
		System.out.println("last day from the date : "+getLastDayOfMonth(inputDate));
	}
	
    public static Date getDateFromString(String date) {
    	try {
    		Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(date);
            return date1;
		} catch (Exception e) {
			return null;
		}
        
    }
	
    public static LocalDate getLocalDateFromString(String date) {
        Date dt = getDateFromString(date);
		LocalDate localDt = LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(dt));
		return localDt;
    }
	
	public static int getMonthFromDate(String inputDate){
        try {
            LocalDate localDate = getLocalDateFromString(inputDate);
            int month = localDate.getMonthValue();
            return month;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public static int getLastDayOfMonth(String inputDate) {
        try {
            LocalDate convertedDate = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            convertedDate = convertedDate.withDayOfMonth(
                    convertedDate.getMonth().length(convertedDate.isLeapYear()));
            return convertedDate.getDayOfMonth();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

}
