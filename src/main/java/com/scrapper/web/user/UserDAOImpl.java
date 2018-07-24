package com.scrapper.web.user;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.scrapper.web.user.dto.UserDTO;
import com.scrapper.web.user.vo.UserVO;



@Repository
public class UserDAOImpl implements UserDAO{
	
	@Inject
	private SqlSession sqlSession;

	@Override
	public UserVO selectUserForLogin(UserDTO userDto) throws Exception {
		Map<String, Object> parameterMap = new HashMap<>();
		parameterMap.put("userId", userDto.getUserId());
		parameterMap.put("password", userDto.getPassword());
		return sqlSession.selectOne("com.scrapper.web.user.selectUserForLogin", parameterMap);
	}
	
}
