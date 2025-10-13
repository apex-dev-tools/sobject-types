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
public class ProductUsageResource extends SObject {
	public static SObjectType$<ProductUsageResource> SObjectType;
	public static SObjectFields$<ProductUsageResource> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EffectiveEndDate;
	public Datetime EffectiveStartDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsOptional;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id OwnerId;
	public Name Owner;
	public Id ProductId;
	public Product2 Product;
	public String ProductUsageResourceNum;
	public String Status;
	public Datetime SystemModstamp;
	public Id TokenResourceId;
	public UsageResource TokenResource;
	public Id UsageResourceId;
	public UsageResource UsageResource;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ProductUsageResourceFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ProductUsageResourceHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductUsageGrant[] ProductUsageGrants;
	public ProductUsageResourcePolicy[] ProductUsageResourcePolicies;
	public ProductUsageResourceShare[] Shares;

	public ProductUsageResource clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductUsageResource clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductUsageResource clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductUsageResource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductUsageResource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
