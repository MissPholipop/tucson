package com.piano.common;


import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

  
/**
 * 
 * @author Yanfa
 *
 */
public class DateUtil {  
    private static final Log log = LogFactory.getLog(DateUtil.class);  
  
    /** 
     * ��ʱ���ַ�ת��ΪDate���� 
     * @param dateStr 
     * @return Date 
     */  
    public static Date toDate(String dateStr) {  
        Date date = null;  
        SimpleDateFormat formater = new SimpleDateFormat();  
        formater.applyPattern("yyyy-MM-dd");  
        try {  
            date = formater.parse(dateStr);  
        } catch (ParseException e) {  
            e.printStackTrace();  
        }  
        return date;  
    }  
  
    /** 
     * �����ṩ�ĸ�ʽ���ַ�ת����Date���� 
     * @param dateStr 
     * @param formaterString 
     * @return 
     */  
    public static Date toDate(String dateStr, String formaterString) {  
        Date date = null;  
        SimpleDateFormat formater = new SimpleDateFormat();  
        formater.applyPattern(formaterString);  
        try {  
            date = formater.parse(dateStr);  
        } catch (ParseException e) {  
            e.printStackTrace();  
        }  
        return date;  
    }  
  
    /** 
     * ��Date����ʱ��ת��Ϊ�ַ� 
     * @param date 
     * @return 
     */  
    public static String toString(Date date) {  
  
        String time;  
        SimpleDateFormat formater = new SimpleDateFormat();  
        formater.applyPattern("yyyy-MM-dd");  
        time = formater.format(date);  
        return time;  
    }  
  
    /** 
     * ���ղ����ṩ�ĸ�ʽ��Date����ʱ��ת��Ϊ�ַ� 
     * @param date 
     * @param formaterString 
     * @return 
     */  
    public static String toString(Date date, String formaterString) {  
        String time;  
        SimpleDateFormat formater = new SimpleDateFormat();  
        formater.applyPattern(formaterString);  
        time = formater.format(date);  
        return time;  
    }  
  
    /** 
     * method ���ַ����͵�����ת��Ϊһ��timestamp��ʱ�����java.sql.Timestamp�� 
     * @param dateString 
     *            ��Ҫת��Ϊtimestamp���ַ� 
     * @return dataTime timestamp 
     */  
    public final static java.sql.Timestamp string2Time(String dateString)  
            throws java.text.ParseException {  
        DateFormat dateFormat;  
//      dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss.SSS",  
//              Locale.ENGLISH);// �趨��ʽ  
         dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm");  
        dateFormat.setLenient(false);  
        java.util.Date timeDate = dateFormat.parse(dateString);// util����  
        java.sql.Timestamp dateTime = new java.sql.Timestamp(timeDate.getTime());// Timestamp����,timeDate.getTime()����һ��long��  
        return dateTime;  
    }  
  
    /** 
     * method ���ַ����͵����ڰ���ת��Ϊһ��timestamp��ʱ�����java.sql.Timestamp�� 
     *  
     * @param dateString ��Ҫת��Ϊtimestamp���ַ� 
     * @param formaterString dateString�ַ�Ľ�����ʽ 
     * @return 
     * @throws java.text.ParseException 
     */  
    public final static java.sql.Timestamp string2Time(String dateString,  
            String formaterString) throws java.text.ParseException {  
        DateFormat dateFormat;  
        dateFormat = new SimpleDateFormat(formaterString);// �趨��ʽ  
        // dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");  
        dateFormat.setLenient(false);  
        java.util.Date timeDate = dateFormat.parse(dateString);// util����  
        java.sql.Timestamp dateTime = new java.sql.Timestamp(timeDate.getTime());// Timestamp����,timeDate.getTime()����һ��long��  
        return dateTime;  
    }  
  
    public static void main(String[] args) throws ParseException {  
        String t = DateUtil.toString(new Date());  
        System.out.println(t);  
        Date date = DateUtil.toDate("2010-06-17");  
        System.out.println(date);  
  
//      String sToTimestamp = "2005-8-18 14:21:12.123";// ����ת����java.sql.Timestamp���ַ�  
        String sToTimestamp = "2005-8-18 14:21";// ����ת����java.sql.Timestamp���ַ�  
        Timestamp Timestamp = string2Time(sToTimestamp);  
        System.out.println(Timestamp);  
  
    }  
  
}  
