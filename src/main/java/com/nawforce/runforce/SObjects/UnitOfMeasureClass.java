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
public class UnitOfMeasureClass extends SObject {
	public static SObjectType$<UnitOfMeasureClass> SObjectType;
	public static SObjectFields$<UnitOfMeasureClass> Fields;

	public Id BaseUnitOfMeasureId;
	public UnitOfMeasure BaseUnitOfMeasure;
	public String Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DefaultUnitOfMeasureId;
	public UnitOfMeasure DefaultUnitOfMeasure;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String Status;
	public Datetime SystemModstamp;
	public String Type;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public TransactionUsageEntitlement[] EUomC_TransactionUsageEntitlements;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public UnitOfMeasureClassFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public UnitOfMeasureClassHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductUsageGrant[] ProductUsageGrants;
	public RateCardEntry[] RateCardEntries;
	public RateCardEntry[] RateCardEntries;
	public UnitOfMeasure[] UnitOfMeasures;
	public UsageResource[] UsageResources;

	public UnitOfMeasureClass clone$() {throw new java.lang.UnsupportedOperationException();}
	public UnitOfMeasureClass clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UnitOfMeasureClass clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UnitOfMeasureClass clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UnitOfMeasureClass clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
