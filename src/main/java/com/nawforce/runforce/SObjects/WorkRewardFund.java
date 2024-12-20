/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class WorkRewardFund extends SObject {
	public static SObjectType$<WorkRewardFund> SObjectType;
	public static SObjectFields$<WorkRewardFund> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsActive;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public com.nawforce.runforce.System.String Name;
	public Id OwnerId;
	public Name Owner;
	public Id RewardFundTypeId;
	public WorkRewardFundType RewardFundType;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.Integer TotalCodeCount;
	public com.nawforce.runforce.System.String Type;
	public com.nawforce.runforce.System.Integer UsedCodeCount;
	public Decimal Value;

	public AttachedContentDocument[] AttachedContentDocuments;
	public WorkBadgeDefinition[] BadgeDefinitions;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WorkRewardFundFeed[] Feeds;
	public WorkRewardFundHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public WorkReward[] Rewards;
	public WorkRewardFundShare[] Shares;

	public WorkRewardFund clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkRewardFund clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkRewardFund clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkRewardFund clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkRewardFund clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
