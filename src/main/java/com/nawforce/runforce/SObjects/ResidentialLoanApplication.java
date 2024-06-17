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
public class ResidentialLoanApplication extends SObject {
	public static SObjectType$<ResidentialLoanApplication> SObjectType;
	public static SObjectFields$<ResidentialLoanApplication> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal AmortizationTerm;
	public String AmortizationType;
	public String ApplicationExtIdentifier;
	public Decimal BalloonTermMonths;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EstateHoldType;
	public Boolean HasOtherLoanFeature;
	public Boolean HasPrepaymentPenalty;
	public Id Id;
	public Decimal ImprovementCost;
	public Decimal InitialBuydownRate;
	public Decimal IntOnlyTermMonthCount;
	public Decimal InterestRate;
	public Boolean IsBalloon;
	public Boolean IsBorrowerCommPropState;
	public Boolean IsConstructionConversion;
	public Boolean IsContractConversion;
	public Boolean IsDeleted;
	public Boolean IsEnergyRelImprovement;
	public Boolean IsInterestOnly;
	public Boolean IsNegativeAmortization;
	public Boolean IsPropertyCommPropState;
	public Boolean IsRenovation;
	public Boolean IsSingleClosing;
	public Boolean IsSubjectToPriorityLien;
	public Boolean IsTempIntRateBuydown;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Datetime LeaseHoldExpirationDate;
	public String LoanPurpose;
	public Datetime LotAcquiredDate;
	public Decimal LotOriginalCost;
	public Decimal MonthsBeforeFirstAdj;
	public Decimal MonthsBetweenAdjustments;
	public String MortgageLienType;
	public String MortgageProgramType;
	public String Name;
	public String NativeLandTenure;
	public Id OpportunityId;
	public Opportunity Opportunity;
	public String OtherAmortizationType;
	public String OtherLoanFeature;
	public String OtherLoanPurpose;
	public String OtherMortgageProgramType;
	public String OtherRefinanceProgType;
	public Id OwnerId;
	public Name Owner;
	public Decimal PrepayPenaltyTermMonth;
	public String ProjectType;
	public String RefinanceProgramType;
	public String RefinanceType;
	public String Status;
	public Datetime SystemModstamp;
	public String TitleType;
	public Decimal TotalFinLiabilityMonthlyAmt;
	public Decimal TotalFinancialAssetAmount;
	public Decimal TotalOtherAssetAmount;
	public Decimal TotalOtherFinLiabilityMonthlyAmt;
	public String TrustTitleType;

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public Case[] Cases;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ResidentialLoanApplicationFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public AuthFormRequestRecord[] FormRequestRecordRelatedRecords;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ResidentialLoanApplicationHistory[] Histories;
	public InfoAuthorizationRequest[] InfoAuthRequestSourceRecords;
	public LoanApplicantAddress[] LoanApplicantAddresses;
	public LoanApplicantDeclaration[] LoanApplicantDeclarations;
	public LoanApplicantEmployment[] LoanApplicantEmployments;
	public LoanApplicantIncome[] LoanApplicantIncomes;
	public LoanApplicant[] LoanApplicants;
	public LoanApplicationAsset[] LoanApplicationAssets;
	public LoanApplicationFinancial[] LoanApplicationFinancials;
	public LoanApplicationLiability[] LoanApplicationLiabilities;
	public LoanApplicationProperty[] LoanApplicationProperties;
	public LoanApplicationTitleHolder[] LoanApplicationTitleHolders;
	public MultipartyInfoAuthRequest[] MultipartyInfoAuthRequestSourceRecords;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public RecordAlert[] RecordAlertParent;
	public RecordAlert[] RecordAlertWhat;
	public AuthorizationFormConsent[] RelatedAuthorizationFormConsents;
	public ResidentialLoanApplicationShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public ResidentialLoanApplication clone$() {throw new java.lang.UnsupportedOperationException();}
	public ResidentialLoanApplication clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ResidentialLoanApplication clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ResidentialLoanApplication clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ResidentialLoanApplication clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
