package com.google.code.webex.service.impl;

import com.google.code.webex.service.TrainingSessionService;

public class TrainingSessionServiceImpl extends WebExJaxbService implements
	TrainingSessionService {

	public TrainingSessionServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}
}
