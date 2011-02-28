package com.google.code.webex.service.impl;

import com.google.code.webex.service.MeetingTypeService;

public class MeetingTypeServiceImpl extends WebExJaxbService implements
	MeetingTypeService {

	public MeetingTypeServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}
}
