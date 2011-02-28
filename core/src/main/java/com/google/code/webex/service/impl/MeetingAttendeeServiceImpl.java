package com.google.code.webex.service.impl;

import com.google.code.webex.service.MeetingAttendeeService;

public class MeetingAttendeeServiceImpl extends WebExJaxbService implements
	MeetingAttendeeService {

	public MeetingAttendeeServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}
}
