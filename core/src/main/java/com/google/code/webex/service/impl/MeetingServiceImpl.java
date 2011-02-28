package com.google.code.webex.service.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.google.code.webex.service.MeetingService;
import com.google.code.webex.service.util.ApplicationConstants;
import com.google.code.webex.service.util.WebExUrls;
import com.google.code.webex.service.util.WebExUrls.WebExUrlBuilder;
import com.webex.schemas._2002._06.service.BodyContentType;
import com.webex.schemas._2002._06.service.LstControlType;
import com.webex.schemas._2002._06.service.MessageType;
import com.webex.schemas._2002._06.service.meeting.LstsummaryMeeting;
import com.webex.schemas._2002._06.service.meeting.LstsummaryMeetingResponse;
import com.webex.schemas._2002._06.service.meeting.MeetingSummaryInstanceType;
import com.webex.schemas._2002._06.service.meeting.ObjectFactory;
import com.webex.schemas._2002._06.service.meeting.OrderByType;
import com.webex.schemas._2002._06.service.meeting.OrderType;

public class MeetingServiceImpl extends WebExJaxbService implements
	MeetingService {

	public MeetingServiceImpl(String webExId, String password,
			Long siteId, String siteName, String partnerId) {
		super(webExId, password, siteId, siteName, partnerId);
	}

	@Override
	public List<MeetingSummaryInstanceType> getMeetingSummaries() {
		WebExUrlBuilder builder = createWebExUrlBuilder(WebExUrls.API_URL);
		ObjectFactory factory = new ObjectFactory();
		LstsummaryMeeting summaryMeeting = factory.createLstsummaryMeeting();
		LstControlType listControl = new com.webex.schemas._2002._06.service.ObjectFactory().createLstControlType();
		summaryMeeting.setListControl(listControl);
		listControl.setMaximumNum(BigInteger.valueOf(5));
		OrderType order = factory.createOrderType();
		summaryMeeting.setOrder(order);
		order.getOrderBy().add(OrderByType.STARTTIME);
		
		MessageType request = createRequest(summaryMeeting);
		MessageType response = unmarshallObject(MessageType.class, callApiMethod(builder.buildUrl(), marshallObject(request), ApplicationConstants.CONTENT_TYPE_XML, HttpMethod.POST, 200));
		
		List<BodyContentType> bodyContents = response.getBody().getBodyContent();
		if (!bodyContents.isEmpty()) {
			return ((LstsummaryMeetingResponse) bodyContents.get(0)).getMeeting();			
		}
		return new ArrayList<MeetingSummaryInstanceType>();
	}
}
