package com.crxl.qpp.comic2.getUrl;

import com.crxl.qpp.comic2.weChat.dao.impl.WeiXinDaoImpl;
import com.crxl.qpp.comic2.weChat.model.useValue;


public class GetUrl {
	
	
	public static String getWXGameUrl(String str){
		WeiXinDaoImpl dao=new WeiXinDaoImpl();
		String pathUrl=null;
		try {
			pathUrl=dao.getCodeUrl(useValue.AppId,str,"snsapi_userinfo", "state");
			System.out.println(pathUrl);
		} catch (Exception e) {
			
		}
		return pathUrl;
	}

	public static String getGameUrl(String gameId){
	//	String url="http://192.168.1.20:8080/#/cartoonimg?id=5Fs4Wv3hwqRKPqCJwgVCSPmoDLtQ9PIO&cartoonId=YFKRbu5IXnNPggM3rYQQHZeay0tatZxE&moneyState=0&sort=1";
	//String url="http://www.edisonluorui.com/htmlGame.html?gameid="+gameId+"&qd=CRXL";
	String url="http://www.kakamanhua.com/htd/#/cartoonimg?id=wTCGPjRPAfj7rbjrqe1MotxaN4v47HIA&cartoonId=5SVQhTghPJmyk45h7w6p9hh2Pe6lPhaN&moneyState=0&sort=1&ts=1";
		WeiXinDaoImpl dao=new WeiXinDaoImpl();
		String pathUrl=null;
		try {
			pathUrl=dao.getCodeUrl(useValue.AppId,url,"snsapi_userinfo", "state");
			System.out.println(pathUrl);
		} catch (Exception e) {
			
		}
		return pathUrl;
	}
	
	
	public static void main(String[] args){
//		String url="http://www.kktoon.com/#/cartoonimg?id=4lpFjWbqfopp0SpQsumncyUUa8zgcCKY&cartoonId=geEcrUftKIRgeoEGe99MPnOsVwfy1IWg&moneyState=0&sort=1&ts=1";
		String url="http://www.kktoon.com/htd/#/login?cartoonSetId=OwGKlBsPXC5dImjyvpDPaFzDrz7gMhmv&cartoonId=F0j6l0kqgjsxpg6mHV3Gl32anUAGKCuO&moneyState=0";
		
//		String url="http://www.kktoon.com/UserLoginWX.html?qd=PT";
	//	String url="http://www.kktoon.com/htd/#/login?qd=PT";
		
		WeiXinDaoImpl dao=new WeiXinDaoImpl();
		String pathUrl=null;
		try {
			pathUrl=dao.getCodeUrl(useValue.AppId,url,"snsapi_userinfo", "state");
			System.out.println(pathUrl);
		} catch (Exception e) {
			
		}
		System.out.println(pathUrl);
	}
}
