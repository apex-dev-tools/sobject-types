/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class WorkCapacityLimit extends SObject {
	public static SObjectType$<WorkCapacityLimit> SObjectType;
	public static SObjectFields$<WorkCapacityLimit> Fields;

	public String CapacityLimitRelaxation;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Date EndDate;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsFriday;
	public Boolean IsMonday;
	public Boolean IsSaturday;
	public Boolean IsSunday;
	public Boolean IsSvcTerrOnlyLimit;
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
	public String SvcApptFieldValDplyNm;
	public String SvcApptFieldValue;
	public Datetime SystemModstamp;
	public String TimePeriod;
	public String WorkCapacityLimitNumber;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WorkCapacityLimitFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public WorkCapacityLimitHistory[] Histories;
	public NetworkActivityAudit[] ParentEntities;
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
