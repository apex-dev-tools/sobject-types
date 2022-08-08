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
public class WorkFeedbackRequest extends SObject {
	public static SObjectType$<WorkFeedbackRequest> SObjectType;
	public static SObjectFields$<WorkFeedbackRequest> Fields;

	public com.nawforce.runforce.System.String AdHocFeedback;
	public com.nawforce.runforce.System.String AdHocQuestion;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String FeedbackRequestState;
	public com.nawforce.runforce.System.String FeedbackType;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsDeployed;
	public com.nawforce.runforce.System.Boolean IsShareWithSubject;
	public com.nawforce.runforce.System.Boolean IsUnreadByOwner;
	public com.nawforce.runforce.System.Boolean IsUnsolicited;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastRemindDate;
	public Datetime LastSharedDate;
	public Datetime LastViewedDate;
	public com.nawforce.runforce.System.String Name;
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
	public com.nawforce.runforce.System.String SharingScope;
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
	public WorkFeedbackRequest clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkFeedbackRequest clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkFeedbackRequest clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkFeedbackRequest clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
