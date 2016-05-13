package egovframework.archi.group.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.archi.group.service.GroupMainVO;

/**
 * @Class Name : GroupMainController.java
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
public class GroupMainController {

	@RequestMapping(value = "/groupMain.do")
	public String groupMain(@ModelAttribute("groupMainVO") GroupMainVO groupMainVO,
			ModelMap model) throws Exception
	{
		return "home_group";
	}
}
