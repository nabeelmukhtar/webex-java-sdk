package com.google.code.webex.service.impl;

import com.google.code.webex.service.EventSessionService;

public class EventSessionServiceImpl extends WebExJaxbService implements
		EventSessionService {

	public EventSessionServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}
}
