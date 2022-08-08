/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class EntityMilestone extends SObject {
	public static SObjectType$<EntityMilestone> SObjectType;
	public static SObjectFields$<EntityMilestone> Fields;

	public Decimal ActualElapsedTimeInDays;
	public Decimal ActualElapsedTimeInHrs;
	public com.nawforce.runforce.System.Integer ActualElapsedTimeInMins;
	public Id BusinessHoursId;
	public BusinessHours BusinessHours;
	public Datetime CompletionDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public Decimal ElapsedTimeInDays;
	public Decimal ElapsedTimeInHrs;
	public com.nawforce.runforce.System.Integer ElapsedTimeInMins;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsCompleted;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsViolated;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MilestoneTypeId;
	public MilestoneType MilestoneType;
	public com.nawforce.runforce.System.String Name;
	public Id ParentEntityId;
	public WorkOrder ParentEntity;
	public Id SlaProcessId;
	public SlaProcess SlaProcess;
	public Datetime StartDate;
	public Decimal StoppedTimeInDays;
	public Decimal StoppedTimeInHrs;
	public com.nawforce.runforce.System.Integer StoppedTimeInMins;
	public Datetime SystemModstamp;
	public Datetime TargetDate;
	public Decimal TargetResponseInDays;
	public Decimal TargetResponseInHrs;
	public com.nawforce.runforce.System.Integer TargetResponseInMins;
	public Decimal TimeRemainingInDays;
	public com.nawforce.runforce.System.String TimeRemainingInHrs;
	public com.nawforce.runforce.System.String TimeRemainingInMins;
	public Decimal TimeSinceTargetInDays;
	public com.nawforce.runforce.System.String TimeSinceTargetInHrs;
	public com.nawforce.runforce.System.String TimeSinceTargetInMins;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public EntityMilestoneFeed[] Feeds;
	public EntityMilestoneHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public EntityMilestone clone$() {throw new java.lang.UnsupportedOperationException();}
	public EntityMilestone clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EntityMilestone clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EntityMilestone clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EntityMilestone clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
