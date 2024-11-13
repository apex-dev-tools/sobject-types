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
public class CoverageBenefitItem extends SObject {
	public static SObjectType$<CoverageBenefitItem> SObjectType;
	public static SObjectFields$<CoverageBenefitItem> Fields;

	public String BenefitCategory;
	public Id CodeSetServiceTypeId;
	public CodeSet CodeSetServiceType;
	public Id CoverageBenefitId;
	public CoverageBenefit CoverageBenefit;
	public String CoverageLevel;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Boolean DoesDeductibleApply;
	public Id Id;
	public String InNetworkCoverage;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsInPlanNetwork;
	public Boolean IsPreauthorizationRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MemberId;
	public Account Member;
	public String Name;
	public String Notes;
	public String OutofNetworkCoverage;
	public Id OwnerId;
	public Name Owner;
	public String ServiceType;
	public String ServiceTypeCode;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Datetime SystemModstamp;
	public String TimePeriod;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CoverageBenefitItemLimit[] Coverage_Benefit_Item_Limits;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CoverageBenefitItemFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CoverageBenefitItemHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public CoverageBenefitItemShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CoverageBenefitItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public CoverageBenefitItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CoverageBenefitItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CoverageBenefitItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CoverageBenefitItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
