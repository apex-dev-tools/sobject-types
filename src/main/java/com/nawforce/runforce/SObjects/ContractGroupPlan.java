/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ContractGroupPlan extends SObject {
	public static SObjectType$<ContractGroupPlan> SObjectType;
	public static SObjectFields$<ContractGroupPlan> Fields;

	public Id AccountId;
	public Account Account;
	public Id ContractGroupParentPlanId;
	public ContractGroupPlan ContractGroupParentPlan;
	public Id ContractId;
	public Contract Contract;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Datetime EffectiveEndDate;
	public Datetime EffectiveStartDate;
	public String EligibilityCriteria;
	public Date EnrollmentEndDate;
	public String EnrollmentRatingType;
	public Date EnrollmentStartDate;
	public Integer EnrollmentWaitingPeriod;
	public String GroupNumber;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsOptional;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OriginalContractPlanId;
	public ContractGroupPlan OriginalContractPlan;
	public String PlanType;
	public String PricingStructure;
	public Integer ProductNumber;
	public String Status;
	public Datetime SystemModstamp;
	public Decimal UnitPrice;
	public String UsageType;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public ContractGroupPlan[] ChildContractGroupPlans;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ContractGroupPlanGroupClass[] ContractGroupPlanGroupClasses;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ContractGroupPlanFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public GroupCensusMemberPlan[] GroupCensusMemberPlans;
	public GroupClassContribution[] GroupClassContributions;
	public ContractGroupPlanHistory[] Histories;
	public InsurancePolicy[] InsurancePolicies;
	public InsurancePolicyCoverage[] InsurancePolicyCoverages;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ContractGroupPlan[] OriginalContractGroupPlans;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public ContractGroupPlan clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContractGroupPlan clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContractGroupPlan clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContractGroupPlan clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContractGroupPlan clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
