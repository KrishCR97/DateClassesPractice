package com.kishon.datepractise;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {
public static void main(String[] args) {
	DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ENGLISH);
	df.format(new Date());
	System.out.println(df.format(new Date()));
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	try {
		System.out.println(sdf.parse("10-03-1994"));
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
