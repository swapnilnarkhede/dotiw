package com.java.dotiw;

import java.util.Date;

public class Dotiw {

	public static String calculate_difference_of_time(long article_time) {
		
		  final long MILLISEC = 1000; 
		  final long MILLISEC_MIN = 60*MILLISEC;
		  final long MILLISEC_HOUR = 60*MILLISEC_MIN;
		  final long MILLISEC_DAY = 24*MILLISEC_HOUR;
		  final long MILLISEC_WEEK = 7 * MILLISEC_DAY;
		  final long MILLISEC_MONTH = 30*MILLISEC_DAY;
		  final long MILLISEC_YEAR = 12*MILLISEC_MONTH;
		  Date new_date = new Date();
		  long current_time = new_date.getTime();
		  long time_difference = Math.abs(current_time - article_time);

		  if((time_difference/MILLISEC_YEAR)>=1){
		    return "About  "+(time_difference/MILLISEC_YEAR)+"years ago";
		  }
		  else if((time_difference/MILLISEC_MONTH)>=1){
		    if((time_difference/MILLISEC_MONTH)>=11)
		      return "About a year ago";
		    else
		    return "About  "+(time_difference/MILLISEC_MONTH)+" Months ago";
		  }
		  else if((time_difference/MILLISEC_WEEK)>=1){
		    return "About  "+(time_difference/MILLISEC_WEEK)+" weeks ago";
		  }
		  else if((time_difference/MILLISEC_DAY)>=1){
		    if((time_difference/MILLISEC_DAY)>25)
		      return "About a month ago";
		    else
		    return "About  "+(time_difference/MILLISEC_DAY)+" days ago";
		  }
		  else if((time_difference/MILLISEC_HOUR)>=1){
		    return "About  "+(time_difference/MILLISEC_DAY)+" hours ago";
		  }
		  else if((time_difference/MILLISEC_MIN)>1){
		    return "About  "+(time_difference/MILLISEC_MIN)+" minutes ago";
		  }
		  else if((time_difference/MILLISEC)>1){
		    return "few "+(time_difference/MILLISEC)+" seconds ago";
		  }
		    
		  return null;
		}
}
