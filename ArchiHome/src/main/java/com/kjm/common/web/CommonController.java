package com.kjm.common.web;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kjm.common.CommonUtil;
import com.kjm.common.Constant;
import com.kjm.common.service.CommonService;
import com.kjm.common.service.CommonVO;

@Controller
public class CommonController {
	
	@RequestMapping(value = "/home.do")
	public String main(@ModelAttribute("commonVO") CommonVO commonVO, ModelMap model) throws Exception
	{
		return "home";
	}
	
	@RequestMapping(value = "/login.do")
	public String login(@RequestParam HashMap<String,Object> parameterMap, 
			HttpServletRequest request, ModelMap model) throws Exception
	{
		try{
			HttpSession session = request.getSession();
			if(CommonUtil.isNull(session.getAttribute(Constant.CONSTANT_USERID)))
			{
				// session login 되어있지 않을경우 로그인 페이지로 이동.
				return "login";
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		// session login 되어있을경우 페이지 이동없음.
		return "";
	}
	
	@RequestMapping(value = "/logon.do")
	public String logon(@ModelAttribute("commonVO") CommonVO commonVO, 
			HttpServletRequest request, ModelMap model) throws Exception
	{
		//List<?> userInfo = commonService.selectUserInfo(commonVO);
		
		return "home";
	}
}
