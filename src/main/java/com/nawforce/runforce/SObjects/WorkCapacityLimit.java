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
public class WorkCapacityLimit extends SObject {
	public static SObjectType$<WorkCapacityLimit> SObjectType;
	public static SObjectFields$<WorkCapacityLimit> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Date EndDate;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsFriday;
	public Boolean IsMonday;
	public Boolean IsSaturday;
	public Boolean IsSunday;
	public Boolean IsThursday;
	public Boolean IsTuesday;
	public Boolean IsWednesday;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LimitationUnits;
	public Decimal LimitationValue;
	public Id OwnerId;
	public Name Owner;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public Date StartDate;
	public String SvcApptField;
	public String SvcApptFieldValue;
	public Datetime SystemModstamp;
	public String TimePeriod;
	public String WorkCapacityLimitNumber;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WorkCapacityLimitFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public WorkCapacityLimitHistory[] Histories;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public WorkCapacityLimitShare[] Shares;
	public TopicAssignment[] TopicAssignments;

	public WorkCapacityLimit clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkCapacityLimit clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkCapacityLimit clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkCapacityLimit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkCapacityLimit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
