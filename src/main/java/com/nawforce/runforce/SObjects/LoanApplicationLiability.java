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
public class LoanApplicationLiability extends SObject {
	public static SObjectType$<LoanApplicationLiability> SObjectType;
	public static SObjectFields$<LoanApplicationLiability> Fields;

	public String AccountNumber;
	public String AccountType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal CreditLimitAmount;
	public String CreditorName;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsJointLiability;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LiabilityClass;
	public String LiabilityExtIdentifier;
	public Id LoanApplicationAssetId;
	public LoanApplicationAsset LoanApplicationAsset;
	public Id LoanApplicationId;
	public ResidentialLoanApplication LoanApplication;
	public String LoanType;
	public Decimal MonthlyPaymentAmount;
	public String Name;
	public String OtherLiabilityType;
	public Id OwnerId;
	public Name Owner;
	public Boolean ShouldBePaidInFull;
	public Datetime SystemModstamp;
	public Decimal UnpaidBalanceAmount;

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
	public LoanApplicationLiabilityFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public LoanApplicationLiabilityHistory[] Histories;
	public LoanApplicantLiability[] LoanApplicantLiabilityRelations;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordAlert[] RecordAlertParent;
	public RecordAlert[] RecordAlertWhat;
	public LoanApplicationLiabilityShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public LoanApplicationLiability clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationLiability clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationLiability clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationLiability clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationLiability clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
