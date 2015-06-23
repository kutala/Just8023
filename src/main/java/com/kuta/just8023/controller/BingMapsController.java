package com.kuta.just8023.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kuta.just8023.util.HttpClientUtil;
import com.kuta.just8023.util.Resful2Utils;

@Controller
@RequestMapping("/maps/*")
public class BingMapsController {

		/**
		 * @notes: calculate route
		 * @param model
		 * @param response
		 * @author: kuta.li
		 * @date: 2015-6-16-下午2:20:15
		 */
	 	@RequestMapping(value="index", method = RequestMethod.GET)
	    public void index(ModelMap model, HttpServletResponse response) {
	 		String from = "31.256,121.464";	//起点
	 		String to = "31.109,121.236";		//终点
	 		String avoid = "minimizeTolls";	//路线优先
	 		String key = "AiP4SUtxfaKpmHJS9W_OvbuLUCVR0AoqAyVBkFiuW7alnWmHouHB7X3Go60pT8rn";
	 		String responseStr = HttpClientUtil.get("http://dev.virtualearth.net/REST/V1/Routes/Driving?o=json&wp.0=" + from + "&wp.1=" + to + "&avoid=" + avoid + "&key=" + key, null);
	 		Resful2Utils.renderJson(response, responseStr);
	    }
	 	
	 	/**
	 	 * @notes: calculate route with route path
	 	 * @param model
	 	 * @param response
	 	 * @author: kuta.li
	 	 * @date: 2015-6-16-下午2:21:18
	 	 */
 		@RequestMapping(value="index2", method = RequestMethod.GET)
	    public void index2(ModelMap model, HttpServletResponse response) {
	 		String from = "31.256,121.464";	//起点
	 		String to = "31.109,121.236";		//终点
	 		String key = "AiP4SUtxfaKpmHJS9W_OvbuLUCVR0AoqAyVBkFiuW7alnWmHouHB7X3Go60pT8rn";
	 		String responseStr = HttpClientUtil.get("http://dev.virtualearth.net/REST/V1/Routes/Driving?wp.0=" + from + "&wp.1=" + to + "&optmz=distance&routeAttributes=routePath&key=" + key, null);
	 		Resful2Utils.renderJson(response, responseStr);
	    }
}
