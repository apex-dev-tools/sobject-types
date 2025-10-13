/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class OutboundEngmtContentRsrc extends SObject {
	public static SObjectType$<OutboundEngmtContentRsrc> SObjectType;
	public static SObjectFields$<OutboundEngmtContentRsrc> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OutboundEngagementTmplViewId;
	public OutboundEngagementTmplView OutboundEngagementTmplView;
	public Id OwnerId;
	public Name Owner;
	public Id ResourceReferenceRecordId;
	public Campaign ResourceReferenceRecord;
	public Datetime SystemModstamp;
	public Id TargetReferenceRecordId;
	public Promotion TargetReferenceRecord;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public OutboundEngmtContentRsrcFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public OutboundEngmtContentRsrcShare[] Shares;

	public OutboundEngmtContentRsrc clone$() {throw new java.lang.UnsupportedOperationException();}
	public OutboundEngmtContentRsrc clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OutboundEngmtContentRsrc clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OutboundEngmtContentRsrc clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OutboundEngmtContentRsrc clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
