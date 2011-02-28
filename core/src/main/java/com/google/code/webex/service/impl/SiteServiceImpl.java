package com.google.code.webex.service.impl;

import com.google.code.webex.service.SiteService;

public class SiteServiceImpl extends WebExJaxbService implements
	SiteService {

	public SiteServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}
}
