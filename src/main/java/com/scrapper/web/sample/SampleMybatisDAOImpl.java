package com.scrapper.web.sample;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
;

@Repository
public class SampleMybatisDAOImpl implements SampleMybatisDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.scrapper.web.sample";

	@Override
	public List<SampleMybatisVO> selectAllData() {
		return sqlSession.selectList(namespace + ".selectAllData");
	}
	
}
