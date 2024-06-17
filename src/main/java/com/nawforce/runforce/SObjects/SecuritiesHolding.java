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
public class SecuritiesHolding extends SObject {
	public static SObjectType$<SecuritiesHolding> SObjectType;
	public static SObjectFields$<SecuritiesHolding> Fields;

	public String AssetCategory;
	public String AssetCategoryName;
	public String AssetClass;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal GainLoss;
	public Id HouseholdId;
	public Account Household;
	public Id Id;
	public Id InsurancePolicyId;
	public InsurancePolicy InsurancePolicy;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastUpdated;
	public Datetime LastViewedDate;
	public Decimal MarketValue;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Decimal PercentChange;
	public Decimal Price;
	public Id PrimaryOwnerId;
	public Account PrimaryOwner;
	public Decimal PurchasePrice;
	public Decimal Shares;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
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
	public SecuritiesHoldingFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public SecuritiesHoldingHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public SecuritiesHoldingShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public SecuritiesHolding clone$() {throw new java.lang.UnsupportedOperationException();}
	public SecuritiesHolding clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SecuritiesHolding clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SecuritiesHolding clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SecuritiesHolding clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
