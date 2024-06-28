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
public class PlanBenefit extends SObject {
	public static SObjectType$<PlanBenefit> SObjectType;
	public static SObjectFields$<PlanBenefit> Fields;

	public String BenefitNotes;
	public String CoinsuranceNotes;
	public String CopayNotes;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DeductibleNotes;
	public String DocumentLocation;
	public Date EffectiveDate;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public Decimal EmergencyDepartmentCopay;
	public Decimal FamilyInNetworkDeductible;
	public Decimal FamilyInNetworkOutofPocket;
	public Decimal FamilyOutofNetworkDeductible;
	public Decimal FamilyOutofNetworkOutofPocket;
	public Id Id;
	public Decimal InNetworkCoinsuranceAmount;
	public Decimal InNetworkCoinsurancePercentage;
	public Decimal InNetworkLifetimeMaximum;
	public Decimal IndividualInNetworkDeductible;
	public Decimal IndividualInNetworkOutofPocket;
	public Decimal IndividualOutofNetworkDeductible;
	public Decimal IndividualOutofNetworkOutofPocket;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LifetimeMaximumNotes;
	public String Name;
	public Decimal OutofNetworkCoinsuranceAmount;
	public Decimal OutofNetworkCoinsurancePercentage;
	public Decimal OutofNetworkLifetimeMaximum;
	public String OutofPocketNotes;
	public Id OwnerId;
	public Name Owner;
	public Decimal PrimaryCareCopay;
	public Id PurchaserPlanId;
	public PurchaserPlan PurchaserPlan;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Decimal SpecialistCopay;
	public String Status;
	public Datetime SystemModstamp;
	public Decimal UrgentCareCopay;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public PlanBenefitFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public PlanBenefitHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public PlanBenefitItem[] PlanBenefitItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public PlanBenefitShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public PlanBenefit clone$() {throw new java.lang.UnsupportedOperationException();}
	public PlanBenefit clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PlanBenefit clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PlanBenefit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PlanBenefit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
