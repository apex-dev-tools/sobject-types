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
public class AdvAccountForecastFact extends SObject {
	public static SObjectType$<AdvAccountForecastFact> SObjectType;
	public static SObjectFields$<AdvAccountForecastFact> Fields;

	public Id AccountId;
	public Account Account;
	public Id AdvAcctForecastSetPartnerId;
	public AdvAcctForecastSetPartner AdvAcctForecastSetPartner;
	public Id AdvAcctForecastSetUseId;
	public AdvAcctForecastSetUse AdvAcctForecastSetUse;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal ForecastedQuantity;
	public Decimal ForecastedRevenue;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal LastYearOrderQuantity;
	public Decimal LastYearOrderRevenue;
	public String Name;
	public Decimal OpportunityQuantity;
	public Decimal OpportunityRevenue;
	public Decimal OrderQuantity;
	public Decimal OrderRevenue;
	public Id OwnerId;
	public Name Owner;
	public Id PeriodId;
	public Period Period;
	public Date PeriodStartDate;
	public Id ProductId;
	public Product2 Product;
	public Decimal SalesAgreementQuantity;
	public Decimal SalesAgreementRevenue;
	public String Status;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastFactAdj[] AdvAcctForecastFactAdjustments;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public AdvAccountForecastFactFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public AdvAccountForecastFactHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AdvAccountForecastFactShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public AdvAccountForecastFact clone$() {throw new java.lang.UnsupportedOperationException();}
	public AdvAccountForecastFact clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AdvAccountForecastFact clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AdvAccountForecastFact clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AdvAccountForecastFact clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
