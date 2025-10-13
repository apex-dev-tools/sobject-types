/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ProductUsageGrant extends SObject {
	public static SObjectType$<ProductUsageGrant> SObjectType;
	public static SObjectFields$<ProductUsageGrant> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DrawdownOrder;
	public Datetime EffectiveEndDate;
	public Datetime EffectiveStartDate;
	public Id Id;
	public Boolean IsDeleted;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String OverageChargeable;
	public Id OwnerId;
	public Name Owner;
	public Id ProductId;
	public Product2 Product;
	public Id ProductSellingModelId;
	public ProductSellingModel ProductSellingModel;
	public String ProductUsageGrantNum;
	public Id ProductUsageResourceId;
	public ProductUsageResource ProductUsageResource;
	public Decimal Quantity;
	public Id RenewalPolicyId;
	public UsageGrantRenewalPolicy RenewalPolicy;
	public Id RolloverPolicyId;
	public UsageGrantRolloverPolicy RolloverPolicy;
	public String Status;
	public Datetime SystemModstamp;
	public String Type;
	public Id UnitOfMeasureClassId;
	public UnitOfMeasureClass UnitOfMeasureClass;
	public Id UnitOfMeasureId;
	public UnitOfMeasure UnitOfMeasure;
	public Id UsageDefinitionProductId;
	public Product2 UsageDefinitionProduct;
	public String UsageModelType;
	public Id UsageRsrcId;
	public UsageResource UsageRsrc;
	public Integer ValidityPeriodTerm;
	public String ValidityPeriodUnit;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ProductUsageGrantFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ProductUsageGrantHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductUsageGrantShare[] Shares;

	public ProductUsageGrant clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductUsageGrant clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductUsageGrant clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductUsageGrant clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductUsageGrant clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
