package com.nullpointer.lfind.utils;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


public class BaseUtil {


	public static String getUUID() {
		String uuid = UUID.randomUUID().toString();
		// 去掉“-”符号
		return uuid.replaceAll("-", "");
	}

	public static Date getTime() {
		Date time= new java.sql.Date(new java.util.Date().getTime());
		return time;
	}

}
