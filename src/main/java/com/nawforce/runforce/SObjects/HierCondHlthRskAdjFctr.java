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
public class HierCondHlthRskAdjFctr extends SObject {
	public static SObjectType$<HierCondHlthRskAdjFctr> SObjectType;
	public static SObjectFields$<HierCondHlthRskAdjFctr> Fields;

	public Decimal CmnyFullBnftDualDisabled;
	public Decimal CmnyPartialBenefitDualAged;
	public Decimal CmnyPartialBnftDualDsbl;
	public Decimal Community;
	public Decimal CommunityFullBnftDualAged;
	public Decimal CommunityNonDualAged;
	public Decimal CommunityNonDualDisabled;
	public String Condition;
	public String ConditionCategory;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id HierCondCategoryCodeId;
	public CodeSet HierCondCategoryCode;
	public Id Id;
	public Decimal Institutional;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String OverriddenCodes;
	public Id OwnerId;
	public Name Owner;
	public Integer PublishedYear;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
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
	public HierCondHlthRskAdjFctrFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public HierCondHlthRskAdjFctrHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public HierCondHlthRskAdjFctrShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public HierCondHlthRskAdjFctr clone$() {throw new java.lang.UnsupportedOperationException();}
	public HierCondHlthRskAdjFctr clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HierCondHlthRskAdjFctr clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HierCondHlthRskAdjFctr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HierCondHlthRskAdjFctr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
