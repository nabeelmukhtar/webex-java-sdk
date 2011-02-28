package com.google.code.webex.service.impl;

import com.google.code.webex.service.HistoryService;

public class HistoryServiceImpl extends WebExJaxbService implements
		HistoryService {

	public HistoryServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}
}
