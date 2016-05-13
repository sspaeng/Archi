package com.kjm.common.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kjm.common.service.CommonVO;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("commonDAO")
public class CommonDAO extends EgovAbstractDAO {

	/**
	 * 사용자 정보를 조회한다.
	 * @param commonVO - 조회할 정보가 담긴 Map
	 * @return 사용자정보
	 * @exception Exception
	 */
/*	public List<?> selectUserInfo(CommonVO commonVO) throws Exception{
		return list("commonDAO.selectUserInfo", commonVO);
	}*/
	
}
