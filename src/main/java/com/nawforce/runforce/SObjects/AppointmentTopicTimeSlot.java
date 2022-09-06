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
public class AppointmentTopicTimeSlot extends SObject {
	public static SObjectType$<AppointmentTopicTimeSlot> SObjectType;
	public static SObjectFields$<AppointmentTopicTimeSlot> Fields;

	public String AppointmentTopicTimeSlotKey;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OperatingHoursId;
	public OperatingHours OperatingHours;
	public Datetime SystemModstamp;
	public Id TimeSlotId;
	public TimeSlot TimeSlot;
	public Id WorkTypeGroupId;
	public WorkTypeGroup WorkTypeGroup;
	public Id WorkTypeId;
	public WorkType WorkType;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public AppointmentTopicTimeSlotFeed[] Feeds;
	public AppointmentTopicTimeSlotHistory[] Histories;

	public AppointmentTopicTimeSlot clone$() {throw new java.lang.UnsupportedOperationException();}
	public AppointmentTopicTimeSlot clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AppointmentTopicTimeSlot clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AppointmentTopicTimeSlot clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AppointmentTopicTimeSlot clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
