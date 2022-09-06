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
public class Shift extends SObject {
	public static SObjectType$<Shift> SObjectType;
	public static SObjectFields$<Shift> Fields;

	public String BackgroundColor;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EndTime;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsHolidayShift;
	public Boolean IsNonStandard;
	public Id JobProfileId;
	public JobProfile JobProfile;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id OwnerId;
	public Name Owner;
	public Id RecordsetFilterCriteriaId;
	public RecordsetFilterCriteria RecordsetFilterCriteria;
	public Id ServiceResourceId;
	public ServiceResource ServiceResource;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public String ShiftNumber;
	public Id ShiftTemplateId;
	public ShiftTemplate ShiftTemplate;
	public Datetime StartTime;
	public String Status;
	public String StatusCategory;
	public Datetime SystemModstamp;
	public String TimeSlotType;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ShiftFeed[] Feeds;
	public ShiftHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ShiftShare[] Shares;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public Shift clone$() {throw new java.lang.UnsupportedOperationException();}
	public Shift clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Shift clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Shift clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Shift clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
