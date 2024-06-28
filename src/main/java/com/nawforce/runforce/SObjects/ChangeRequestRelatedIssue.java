/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ChangeRequestRelatedIssue extends SObject {
	public static SObjectType$<ChangeRequestRelatedIssue> SObjectType;
	public static SObjectFields$<ChangeRequestRelatedIssue> Fields;

	public Id ChangeRequestId;
	public ChangeRequest ChangeRequest;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String RelatedEntityType;
	public Id RelatedIssueId;
	public Name RelatedIssue;
	public String RelationshipType;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ChangeRequestRelatedIssueFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ChangeRequestRelatedIssueHistory[] Histories;

	public ChangeRequestRelatedIssue clone$() {throw new java.lang.UnsupportedOperationException();}
	public ChangeRequestRelatedIssue clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ChangeRequestRelatedIssue clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ChangeRequestRelatedIssue clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ChangeRequestRelatedIssue clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
