package com.kuta.just8023.util;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;

public class Resful2Utils {

	//-- header 常量定义 --//
	private static final String HEADER_ENCODING = "encoding";
	private static final String HEADER_NOCACHE = "no-cache";
	private static final String DEFAULT_ENCODING = "UTF-8";
	private static final boolean DEFAULT_NOCACHE = true;

	private static ObjectMapper mapper = new ObjectMapper();

	//-- 绕过jsp/freemaker直接输出文本的函数 --//
	/**
	 * 直接输出内容的简便函数.

	 * eg.
	 * render("text/plain", "hello", "encoding:GBK");
	 * render("text/plain", "hello", "no-cache:false");
	 * render("text/plain", "hello", "encoding:GBK", "no-cache:false");
	 * 
	 * @param headers 可变的header数组，目前接受的值为"encoding:"或"no-cache:",默认值分别为UTF-8和true.
	 */
	public static void render(HttpServletResponse response, final String contentType, final String content, final String... headers) {
		response = initResponseHeader(response, contentType, headers);
		try {
			response.getWriter().write(content);
			response.getWriter().flush();
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public static <T> void renderXML(HttpServletResponse response, final T object, Class<T> cls, final String... headers) {
		response = initResponseHeader(response, ServletUtils.XML_TYPE, headers);
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(cls);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(object, response.getWriter());
			response.getWriter().flush();
		} catch (JAXBException e) {
			throw new RuntimeException(e.getMessage(), e);
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		}

	}

	/**
	 * 直接输出文本.
	 * @see #render(String, String, String...)
	 */
	public static void renderText(HttpServletResponse response, final String text, final String... headers) {
		render(response, ServletUtils.TEXT_TYPE, text, headers);
	}

	/**
	 * 直接输出HTML.
	 * @see #render(String, String, String...)
	 */
	public static void renderHtml(HttpServletResponse response, final String html, final String... headers) {
		render(response, ServletUtils.HTML_TYPE, html, headers);
	}

	/**
	 * 直接输出XML.
	 * @see #render(String, String, String...)
	 */
	public static void renderXml(HttpServletResponse response, final String xml, final String... headers) {
		render(response, ServletUtils.XML_TYPE, xml, headers);
	}

	/**
	 * 直接输出JSON.
	 * 
	 * @param jsonString json字符串.
	 * @see #render(String, String, String...)
	 */
	public static void renderJson(HttpServletResponse response, final String jsonString, final String... headers) {
		render(response, ServletUtils.JSON_TYPE, jsonString, headers);
	}

	/**
	 * 直接输出JSON,使用Jackson转换Java对象.
	 * 
	 * @param data 可以是List<POJO>, POJO[], POJO, 也可以Map名值对.
	 * @see #render(String, String, String...)
	 */
	public static void renderJson(HttpServletResponse response, final Object data, final String... headers) {
		response = initResponseHeader(response, ServletUtils.JSON_TYPE, headers);
		try {
			mapper.writeValue(response.getWriter(), data);
		} catch (IOException e) {
			throw new IllegalArgumentException(e);
		}
	}

	/**
	 * 直接输出支持跨域Mashup的JSONP.
	 * 
	 * @param callbackName callback函数名.
	 * @param object Java对象,可以是List<POJO>, POJO[], POJO ,也可以Map名值对, 将被转化为json字符串.
	 */
	public static void renderJsonp(HttpServletResponse response, final String callbackName, final Object object, final String... headers) {
		String jsonString = null;
		try {
			jsonString = mapper.writeValueAsString(object);
		} catch (IOException e) {
			throw new IllegalArgumentException(e);
		}

		String result = new StringBuilder().append(callbackName).append("(").append(jsonString).append(");").toString();

		//渲染Content-Type为javascript的返回内容,输出结果为javascript语句, 如callback197("{html:'Hello World!!!'}");
		render(response, ServletUtils.JS_TYPE, result, headers);
	}

	public static void renderJavascript(HttpServletResponse response, final String jsValue, String... heads) {
		render(response, ServletUtils.JS_TYPE, jsValue, heads);

	}

	/**
	 * 分析并设置contentType与headers.
	 */
	private static HttpServletResponse initResponseHeader(HttpServletResponse response, final String contentType, final String... headers) {
		//分析headers参数
		String encoding = DEFAULT_ENCODING;
		boolean noCache = DEFAULT_NOCACHE;
		for (String header : headers) {
			String headerName = StringUtils.substringBefore(header, ":");
			String headerValue = StringUtils.substringAfter(header, ":");

			if (StringUtils.equalsIgnoreCase(headerName, HEADER_ENCODING)) {
				encoding = headerValue;
			} else if (StringUtils.equalsIgnoreCase(headerName, HEADER_NOCACHE)) {
				noCache = Boolean.parseBoolean(headerValue);
			} else {
				throw new IllegalArgumentException(headerName + "不是一个合法的header类型");
			}
		}

		//设置headers参数
		String fullContentType = contentType + ";charset=" + encoding;
		response.setContentType(fullContentType);
		if (noCache) {
			ServletUtils.setNoCacheHeader(response);
		}
		return response;
	}

	public static boolean isValidateURL(String url) {
		return StringUtils.startsWithIgnoreCase(url, "http://");
	}

	public static String getRealIP(HttpServletRequest request) {
	/*	String ip = Struts2Utils.getRequest().getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			//nginx proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
			ip = Struts2Utils.getRequest().getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = Struts2Utils.getRequest().getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = Struts2Utils.getRequest().getRemoteAddr();
		}
		return ip;*/
		
		String REALIP=request.getHeader("cdn-src-ip");
		if(StringUtils.isBlank(REALIP)){
			REALIP= request.getHeader("x-forwarded-for");
			if(StringUtils.isNotBlank(REALIP)){
				for(String IP:REALIP.split(",")){
					if(IP.startsWith("192.168")||IP.startsWith("10")||IP.startsWith("172.16")){
						continue;
					}else{
						REALIP=IP;
						break;
					}
				}
			}
			if(StringUtils.isBlank(REALIP)){
				REALIP=request.getHeader("x-real-ip");
			}
			if(StringUtils.isBlank(REALIP)){
				REALIP=request.getRemoteAddr();
			}
		}
		return REALIP;
	}

	public static int getRealPort() {
		return 80;
	}

	/*public static String getDefaultCity() {
		IPSeeker seeker = IPSeeker.getInstance();
		return seeker.getCountry(getRealIP());
	}*/

}
