package com.crxl.qpp.comic2.tool;

import java.util.ArrayList;

public class Model{
	private int nowpage=0;
	private int totalpage=0;
	private int error = 200;
	private String msg = "牛逼的操作";
	private Object obj=new ArrayList<>();
	private Object spare = "";
	private Object obj2="";
	private int totalNum=0;
	public Model() {
	}

	public Model(Object retobj) {
		this.setObj(retobj);
	}

	public Model(int errorcode) {
		if (errorcode == 500) {
			this.error = 500;
			this.msg = "error";
		}
	}

	public Model(int errorcode, Object obj) {
		this.error = errorcode;
		this.obj = obj;
	}

	public Model(int errorcode, String msg) {
		this.error = errorcode;
		this.msg = msg;
	}

	public int getError() {
		return error;
	}

	public void setError(int error) {
		this.error = error;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public int getNowpage() {
		return nowpage;
	}

	public void setNowpage(int nowpage) {
		this.nowpage = nowpage;
	}

	public int getTotalpage() {
		return totalpage;
	}

	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}

	public Object getSpare() {
		return spare;
	}

	public void setSpare(Object spare) {
		this.spare = spare;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}

	public Object getObj2() {
		return obj2;
	}

	public void setObj2(Object obj2) {
		this.obj2 = obj2;
	}
	
	
}
