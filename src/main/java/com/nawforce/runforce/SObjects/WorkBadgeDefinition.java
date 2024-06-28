/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class WorkBadgeDefinition extends SObject {
	public static SObjectType$<WorkBadgeDefinition> SObjectType;
	public static SObjectFields$<WorkBadgeDefinition> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Integer GivenBadgeCount;
	public Id Id;
	public String ImageUrl;
	public Boolean IsActive;
	public Boolean IsCompanyWide;
	public Boolean IsDeleted;
	public Boolean IsLimitPerUser;
	public Boolean IsRewardBadge;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer LimitNumber;
	public Date LimitStartDate;
	public String Name;
	public Id NetworkId;
	public Network Network;
	public Id OwnerId;
	public Name Owner;
	public Id RewardFundId;
	public WorkRewardFund RewardFund;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public WorkBadge[] Badges;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WorkBadgeDefinitionFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public WorkBadgeDefinitionHistory[] Histories;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public WorkBadgeDefinitionShare[] Shares;
	public WorkAccess[] WorkAccesses;

	public WorkBadgeDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkBadgeDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkBadgeDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkBadgeDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkBadgeDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
