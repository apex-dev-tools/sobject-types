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
public class RateAdjustmentByAttribute extends SObject {
	public static SObjectType$<RateAdjustmentByAttribute> SObjectType;
	public static SObjectFields$<RateAdjustmentByAttribute> Fields;

	public String AdjustmentType;
	public Decimal AdjustmentValue;
	public String AttributeAdjConditionsHash;
	public Id AttributeBasedAdjRuleId;
	public AttributeBasedAdjRule AttributeBasedAdjRule;
	public Integer AttributeCount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EffectiveFrom;
	public Datetime EffectiveTo;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id ProductId;
	public Product2 Product;
	public Id ProductSellingModelId;
	public ProductSellingModel ProductSellingModel;
	public Id RateCardEntryId;
	public RateCardEntry RateCardEntry;
	public String RateCardEntryStatus;
	public Id RateCardId;
	public RateCard RateCard;
	public Id RateUnitOfMeasureId;
	public UnitOfMeasure RateUnitOfMeasure;
	public String RateUnitOfMeasureName;
	public Datetime SystemModstamp;
	public Id UsageResourceId;
	public UsageResource UsageResource;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public RateAdjustmentByAttributeFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public RateAdjustmentByAttributeHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public RateAdjustmentByAttribute clone$() {throw new java.lang.UnsupportedOperationException();}
	public RateAdjustmentByAttribute clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RateAdjustmentByAttribute clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RateAdjustmentByAttribute clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RateAdjustmentByAttribute clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
