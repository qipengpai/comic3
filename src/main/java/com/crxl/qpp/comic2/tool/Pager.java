package com.crxl.qpp.comic2.tool;

import java.io.Serializable;


/**
 * 
 * <b> 分页通用类 </b>
 * 
 * @author kangxu
 *
 */
public class Pager implements Serializable {
	public int nowpage;
	public int linepage;
	public int totalpage;
	public int totaldata;

	public int getNowpage() {
		return nowpage;
	}

	public void setNowpage(int nowpage) {
		this.nowpage = nowpage;
	}

	public int getTotalpage() {
		return (totalpage - 1) * linepage;
	}

	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}

	public int getTotaldata() {
		return totaldata;
	}

	public void setTotaldata(int totaldata) {
		this.totaldata = totaldata;
	}

	public int getLinepage() {
		return linepage;
	}

	public void setLinepage(int linepage) {
		this.linepage = linepage;
	}

}