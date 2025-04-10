/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class WarrantyTerm extends SObject {
	public static SObjectType$<WarrantyTerm> SObjectType;
	public static SObjectFields$<WarrantyTerm> Fields;

	public String Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String EffectiveStartDate;
	public String ExchangeType;
	public String Exclusions;
	public Decimal ExpensesCovered;
	public Integer ExpensesCoveredDuration;
	public String ExpensesCoveredUnitOfTime;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsTransferable;
	public Decimal LaborCovered;
	public Integer LaborCoveredDuration;
	public String LaborCoveredUnitOfTime;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id OwnerId;
	public Name Owner;
	public Decimal PartsCovered;
	public Integer PartsCoveredDuration;
	public String PartsCoveredUnitOfTime;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public Datetime SystemModstamp;
	public Integer WarrantyDuration;
	public String WarrantyTermName;
	public String WarrantyType;
	public String WarrantyUnitOfTime;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AssetWarranty[] AssetWarrantyTerms;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WarrantyTermFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public WarrantyTermHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductWarrantyTerm[] ProductWarrantyTerms;
	public WarrantyTermShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public WarrantyTerm clone$() {throw new java.lang.UnsupportedOperationException();}
	public WarrantyTerm clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WarrantyTerm clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WarrantyTerm clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WarrantyTerm clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
