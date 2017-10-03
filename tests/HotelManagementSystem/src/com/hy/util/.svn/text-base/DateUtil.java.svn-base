package com.hy.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {
	
	public static String  YMD = "yyyy-MM-dd"; 
	public static String  YMDhms= "yyyy-MM-dd HH:mm:ss"; 
	/**
	 * 
	 * @return 返回当前系统时间，精确到毫秒
	 */
	public static Date getSysDateTime() {
		return new Timestamp( new Date().getTime() );
	}
	
	/**
	 * 方法说明：取当前日期(格式 20030801)
	 * 
	 */
	public static String getStrNowDate() {
		java.util.Date tdate = new java.util.Date();
		String nowtime = new Timestamp(tdate.getTime()).toString();
		nowtime = nowtime.substring(0, 10);
		String nowYear = nowtime.substring(0, 4);
		String nowMonth = nowtime.substring(5, 7);
		String nowDay = nowtime.substring(8, 10);
		String nowdate = nowYear + nowMonth + nowDay;
		return nowdate;
	}
	
	/**
	 * 方法说明：取当前日期 (格式 2003-08-01)
	 * 
	 */
	public static String getNowDate() {
		java.util.Date tdate = new java.util.Date();
		String nowtime = new Timestamp(tdate.getTime()).toString();
		nowtime = nowtime.substring(0, 10);
		return nowtime;
	}
	
	/**
	 * 格式化时间工具类
	 * @return 日期格式  指定字符串
	 */
	public static String formatDate(Date date, String format ) {
		SimpleDateFormat sf = new SimpleDateFormat( format );
		return sf.format(date);
	}
	
	/**
	* 字符串转换成日期
	* @param str
	* @return date
	*/
	public static Date StrToDate(String str,String sdf){
	   SimpleDateFormat format = new SimpleDateFormat(sdf);
	   Date date = null;
	   try {
	    date = format.parse(str);
	   } catch (ParseException e) {
		   e.printStackTrace();
	   }
	   return date;
	}
	
	/**
	 * 制定时间上加固定天数
	 * @param day
	 * @param addnum
	 * @return
	 */
	public static Date AddDate(Date day,int addnum){
	     Calendar calendar=new GregorianCalendar(); 
	     calendar.setTime(day); 
	     calendar.add(calendar.DATE,addnum);//把日期往后增加一天.整数往后推,负数往前移动 
	     return calendar.getTime();   //这个时间就是日期往后推一天的结果 
	}
	
	/**  
     * 计算两个日期之间相差的天数  
     * @param smdate 较小的时间 
     * @param bdate  较大的时间 
     * @return 相差天数 
     * @throws ParseException  
     */    
    public static int daysBetween(Date smdate,Date bdate) throws ParseException    
    {    
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
        smdate=sdf.parse(sdf.format(smdate));  
        bdate=sdf.parse(sdf.format(bdate));  
        Calendar cal = Calendar.getInstance();    
        cal.setTime(smdate);    
        long time1 = cal.getTimeInMillis();                 
        cal.setTime(bdate);    
        long time2 = cal.getTimeInMillis();         
        long between_days=(time2-time1)/(1000*3600*24);  
        return Integer.parseInt(String.valueOf(between_days));           
    }  
    
    /**
     * 获取当前日期是星期几
     * @param dt
     * @return 当前日期是星期几
     */
    public static String getWeekOfDate(Date dt) {
        String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);

        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;

        return weekDays[w];
    }
}
