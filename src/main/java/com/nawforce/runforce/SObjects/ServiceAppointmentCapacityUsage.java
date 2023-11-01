/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ServiceAppointmentCapacityUsage extends SObject {
	public static SObjectType$<ServiceAppointmentCapacityUsage> SObjectType;
	public static SObjectFields$<ServiceAppointmentCapacityUsage> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal EstimatedUsageInMinutes;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String ServiceAppointmentCapacityUsageAutonumber;
	public Id ServiceAppointmentId;
	public ServiceAppointment ServiceAppointment;
	public Datetime SystemModstamp;
	public Date UsageDate;
	public String WorkCapacityUsage;

	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ServiceAppointmentCapacityUsageFeed[] Feeds;
	public ServiceAppointmentCapacityUsageHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;

	public ServiceAppointmentCapacityUsage clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointmentCapacityUsage clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointmentCapacityUsage clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointmentCapacityUsage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointmentCapacityUsage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
