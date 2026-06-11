/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class EventStagedInviteeEmail extends SObject {
	public static SObjectType$<EventStagedInviteeEmail> SObjectType;
	public static SObjectFields$<EventStagedInviteeEmail> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id EventId;
	public Event Event;
	public Id Id;
	public Boolean IsArchived;
	public Boolean IsDeleted;
	public Boolean IsOrganizer;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id StagedInviteeEmailId;
	public StagedInviteeEmail StagedInviteeEmail;
	public String Status;
	public Datetime SystemModstamp;

	public EventStagedInviteeEmail clone$() {throw new java.lang.UnsupportedOperationException();}
	public EventStagedInviteeEmail clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EventStagedInviteeEmail clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EventStagedInviteeEmail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EventStagedInviteeEmail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
