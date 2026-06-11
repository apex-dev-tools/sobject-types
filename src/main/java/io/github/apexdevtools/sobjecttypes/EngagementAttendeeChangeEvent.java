/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class EngagementAttendeeChangeEvent extends SObject {
	public static SObjectType$<EngagementAttendeeChangeEvent> SObjectType;
	public static SObjectFields$<EngagementAttendeeChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EndDateTime;
	public Id EngagementId;
	public SObject Engagement;
	public Id ExternalAttendeeId;
	public SObject ExternalAttendee;
	public Id Id;
	public Id InternalAttendeeId;
	public User InternalAttendee;
	public Boolean IsAuthenticated;
	public Boolean IsVerified;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public String Role;
	public Datetime StartDateTime;
	public Datetime VerificationTime;

	public EngagementAttendeeChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EngagementAttendeeChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EngagementAttendeeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EngagementAttendeeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EngagementAttendeeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
