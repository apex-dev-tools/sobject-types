/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
	public WorkOrder ParentEntity;
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

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public EntityMilestoneFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
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
