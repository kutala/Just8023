package com.kuta.just8023.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.log4j.Logger;

public class HttpClientUtil {
	
	public static Logger logger = Logger.getLogger(HttpClientUtil.class);
	
	/**
	 * @notes:HttpClient Get Method
	 *
	 * @param url			请求URL
	 * @param paramMap		请求参数
	 * @return
	 */
	public static String get(String url, Map<String, Object> paramMap) {
		
		HttpClient client = new HttpClient();
		GetMethod httpGet = null;
		InputStream responseIn = null;
		BufferedReader inBR = null;
		try {
			if (null != paramMap && !paramMap.isEmpty()) {
				Iterator<Entry<String, Object>> itr = paramMap.entrySet().iterator();
				while (itr.hasNext()) {
					Entry<String, Object> entry = itr.next();
					String key = entry.getKey();
					String value = entry.getValue().toString();
					if (url.endsWith("?")) {
						url += "";
					} else if(url.indexOf("?") > 0) {
						url += "&";
					} else {
						url += "?";
					}
					url += key + "=" + URLEncoder.encode(value, "UTF-8");
				}
			}
	    	
	    	/**
	    	 * HttpGet发送搜索请求
	    	 */
			logger.error("HttpClient.get URL=" + url);
	    	httpGet = new GetMethod(url);
	    	
			client.executeMethod(httpGet);
			responseIn = httpGet.getResponseBodyAsStream();
			inBR = new BufferedReader(new InputStreamReader(responseIn,"UTF-8"));
			StringBuffer buffer = new StringBuffer();
			String line = "";
			while ((line = inBR.readLine()) != null){
				buffer.append(line);
			}
			
			logger.info(buffer.toString());
			
			return buffer.toString();
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != responseIn) responseIn.close();
				if (null != inBR) inBR.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (null != httpGet) httpGet.releaseConnection();
		}
		
		return null;
	}
	
	/**
	 * @notes:HttpClient POST Method
	 *
	 * @param url			请求URL
	 * @param paramMap		请求参数
	 * @return
	 */
	public static String post(String url, Map<String, Object> paramMap) {
		
		HttpClient client = new HttpClient();
		PostMethod httpPost = null;
		InputStream responseIn = null;
		BufferedReader inBR = null;
		try {
			List<NameValuePair> nvps = new ArrayList<NameValuePair>(0);
			if (null != paramMap && !paramMap.isEmpty()) {
				Iterator<Entry<String, Object>> itr = paramMap.entrySet().iterator();
				while (itr.hasNext()) {
					Entry<String, Object> entry = itr.next();
					String key = entry.getKey();
					String value = entry.getValue().toString();
					NameValuePair valuePair = new NameValuePair(key, value);
					nvps.add(valuePair);
				}
			}
	    	
	    	/**
	    	 * PostMethod发送搜索请求
	    	 */
			httpPost = new PostMethod(url);
			httpPost.setRequestBody(nvps.toArray(new NameValuePair[nvps.size()]));
	    	
			int statusCode = client.executeMethod(httpPost);
			if (HttpStatus.SC_OK != statusCode) {
				return null;
			}
			responseIn = httpPost.getResponseBodyAsStream();
			inBR = new BufferedReader(new InputStreamReader(responseIn));
			StringBuffer buffer = new StringBuffer();
			String line = "";
			while ((line = inBR.readLine()) != null){
				buffer.append(line);
			}
			
			logger.info(buffer.toString());
			
			return buffer.toString();
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != responseIn) responseIn.close();
				if (null != inBR) inBR.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (null != httpPost) httpPost.releaseConnection();
		}
		
		return null;
	}
}
