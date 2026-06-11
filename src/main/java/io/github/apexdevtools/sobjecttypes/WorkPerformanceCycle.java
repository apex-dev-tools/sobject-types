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

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class WorkPerformanceCycle extends SObject {
	public static SObjectType$<WorkPerformanceCycle> SObjectType;
	public static SObjectFields$<WorkPerformanceCycle> Fields;

	public Date ActivityFrom;
	public Date ActivityTo;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public io.github.apexdevtools.standardtypes.System.String CurrencyIsoCode;
	public io.github.apexdevtools.standardtypes.System.String CurrentTask;
	public Id Id;
	public io.github.apexdevtools.standardtypes.System.Boolean IsDeleted;
	public Datetime LastManagerRequestsSharedDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public io.github.apexdevtools.standardtypes.System.String Name;
	public Id OwnerId;
	public Name Owner;
	public io.github.apexdevtools.standardtypes.System.String State;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WorkFeedbackQuestionSet[] FeedbackQuestionSets;
	public WorkFeedbackRequest[] FeedbackRequests;
	public WorkPerformanceCycleFeed[] Feeds;
	public WorkPerformanceCycleHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public WorkFeedbackRequest[] RelatedObjects;
	public WorkPerformanceCycleShare[] Shares;

	public WorkPerformanceCycle clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkPerformanceCycle clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkPerformanceCycle clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkPerformanceCycle clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone, io.github.apexdevtools.standardtypes.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkPerformanceCycle clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone, io.github.apexdevtools.standardtypes.System.Boolean preserveReadonlyTimestamps, io.github.apexdevtools.standardtypes.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
