/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class VideoCallChangeEvent extends SObject {
	public static SObjectType$<VideoCallChangeEvent> SObjectType;
	public static SObjectFields$<VideoCallChangeEvent> Fields;

	public Datetime AcceptanceTimeStamp;
	public Object ChangeEventHeader;
	public Id ConsentedUserId;
	public User ConsentedUser;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Integer DurationInSeconds;
	public Datetime EndDateTime;
	public Id EventId;
	public Event Event;
	public String ExternalId;
	public Id HostId;
	public User Host;
	public Id Id;
	public Integer IntelligenceScore;
	public Boolean IsCallCoachingIncluded;
	public Boolean IsDiarizationOptIn;
	public Boolean IsRecorded;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MeetingType;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id RelatedRecordId;
	public SObject RelatedRecord;
	public String ReplayId;
	public Datetime StartDateTime;
	public String TranscribedLanguage;
	public String VendorMeetingKey;
	public String VendorMeetingUuid;
	public String VendorName;

	public VideoCallChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public VideoCallChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public VideoCallChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public VideoCallChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public VideoCallChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
