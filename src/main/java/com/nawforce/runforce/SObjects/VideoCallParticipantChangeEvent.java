/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class VideoCallParticipantChangeEvent extends SObject {
	public static SObjectType$<VideoCallParticipantChangeEvent> SObjectType;
	public static SObjectFields$<VideoCallParticipantChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Email;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id RelatedPersonId;
	public SObject RelatedPerson;
	public String ReplayId;
	public Id VideoCallId;
	public VideoCall VideoCall;

	public VideoCallParticipantChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public VideoCallParticipantChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public VideoCallParticipantChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public VideoCallParticipantChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public VideoCallParticipantChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
