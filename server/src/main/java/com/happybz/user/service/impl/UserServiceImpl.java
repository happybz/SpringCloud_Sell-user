package com.happybz.user.service.impl;

import com.happybz.user.dataobject.UserInfo;
import com.happybz.user.repository.UserInfoRepostory;
import com.happybz.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserInfoRepostory repostory;
	/**
	 * 通过openid来查询用户信息
	 *
	 * @param openid
	 * @return
	 */
	@Override
	public UserInfo findByOpenid(String openid) {
		return repostory.findByOpenid(openid);
	}
}
