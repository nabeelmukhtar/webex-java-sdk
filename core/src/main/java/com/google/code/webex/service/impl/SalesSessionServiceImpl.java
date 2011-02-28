package com.google.code.webex.service.impl;

import com.google.code.webex.service.SalesSessionService;

public class SalesSessionServiceImpl extends WebExJaxbService implements
	SalesSessionService {

	public SalesSessionServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}
}
