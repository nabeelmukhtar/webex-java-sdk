/**
 * 
 */
package com.google.code.webex.service;

import java.util.List;

import com.webex.schemas._2002._06.service.meeting.MeetingSummaryInstanceType;

/**
 * @author nmukhtar
 *
 */
public interface MeetingService extends WebExService {
	
	public List<MeetingSummaryInstanceType> getMeetingSummaries();
}
