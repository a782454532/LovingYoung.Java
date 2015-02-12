package lovingyoung;

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
				result+="\n"+line;
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
}
