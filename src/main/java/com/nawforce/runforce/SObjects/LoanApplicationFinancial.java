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
public class LoanApplicationFinancial extends SObject {
	public static SObjectType$<LoanApplicationFinancial> SObjectType;
	public static SObjectFields$<LoanApplicationFinancial> Fields;

	public Decimal BorrowerClosingCostAmt;
	public Decimal CashFromOrToBorrowerAmt;
	public String CounselingAgencyName;
	public String CounselingAgencyProvName;
	public String CounselingComplBorrName;
	public Datetime CounselingCompletionDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal CreditFromSeller;
	public String CurrencyIsoCode;
	public Decimal DiscountPointCostAmount;
	public String EdCompletedBorrowerName;
	public Decimal EstFirstMortgagePmtAmt;
	public Decimal EstHomeownersInsPmtAmt;
	public Decimal EstMortgageInsPmtAmt;
	public Decimal EstOtherDuesPaymentAmt;
	public Decimal EstOtherPaymentAmt;
	public Decimal EstPropertyTaxesPmtAmt;
	public Decimal EstSubordinateLienPmtAmt;
	public Decimal EstSuppPropertyInsPmtAmt;
	public Decimal FinancedMortgageInsAmt;
	public String FinancialExtIdentifier;
	public Boolean HasCompletedCounseling;
	public Boolean HasHoEducation;
	public Datetime HoEducationCompletedDate;
	public String HoEducationFormat;
	public String HousingCounselingFormat;
	public String HudApprAgencyIdentifier;
	public String HudApprovedProvIdentifier;
	public Id Id;
	public Boolean IsDeleted;
	public Decimal LandAcquiredSeparatelyAmount;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal LoanAmount;
	public Id LoanApplicationId;
	public ResidentialLoanApplication LoanApplication;
	public Decimal LoanExclFinMortInsAmt;
	public String Name;
	public Decimal OtherCredit;
	public Decimal OtherNewMortgageLoanAmt;
	public Decimal OutstandingLoanAmount;
	public Decimal PurchasePriceAmount;
	public Decimal RemodelAndRepairsAmount;
	public Datetime SystemModstamp;
	public Decimal TotalCashDueFromBorrower;
	public Decimal TotalCredit;
	public Decimal TotalDebtPaidOffAmount;
	public Decimal TotalEstPaymentAmt;
	public Decimal TotalMortgageLoanAndCreditAmt;
	public Decimal TotalMortgageLoansAmount;

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
	public LoanApplicationFinancialFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public LoanApplicationFinancialHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordAlert[] RecordAlertParent;
	public RecordAlert[] RecordAlertWhat;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public LoanApplicationFinancial clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationFinancial clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationFinancial clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationFinancial clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationFinancial clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
