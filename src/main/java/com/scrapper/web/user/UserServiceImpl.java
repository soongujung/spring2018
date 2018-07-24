package com.scrapper.web.user;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.scrapper.web.user.dto.UserDTO;
import com.scrapper.web.user.vo.UserVO;


@Service
public class UserServiceImpl implements UserService{
	
	@Inject
	private UserDAO userDAO;

	@Override
	public UserVO login(UserDTO userDto) throws Exception {
//		return userDAO.selectUserForLogin(userDto) != null ? true : false;
		return userDAO.selectUserForLogin(userDto);
	}

}
