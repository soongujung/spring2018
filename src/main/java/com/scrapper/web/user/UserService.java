package com.scrapper.web.user;

import com.scrapper.web.user.dto.UserDTO;
import com.scrapper.web.user.vo.UserVO;

public interface UserService {
	public UserVO login(UserDTO userDto) throws Exception;
}
