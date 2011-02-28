package com.google.code.webex.service.impl;

import com.google.code.webex.service.UserService;

public class UserServiceImpl extends WebExJaxbService implements
	UserService {

	public UserServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}
}
