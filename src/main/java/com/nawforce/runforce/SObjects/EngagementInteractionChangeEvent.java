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
public class EngagementInteractionChangeEvent extends SObject {
	public static SObjectType$<EngagementInteractionChangeEvent> SObjectType;
	public static SObjectFields$<EngagementInteractionChangeEvent> Fields;

	public Datetime AttendeeVerificationTime;
	public Object ChangeEventHeader;
	public String CommunicationChannel;
	public Id ContextId;
	public SObject Context;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Duration;
	public Datetime EndDateTime;
	public String ExternalIdentifier;
	public Id Id;
	public Id InitiatingAttendeeId;
	public SObject InitiatingAttendee;
	public Boolean IsAttendeeAuthenticated;
	public Boolean IsAttendeeVerified;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String PhoneNumber;
	public String Reason;
	public String ReplayId;
	public String Sentiment;
	public Datetime StartDateTime;
	public String Status;
	public String Type;

	public EngagementInteractionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EngagementInteractionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EngagementInteractionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EngagementInteractionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EngagementInteractionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
