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
public class UsageResourceBillingPolicy extends SObject {
	public static SObjectType$<UsageResourceBillingPolicy> SObjectType;
	public static SObjectFields$<UsageResourceBillingPolicy> Fields;

	public String Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
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
	public String UsageAccumulationMethod;
	public String UsageAccumulationPeriod;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public BindingObjUsageRsrcPlcy[] BindingObjUsageRsrcPlcies;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public UsageResourceBillingPolicyFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public UsageResourceBillingPolicyHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductUsageResourcePolicy[] ProductUsageResourcePolicies;
	public TransactionUsageEntitlement[] UAP_TransactionUsageEntitlements;
	public UsageResourcePolicy[] UsageResourcePolicies;
	public UsageResource[] UsageResources;

	public UsageResourceBillingPolicy clone$() {throw new java.lang.UnsupportedOperationException();}
	public UsageResourceBillingPolicy clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UsageResourceBillingPolicy clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UsageResourceBillingPolicy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UsageResourceBillingPolicy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
