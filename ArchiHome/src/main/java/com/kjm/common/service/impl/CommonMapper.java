package com.kjm.common.service.impl;

import java.util.List;

import com.kjm.common.service.CommonVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("commonMapper")
public interface CommonMapper {

	/**
	 * 글 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return 글 목록
	 * @exception Exception
	 */
	List<?> selectUserInfo(CommonVO commonVO) throws Exception;
	
}
