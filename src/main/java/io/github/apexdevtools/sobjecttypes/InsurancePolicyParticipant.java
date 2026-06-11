/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class InsurancePolicyParticipant extends SObject {
	public static SObjectType$<InsurancePolicyParticipant> SObjectType;
	public static SObjectFields$<InsurancePolicyParticipant> Fields;

	public Decimal BeneficiarySharePercentage;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Datetime EffectiveDate;
	public Date EffectiveFromDate;
	public Date EffectiveToDate;
	public Decimal EmployeeContribution;
	public Decimal EmployerContribution;
	public Datetime ExpirationDate;
	public Id Id;
	public Id InsurancePolicyId;
	public InsurancePolicy InsurancePolicy;
	public Boolean IsActiveParticipant;
	public Boolean IsDeleted;
	public Boolean IsMinorBeneficiary;
	public Boolean IsPolicyholder;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LegalGuardianId;
	public Account LegalGuardian;
	public String Name;
	public Id OriginalParticipantId;
	public InsurancePolicyParticipant OriginalParticipant;
	public String ParticipantCode;
	public String ParticipantName;
	public Id PrimaryParticipantAccountId;
	public Account PrimaryParticipantAccount;
	public Id PrimaryParticipantContactId;
	public Contact PrimaryParticipantContact;
	public Id PriorParticipantId;
	public InsurancePolicyParticipant PriorParticipant;
	public Id ProductId;
	public Product2 Product;
	public Id ProductSellingModelId;
	public ProductSellingModel ProductSellingModel;
	public Id RelatedInsPolicyParticipantId;
	public InsurancePolicyParticipant RelatedInsPolicyParticipant;
	public Id RelatedParticipantAccountId;
	public Account RelatedParticipantAccount;
	public Id RelatedParticipantContactId;
	public Contact RelatedParticipantContact;
	public String RelationshipToInsured;
	public String Role;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Decimal StandardCommissionAmount;
	public Decimal StandardFeeAmount;
	public Decimal StandardPremiumAmount;
	public Decimal StandardTaxAmount;
	public Datetime SystemModstamp;
	public Decimal TermCommissionAmount;
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
	public ClaimParticipant[] ClaimParticipants;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public InsurancePolicyParticipantFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public InsurancePolicyParticipantHistory[] Histories;
	public InsPolicyPtcpRelatedObj[] IPPROInsurancePolicyParticipant;
	public InsPolicyParticipantAttr[] InsPolicyParticipantAttributes;
	public InsPolicyTransactionDetail[] InsPolicyTransactionDetailVersions;
	public InsPolicyTransactionDetail[] InsPolicyTransactionDetails;
	public InsurancePolicyCoverage[] InsurancePolicyParticipants;
	public InsurancePolicyProductClause[] InsurancePolicyProductClauses;
	public InsurancePolicySurcharge[] InsurancePolicySurcharges;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public InsurancePolicyParticipant[] OriginalParticipants;
	public InsurancePolicyAsset[] PrimaryPolicyParticipants;
	public InsurancePolicyParticipant[] PriorParticipants;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public InsurancePolicyParticipant[] RelatedInsurancePolicyParticipants;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public InsurancePolicyParticipant clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyParticipant clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyParticipant clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyParticipant clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyParticipant clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
