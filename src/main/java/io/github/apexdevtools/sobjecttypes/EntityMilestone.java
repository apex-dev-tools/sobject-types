/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class EntityMilestone extends SObject {
	public static SObjectType$<EntityMilestone> SObjectType;
	public static SObjectFields$<EntityMilestone> Fields;

	public Decimal ActualElapsedTimeInDays;
	public Decimal ActualElapsedTimeInHrs;
	public Integer ActualElapsedTimeInMins;
	public Id BusinessHoursId;
	public BusinessHours BusinessHours;
	public Datetime CompletionDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal ElapsedTimeInDays;
	public Decimal ElapsedTimeInHrs;
	public Integer ElapsedTimeInMins;
	public Id Id;
	public Boolean IsCompleted;
	public Boolean IsDeleted;
	public Boolean IsViolated;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MilestoneTypeId;
	public MilestoneType MilestoneType;
	public String Name;
	public Id ParentEntityId;
	public SObject ParentEntity;
	public Id SlaProcessId;
	public SlaProcess SlaProcess;
	public Datetime StartDate;
	public Decimal StoppedTimeInDays;
	public Decimal StoppedTimeInHrs;
	public Integer StoppedTimeInMins;
	public Datetime SystemModstamp;
	public Datetime TargetDate;
	public Decimal TargetResponseInDays;
	public Decimal TargetResponseInHrs;
	public Integer TargetResponseInMins;
	public Decimal TimeRemainingInDays;
	public String TimeRemainingInHrs;
	public String TimeRemainingInMins;
	public Decimal TimeSinceTargetInDays;
	public String TimeSinceTargetInHrs;
	public String TimeSinceTargetInMins;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public EntityMilestoneFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public EntityMilestoneHistory[] Histories;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public EntityMilestone clone$() {throw new java.lang.UnsupportedOperationException();}
	public EntityMilestone clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EntityMilestone clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EntityMilestone clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EntityMilestone clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
