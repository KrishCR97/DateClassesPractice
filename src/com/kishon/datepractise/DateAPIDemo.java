package com.kishon.datepractise;

import java.util.Date;

public class DateAPIDemo {
@SuppressWarnings("deprecation")
public static void main(String... args) {
	Date d = new Date();
	System.out.println(d.toString());
	Date d1 = new Date(2018-1900,04,30);
	System.out.println(d1);
	Date d2 = new Date(d.getTime());
	System.out.println(d.getTime());	
}
}
