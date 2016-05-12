package com.kjm.common.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.kjm.common.service.CommonService;
import com.kjm.common.service.CommonVO;

public class CommonServiceImpl implements CommonService{

	@Resource(name = "commonDAO")
	private CommonDAO commonDAO;
	
	@Override
	public List<?> selectUserInfo(CommonVO commonVO) throws Exception{
		return commonDAO.selectUserInfo(commonVO);
	}
	
}
