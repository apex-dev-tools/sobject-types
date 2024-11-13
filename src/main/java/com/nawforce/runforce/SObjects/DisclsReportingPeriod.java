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
public class DisclsReportingPeriod extends SObject {
	public static SObjectType$<DisclsReportingPeriod> SObjectType;
	public static SObjectFields$<DisclsReportingPeriod> Fields;

	public Id AffiliateAccountId;
	public Account AffiliateAccount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Date EndDate;
	public Id Id;
	public String Identifier;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Date StartDate;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AntiCorruptionInitSum[] AntiCorruptionInitiativeSummaries;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DivrsEquityInclSum[] DiversityEquityInclusionSummaries;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EconomicPerformanceSum[] EconomicPerformanceSummaries;
	public EmailMessage[] Emails;
	public EmployeeDemographicSum[] EmpDemoSumReportingPeriod;
	public EmployeeDevelopmentSum[] EmployeeDevelopmentSummaries;
	public EmpBenefitSummary[] EmploymentBenefitSummary;
	public EmploymentCompensationSummary[] EmploymentCompensationSummaries;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public DisclsReportingPeriodFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public GovtFinancialAsstSum[] GovernmentFinancialAssistanceSummaries;
	public DisclsReportingPeriodHistory[] Histories;
	public ManagedCareProgramPrfm[] ManagedCareProgramPrfm_DisclsReportingPeriod;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public OrgIncidentSummary[] OrganizationIncidentSummaries;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DisclsReportingPeriodShare[] Shares;
	public SocialContributionSum[] SocialContributionSummaries;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TaxDisclosureSummary[] TaxDisclosureSummaries;

	public DisclsReportingPeriod clone$() {throw new java.lang.UnsupportedOperationException();}
	public DisclsReportingPeriod clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DisclsReportingPeriod clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DisclsReportingPeriod clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DisclsReportingPeriod clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
