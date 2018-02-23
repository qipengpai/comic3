package com.crxl.qpp.comic2.base;

import com.crxl.qpp.comic2.tool.DateUtil;
import com.crxl.qpp.comic2.tool.RandomUtil;


public class BaseEntity {
	public static RandomUtil ran;
	public static DateUtil date;
	public Object obj="";



	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public String startTime="";
	public String overTime="";

	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getOverTime() {
		return overTime;
	}
	public void setOverTime(String overTime) {
		this.overTime = overTime;
	}
	
	
	
}
