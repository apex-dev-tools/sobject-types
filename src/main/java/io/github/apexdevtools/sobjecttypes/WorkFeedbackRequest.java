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
public class WorkFeedbackRequest extends SObject {
	public static SObjectType$<WorkFeedbackRequest> SObjectType;
	public static SObjectFields$<WorkFeedbackRequest> Fields;

	public io.github.apexdevtools.standardtypes.System.String AdHocFeedback;
	public io.github.apexdevtools.standardtypes.System.String AdHocQuestion;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public io.github.apexdevtools.standardtypes.System.String CurrencyIsoCode;
	public io.github.apexdevtools.standardtypes.System.String Description;
	public io.github.apexdevtools.standardtypes.System.String FeedbackRequestState;
	public io.github.apexdevtools.standardtypes.System.String FeedbackType;
	public Id Id;
	public io.github.apexdevtools.standardtypes.System.Boolean IsDeleted;
	public io.github.apexdevtools.standardtypes.System.Boolean IsDeployed;
	public io.github.apexdevtools.standardtypes.System.Boolean IsShareWithSubject;
	public io.github.apexdevtools.standardtypes.System.Boolean IsUnreadByOwner;
	public io.github.apexdevtools.standardtypes.System.Boolean IsUnsolicited;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastRemindDate;
	public Datetime LastSharedDate;
	public Datetime LastViewedDate;
	public io.github.apexdevtools.standardtypes.System.String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PerformanceCycleId;
	public WorkPerformanceCycle PerformanceCycle;
	public Id QuestionSetId;
	public WorkFeedbackQuestionSet QuestionSet;
	public Id RecipientId;
	public User Recipient;
	public Id RelatedObjectId;
	public Name RelatedObject;
	public io.github.apexdevtools.standardtypes.System.String SharingScope;
	public Id SubjectId;
	public User Subject;
	public Id SubmitFeedbackToId;
	public User SubmitFeedbackTo;
	public Datetime SubmittedDate;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WorkFeedback[] Feedbacks;
	public WorkFeedbackRequestFeed[] Feeds;
	public WorkFeedbackRequestHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public WorkFeedbackRequestShare[] Shares;

	public WorkFeedbackRequest clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkFeedbackRequest clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkFeedbackRequest clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkFeedbackRequest clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone, io.github.apexdevtools.standardtypes.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkFeedbackRequest clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone, io.github.apexdevtools.standardtypes.System.Boolean preserveReadonlyTimestamps, io.github.apexdevtools.standardtypes.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
