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
public class OperatingHoursHoliday extends SObject {
	public static SObjectType$<OperatingHoursHoliday> SObjectType;
	public static SObjectFields$<OperatingHoursHoliday> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DateAndTime;
	public Id HolidayId;
	public Holiday Holiday;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String OperatingHoursHolidayNumber;
	public Id OperatingHoursId;
	public OperatingHours OperatingHours;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public OperatingHoursHolidayFeed[] Feeds;
	public OpenActivity[] OpenActivities;
	public Task[] Tasks;

	public OperatingHoursHoliday clone$() {throw new java.lang.UnsupportedOperationException();}
	public OperatingHoursHoliday clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OperatingHoursHoliday clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OperatingHoursHoliday clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OperatingHoursHoliday clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
