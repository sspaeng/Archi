package com.kjm.archiMain.web;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kjm.archiMain.service.MainService;
import com.kjm.archiMain.service.MainVO;


/**
 * @Class Name : MainController.java
 * @Description : Controller Class
 * @Modification Information
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @            최초생성
 *
 * @author 
 * @since 
 * @version 1.0
 * @see
 *
 *  Copyright (C) by SSPAENG All right reserved.
 */

@Controller
public class MainController {

	@RequestMapping(value = "/home.do")
	public String main(@ModelAttribute("mainVO") MainVO mainVO, ModelMap model) throws Exception
	{
		return "home";
	}
	
	@RequestMapping(value = "/login.do")
	public String login(@RequestParam HashMap<String,Object> parameterMap, 
			HttpServletRequest request, ModelMap model) throws Exception
	{
		try{
			HttpSession session = request.getSession();
			if(session.getAttribute("userId") == "")
			{
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return "";
	}
}
