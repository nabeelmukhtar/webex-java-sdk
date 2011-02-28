package com.google.code.webex.service.impl;

import com.google.code.webex.service.SupportSessionService;

public class SupportSessionServiceImpl extends WebExJaxbService implements
	SupportSessionService {

	public SupportSessionServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}
}
