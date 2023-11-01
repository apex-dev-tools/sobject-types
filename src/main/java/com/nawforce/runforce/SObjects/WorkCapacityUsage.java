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
public class WorkCapacityUsage extends SObject {
	public static SObjectType$<WorkCapacityUsage> SObjectType;
	public static SObjectFields$<WorkCapacityUsage> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Date EndDate;
	public Id Id;
	public Boolean IsDeleted;
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
	public Decimal TimeConsumedInMinutes;
	public String TimePeriod;
	public String WcuUniqueField1;
	public String WcuUniqueField2;
	public String WorkCapacityUsageNumber;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WorkCapacityUsageFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public WorkCapacityUsageShare[] Shares;
	public TopicAssignment[] TopicAssignments;

	public WorkCapacityUsage clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkCapacityUsage clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkCapacityUsage clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkCapacityUsage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkCapacityUsage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
