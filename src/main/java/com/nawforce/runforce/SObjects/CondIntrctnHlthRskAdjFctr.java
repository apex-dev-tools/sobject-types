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
public class CondIntrctnHlthRskAdjFctr extends SObject {
	public static SObjectType$<CondIntrctnHlthRskAdjFctr> SObjectType;
	public static SObjectFields$<CondIntrctnHlthRskAdjFctr> Fields;

	public Decimal CmnyFullBnftDualDisabled;
	public Decimal CmnyPartialBenefitDualAged;
	public Decimal CmnyPartialBnftDualDsbl;
	public Decimal Community;
	public Decimal CommunityFullBnftDualAged;
	public Decimal CommunityNonDualAged;
	public Decimal CommunityNonDualDisabled;
	public String ConditionCodeList;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Decimal Institutional;
	public String InteractingCondCodeList;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsDisabled;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
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
	public CondIntrctnHlthRskAdjFctrFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CondIntrctnHlthRskAdjFctrHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public CondIntrctnHlthRskAdjFctrShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CondIntrctnHlthRskAdjFctr clone$() {throw new java.lang.UnsupportedOperationException();}
	public CondIntrctnHlthRskAdjFctr clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CondIntrctnHlthRskAdjFctr clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CondIntrctnHlthRskAdjFctr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CondIntrctnHlthRskAdjFctr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
