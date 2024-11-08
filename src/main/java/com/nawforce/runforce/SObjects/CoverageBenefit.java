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
public class CoverageBenefit extends SObject {
	public static SObjectType$<CoverageBenefit> SObjectType;
	public static SObjectFields$<CoverageBenefit> Fields;

	public String BenefitNotes;
	public Date BenefitPeriodEndDate;
	public Date BenefitPeriodStartDate;
	public Id CareBenefitVerifyRequestId;
	public CareBenefitVerifyRequest CareBenefitVerifyRequest;
	public String CoinsuranceNotes;
	public String CopayNotes;
	public String CoverageType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DeductibleNotes;
	public String Disclaimer;
	public String Division;
	public Decimal EmergencyDepartmentCopay;
	public Decimal FamilyInNetworkDeductibleApplied;
	public Decimal FamilyInNetworkDeductibleLimit;
	public Decimal FamilyInNetworkDeductibleRemaining;
	public Decimal FamilyInNetworkOutofPocketApplied;
	public Decimal FamilyInNetworkOutofPocketLimit;
	public Decimal FamilyInNetworkOutofPocketRemaining;
	public Decimal FamilyOutofNetworkDeductibleApplied;
	public Decimal FamilyOutofNetworkDeductibleLimit;
	public Decimal FamilyOutofNetworkDeductibleRemaining;
	public Decimal FamilyOutofNetworkOutofPocketApplied;
	public Decimal FamilyOutofNetworkOutofPocketLimit;
	public Decimal FamilyOutofNetworkOutofPocketRemaining;
	public Id FinalCoverageStatusCodeId;
	public CodeSet FinalCoverageStatusCode;
	public Id Id;
	public Decimal InNetworkCoinsuranceAmount;
	public Decimal InNetworkCoinsurancePercentage;
	public Decimal InNetworkLifetimeMaximum;
	public Decimal IndividualInNetworkDeductibleApplied;
	public Decimal IndividualInNetworkDeductibleLimit;
	public Decimal IndividualInNetworkDeductibleRemaining;
	public Decimal IndividualInNetworkOutofPocketApplied;
	public Decimal IndividualInNetworkOutofPocketLimit;
	public Decimal IndividualInNetworkOutofPocketRemaining;
	public Decimal IndividualOutofNetworkDeductibleApplied;
	public Decimal IndividualOutofNetworkDeductibleLimit;
	public Decimal IndividualOutofNetworkDeductibleRemain;
	public Decimal IndividualOutofNetworkOutofPocketApplied;
	public Decimal IndividualOutofNetworkOutofPocketLimit;
	public Decimal IndividualOutofNetworkOutofPocketRemain;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LifetimeMaximumNotes;
	public Id MemberId;
	public Account Member;
	public Id MemberPlanId;
	public MemberPlan MemberPlan;
	public String Name;
	public Id OutcomeStatusCodeId;
	public CodeSet OutcomeStatusCode;
	public Decimal OutofNetworkCoinsuranceAmount;
	public Decimal OutofNetworkCoinsurancePercentage;
	public Decimal OutofNetworkLifetimeMaximum;
	public String OutofPocketNotes;
	public Id OwnerId;
	public Name Owner;
	public Decimal PharmaCopayAmount;
	public Decimal PrimaryCareCopay;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Decimal SpecialistCopay;
	public Id StatusCodeId;
	public CodeSet StatusCode;
	public Datetime SystemModstamp;
	public Decimal UrgentCareCopay;
	public Datetime VerificationDate;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CareTaskDetail[] CareTaskDetailDetailRecord;
	public CareBenefitVerifyRequest[] Care_Benefit_Verify_Requests;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CoverageBenefitItem[] CoverageBenefitItems;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CoverageBenefitFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CoverageBenefitHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public CoverageBenefitShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CoverageBenefit clone$() {throw new java.lang.UnsupportedOperationException();}
	public CoverageBenefit clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CoverageBenefit clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CoverageBenefit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CoverageBenefit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
