/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class OperatingHours extends SObject {
	public static SObjectType$<OperatingHours> SObjectType;
	public static SObjectFields$<OperatingHours> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String OperatingHoursRowType;
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;
	public String TimeZone;

	public Account[] Accounts;
	public AppointmentTopicTimeSlot[] AppointmentTopicTimeSlots;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public OperatingHoursFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public OperatingHoursHoliday[] OperatingHoursHolidays;
	public NetworkActivityAudit[] ParentEntities;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ServiceResourcePreference[] ServiceResourcePreferences;
	public ServiceTerritory[] ServiceTerritories;
	public OperatingHoursShare[] Shares;
	public TimeSlot[] TimeSlots;

	public OperatingHours clone$() {throw new java.lang.UnsupportedOperationException();}
	public OperatingHours clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OperatingHours clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OperatingHours clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OperatingHours clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
