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
public class PromotionTarget extends SObject {
	public static SObjectType$<PromotionTarget> SObjectType;
	public static SObjectFields$<PromotionTarget> Fields;

	public Decimal AdjustmentAmount;
	public Decimal AdjustmentPercent;
	public String AdjustmentType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id PromotionId;
	public Promotion Promotion;
	public Id PromotionTierId;
	public PromotionTier PromotionTier;
	public Decimal RestrictionQuantity;
	public Datetime SystemModstamp;
	public Id TargetId;
	public Name Target;
	public String TargetOperator;
	public String TargetProductCategoryName;
	public String TargetProductName;
	public String TargetProductSku;
	public String TargetRuleCriteriaType;
	public String TargetType;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public PromotionTargetFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public PromotionTargetHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public PromotionLineItemRule[] PromotionLineItemRules;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public PromotionTarget clone$() {throw new java.lang.UnsupportedOperationException();}
	public PromotionTarget clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PromotionTarget clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PromotionTarget clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PromotionTarget clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
