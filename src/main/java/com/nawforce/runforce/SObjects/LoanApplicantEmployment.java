/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class LoanApplicantEmployment extends SObject {
	public static SObjectType$<LoanApplicantEmployment> SObjectType;
	public static SObjectFields$<LoanApplicantEmployment> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer CurrentJobAdditionalMonthCount;
	public Integer CurrentJobYearCount;
	public Address EmployerAddress;
	public String EmployerCity;
	public String EmployerCountry;
	public String EmployerCountryCode;
	public String EmployerGeocodeAccuracy;
	public Decimal EmployerLatitude;
	public Decimal EmployerLongitude;
	public String EmployerName;
	public String EmployerPhone;
	public String EmployerPostalCode;
	public String EmployerState;
	public String EmployerStateCode;
	public String EmployerStreet;
	public String EmploymentExtIdentifier;
	public Date EndDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsLessThanQuarterShare;
	public Boolean IsRelToTransactionParty;
	public Boolean IsSelfEmployed;
	public String JobTitle;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LoanApplicantId;
	public LoanApplicant LoanApplicant;
	public Id LoanApplicationId;
	public ResidentialLoanApplication LoanApplication;
	public Decimal MonthlyBaseIncomeAmount;
	public Decimal MonthlyBonusAmount;
	public Decimal MonthlyCommissionAmount;
	public Decimal MonthlyIncome;
	public Decimal MonthlyMilitaryEntlAmt;
	public Decimal MonthlyOtherIncomeAmount;
	public Decimal MonthlyOvertimeAmount;
	public Decimal MonthlyTotalIncomeAmount;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Date StartDate;
	public Datetime SystemModstamp;

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
	public LoanApplicantEmploymentFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public LoanApplicantEmploymentHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordAlert[] RecordAlertParent;
	public RecordAlert[] RecordAlertWhat;
	public LoanApplicantEmploymentShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public LoanApplicantEmployment clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantEmployment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantEmployment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantEmployment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantEmployment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
