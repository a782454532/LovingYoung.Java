package lovingyoung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Request{
	/**
	 * @param url
	 * 发送请求的URL
	 * @param param
	 * 请求参数,name1=value1&name2=value2
	 * @return result 远程响应结果
	 */
	public static String sendGet(String url,String param){
		String result="";
		Scanner in=null;
		try{
			String urlNameString=url+"?"+param+"&output=json&ak=Qa6GSM4MySGSARXMLpSwqUQt";
			URL realUrl=new URL(urlNameString);
			URLConnection connection=realUrl.openConnection();
			connection.setRequestProperty("accept","*/*");
			connection.setRequestProperty("connection","Keep-Alive");
			connection.connect();
			Map<String,List<String>> map=connection.getHeaderFields();
			for(String key:map.keySet()){
				System.out.println(key+"-->"+map.get(key));
			}
			in =new Scanner(connection.getInputStream());
			String line;
			while(in.hasNextLine()){
				line=in.nextLine();
				System.out.println(line);
				result+=line;
			}
		} catch(Exception e){
			System.out.println("发送GET请求异常!"+e);
			e.printStackTrace();
		}
		finally{
			try{
				if(in!=null){
					in.close();
				}
			}catch (Exception e2){
				e2.printStackTrace();
			}
		}
		return result;
	}

	public static void main(String[] args) {
		//发送 GET 请求
		//		String s=HttpRequest.sendGet("http://api.map.baidu.com/place/v2/search", "q=饭店&region=北京");
		//		System.out.println(s);
		String web="http://api.map.baidu.com/place/v2/search";
		String param="";
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入搜索内容:");
		param=param+"q="+sc.next();
		System.out.print("请输入搜索地点:");
		param=param+"&region="+sc.next();
		System.out.println(param);
		String s=Request.sendGet(web,param);
	}
}
