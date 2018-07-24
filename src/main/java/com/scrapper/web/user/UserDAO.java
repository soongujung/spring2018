package com.scrapper.web.user;

import com.scrapper.web.user.dto.UserDTO;
import com.scrapper.web.user.vo.UserVO;

public interface UserDAO {
	public UserVO selectUserForLogin(UserDTO userDto) throws Exception;
}
