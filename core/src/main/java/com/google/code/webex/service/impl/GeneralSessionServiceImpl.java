package com.google.code.webex.service.impl;

import com.google.code.webex.service.GeneralSessionService;

public class GeneralSessionServiceImpl extends WebExJaxbService implements
		GeneralSessionService {

	public GeneralSessionServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}
}
