package com.Amokart.generic.javautility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Javautility {
public int getRandomNumber() {
Random random= new Random();
int randomNumber=random.nextInt(5000);
return randomNumber;

}
 public String getSystemDateYYYYDDMM() {
	 Date dateObj = new Date();
	 //Date dateObj = new Date();
	 SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd");
	 String date=sdf.format(dateObj);
	return date;
	
}
 public String getRequireDateYYYYDDMM(int days) {
	 SimpleDateFormat sim=new SimpleDateFormat("YYYY-MM-dd");
	 Calendar cal=sim.getCalendar();
	 cal.add(Calendar.DAY_OF_MONTH, days);
	 String reqDate=sim.format(cal.getTime());
	 return reqDate;
	
}
}
