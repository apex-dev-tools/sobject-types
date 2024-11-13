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
public class InsurancePolicyAsset extends SObject {
	public static SObjectType$<InsurancePolicyAsset> SObjectType;
	public static SObjectFields$<InsurancePolicyAsset> Fields;

	public String AssetCode;
	public String AssetName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id CustomerPropertyId;
	public CustomerProperty CustomerProperty;
	public String Division;
	public Id Id;
	public Id InsurancePolicyId;
	public InsurancePolicy InsurancePolicy;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PrimaryPolicyParticipantId;
	public InsurancePolicyParticipant PrimaryPolicyParticipant;
	public Id RelatedInsurancePolicyAssetId;
	public InsurancePolicyAsset RelatedInsurancePolicyAsset;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Decimal StandardFeeAmount;
	public Decimal StandardPremiumAmount;
	public Decimal StandardTaxAmount;
	public Datetime SystemModstamp;
	public Decimal TermFeeAmount;
	public Decimal TermPremiumAmount;
	public Decimal TermTaxAmount;
	public Decimal TotalStandardAmount;
	public Decimal TotalTermAmount;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public ClaimCoverage[] ClaimCoverages;
	public ClaimItem[] ClaimItems;
	public Claim[] Claims;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public InsurancePolicyAssetFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public InsurancePolicyAssetHistory[] Histories;
	public InsPolicyTransactionDetail[] InsPolicyTransactionDetails;
	public InsurancePolicyCoverage[] InsurancePolicyAssets;
	public InsurancePolicySurcharge[] InsurancePolicySurcharges;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProducerCommission[] ProducerCommissions;
	public InsurancePolicyAsset[] RelatedInsurancePolicyAssets;
	public InsurancePolicyAssetShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public InsurancePolicyAsset clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyAsset clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyAsset clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyAsset clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyAsset clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
