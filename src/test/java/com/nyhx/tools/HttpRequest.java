/**
 * 
 */
package com.nyhx.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

/**
 * @author 深巷明朝
 * <p>Description: </p>
 * @date 2020年8月13日
 */
public class HttpRequest {
	private static boolean debug = true;
	//get请求
	    public static String sendGet(String url, String param) {
	        if (!debug) {
	            return "";
	        }
	        String result = "";
	        BufferedReader in = null;
	        try {
	        	param = urlEncode(param);
	            String urlNameString = url + "?" + param;
	            URL realUrl = new URL(urlNameString);

	            URLConnection connection = realUrl.openConnection();

	            connection.setRequestProperty("accept", "*/*");
	            connection.setRequestProperty("connection", "Keep-Alive");
	            connection.setRequestProperty("user-agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");

	            connection.connect();

	            Map<String, List<String>> map = connection.getHeaderFields();

	            for (String key : map.keySet()) {
	                System.out.println(key + "--->" + map.get(key));
	            }

	            in = new BufferedReader(new InputStreamReader(
	                    connection.getInputStream()));
	            String line;
	            while ((line = in.readLine()) != null) {
	                result += line;
	            }
	        } catch (Exception e) {
	            System.out.println("异常" + e);
	            e.printStackTrace();
	        } finally {
	            try {
	                if (in != null) {
	                    in.close();
	                }
	            } catch (Exception e2) {
	                e2.printStackTrace();
	            }
	        }
	        return result;
	    }
	// [post请求]
	    public static String sendPost(String url, String param) {
	        if (!debug) {
	            return "";
	        }
	        PrintWriter out = null;
	        BufferedReader in = null;
	        String result = "";
	        try {
	        	param = urlEncode(param);
	            URL realUrl = new URL(url);
	            URLConnection conn = realUrl.openConnection();
//	            conn.setRequestProperty("Content-Type", "application/json");
	            conn.setRequestProperty("charset", "utf-8");
	            conn.setRequestProperty("accept", "*/*");
	            conn.setRequestProperty("connection", "Keep-Alive");
	            conn.setRequestProperty("user-agent",
	                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
	            conn.setDoOutput(true);
	            conn.setDoInput(true); 
	            out = new PrintWriter(new OutputStreamWriter(conn.getOutputStream(), "utf-8"));
	            out.print(param);
	            out.flush();
	            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
	            String line;
	            while ((line = in.readLine()) != null) {
	                result += line;
	            }
	            System.out.println("sendPost"+result);
	        } catch (Exception e) {
	            System.out.println("异常" + e);
	            e.printStackTrace();
	        } finally {
	            try {
	                if (out != null) {
	                    out.close();
	                }
	                if (in != null) {
	                    in.close();
	                }
	            } catch (IOException ex) {
	                ex.printStackTrace();
	            }
	        }
	        return result;
	    }
	    
	    //参数进行urlEncode转换，避免中文传输出问题
	    public static String urlEncode(String url) throws UnsupportedEncodingException {
	        if(url == null) {
	            return null;
	        }
	        
	        final String reserved_char = ";/?:@=&";
	        String ret = "";
	        for(int i=0; i < url.length(); i++) {
	            String cs = String.valueOf( url.charAt(i) );
	            if(reserved_char.contains(cs)){
	                ret += cs;
	            }else{
	                ret += URLEncoder.encode(cs, "utf-8");
	            }
	        }
	        return ret.replace("+", "%20");
	    }
}
