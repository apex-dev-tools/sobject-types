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
public class InsurancePolicyCoverage extends SObject {
	public static SObjectType$<InsurancePolicyCoverage> SObjectType;
	public static SObjectFields$<InsurancePolicyCoverage> Fields;

	public String BenefitPaymentFrequency;
	public String Category;
	public String CategoryCode;
	public String CategoryGroup;
	public String CategoryGroupType;
	public Id ContractGroupPlanId;
	public ContractGroupPlan ContractGroupPlan;
	public String CoverageCode;
	public String CoverageName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DeathBenefitOptionType;
	public Decimal DeductibleAmount;
	public String Description;
	public Decimal Discount;
	public String Division;
	public Datetime EffectiveDate;
	public Date EffectiveFromDate;
	public Date EffectiveToDate;
	public Decimal EmployeeContribution;
	public Decimal EmployerContribution;
	public Datetime ExpirationDate;
	public Id Id;
	public String IncomeOptionType;
	public Id InsurancePolicyAssetId;
	public InsurancePolicyAsset InsurancePolicyAsset;
	public Id InsurancePolicyId;
	public InsurancePolicy InsurancePolicy;
	public Id InsurancePolicyParticipantId;
	public InsurancePolicyParticipant InsurancePolicyParticipant;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal LimitAmount;
	public Date LimitDate;
	public Decimal LimitPercentage;
	public String LimitRange;
	public String Name;
	public Id OriginalCoverageId;
	public InsurancePolicyCoverage OriginalCoverage;
	public Id ParentCoverageId;
	public InsurancePolicyCoverage ParentCoverage;
	public Decimal PremiumAmount;
	public Id PriorCoverageId;
	public InsurancePolicyCoverage PriorCoverage;
	public Id ProductId;
	public Product2 Product;
	public Id ProductSellingModelId;
	public ProductSellingModel ProductSellingModel;
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

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public InsurancePolicyCoverage[] ChildInsurancePolicyCoverages;
	public ClaimCoverage[] ClaimCoverages;
	public ClaimItem[] ClaimItems;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public InsurancePolicyCoverageFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public AuthFormRequestRecord[] FormRequestRecordRelatedRecords;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public InsurancePolicyCoverageHistory[] Histories;
	public InsPolicyCvrRelatedObj[] IPCROInsurancePolicyCoverage;
	public InfoAuthorizationRequest[] InfoAuthRequestSourceRecords;
	public InsPolicyTransactionDetail[] InsPolicyTransactionDetailVersions;
	public InsPolicyTransactionDetail[] InsPolicyTransactionDetails;
	public InsPolicyCoverageAttribute[] InsurancePolicyCoverageAttributes;
	public InsurancePolicyProductClause[] InsurancePolicyCoverages;
	public InsurancePolicyProductClause[] InsurancePolicyProductClauses;
	public InsurancePolicySurcharge[] InsurancePolicySurcharges;
	public MultipartyInfoAuthRequest[] MultipartyInfoAuthRequestSourceRecords;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public InsurancePolicyCoverage[] OriginalCoverages;
	public InsurancePolicyCoverage[] PriorCoverages;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProducerCommission[] ProducerCommissions;
	public RecordAlert[] RecordAlertParent;
	public RecordAlert[] RecordAlertWhat;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public WorkerCompCoverageClass[] WorkerCompCoverageClasses;

	public InsurancePolicyCoverage clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyCoverage clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyCoverage clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyCoverage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyCoverage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
