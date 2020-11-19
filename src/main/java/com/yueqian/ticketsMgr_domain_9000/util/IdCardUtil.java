package com.yueqian.ticketsMgr_domain_9000.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdCardUtil {
	final static int[] PARITYBIT = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};//校验码
	final static int[] POWER_LIST = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};//加权因子wi

	/**
	  * 验证身份证号有效性
	 * @param POWER_LIST 
	 * @param idCard:身份证号
	 * @return true/false
	 */
	public static boolean isIdcard(String idCard){
		
		 //号码长度应为15位或18位
		 if( idCard== null || idCard.length() != 18){
			 return false;
		 }
	     //校验年份
	     String year = idCard.length() == 15 ? "19" + idCard.substring(6, 8) : idCard.substring(6, 10);
	     final int iyear = Integer.parseInt(year);
	     if (iyear < 1900 || iyear > Calendar.getInstance().get(Calendar.YEAR)) {
	         return false;// 小于1900年的pass，超过今年的pass
	     }   
	     //校验月份
	     String month = idCard.length() == 15 ? idCard.substring(8, 10) : idCard.substring(10, 12);
	     final int imonth = Integer.parseInt(month);
	     if (imonth < 1 || imonth > 12){
	    	return false;
	     }
	     //校验天数
	     String day = idCard.length() == 15 ? idCard.substring(10, 12) : idCard.substring(12, 14);
	     final int iday = Integer.parseInt(day);
	     if (iday < 1 || iday > 31){
	    	 return false;
	     }
	     //校验一个合法的年月日
	     if (!isValidDate(year+imonth+iday)){
	    	 return false;
	     }
	     //校验位数
	     int power = 0;
	     final char[] cs = idCard.toUpperCase().toCharArray();
	     // 循环比正则表达式更快
		 for (int i = 0; i < cs.length; i++) {
			 if (i == cs.length - 1 && cs[i] == 'X') {
				 break;// 最后一位可以是X或者x
			 }
	         if (cs[i] < '0' || cs[i] > '9') {
	        	 return false;
	         }
	         if (i < cs.length - 1) {
	        	 power += (cs[i] - '0') * POWER_LIST[i];
	         }
	      }
		 return cs[cs.length - 1] == PARITYBIT[power % 11]; 

	 }
	 
	/**
	 * 判断字符串是否为日期格式(合法)
	 * @param inDate:字符串时间
	 * @return true/false
	 */
	public static boolean isValidDate(String inDate){
		if(inDate==null){
			return false;
		}
		SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd");//或yyyyMMdd
		
		if(inDate.trim().length() != dataFormat.toPattern().length()){
			return false;
		}
		dataFormat.setLenient(false);//用于设置Calendar严格解析字符串;默认为true,宽松解析
		
		try {
			dataFormat.parse(inDate.trim());
		} catch (ParseException e) {
			return false;
		}
		
		return true;
	}
	/** 
	* 判断字符串是否为日期格式(合法)
	* @param strDate:字符串时间
	* @return true/false
	*/ 
	public static boolean isDate(String strDate) { 
		Pattern pattern = Pattern .compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?"
				+ "((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?"
				+ "[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?"
				+ "[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))"
				+ "[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|"
				+ "(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|"
				+ "(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2]"
				+ "[0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$");   
		Matcher m = pattern.matcher(strDate); 
		
		return (m.matches())?true:false;
	} 
}
