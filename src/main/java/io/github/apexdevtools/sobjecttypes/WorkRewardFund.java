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

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class WorkRewardFund extends SObject {
	public static SObjectType$<WorkRewardFund> SObjectType;
	public static SObjectFields$<WorkRewardFund> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public io.github.apexdevtools.standardtypes.System.String CurrencyIsoCode;
	public Id Id;
	public io.github.apexdevtools.standardtypes.System.Boolean IsActive;
	public io.github.apexdevtools.standardtypes.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public io.github.apexdevtools.standardtypes.System.String Name;
	public Id OwnerId;
	public Name Owner;
	public Id RewardFundTypeId;
	public WorkRewardFundType RewardFundType;
	public Datetime SystemModstamp;
	public io.github.apexdevtools.standardtypes.System.Integer TotalCodeCount;
	public io.github.apexdevtools.standardtypes.System.String Type;
	public io.github.apexdevtools.standardtypes.System.Integer UsedCodeCount;
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
	public WorkRewardFund clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkRewardFund clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkRewardFund clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone, io.github.apexdevtools.standardtypes.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkRewardFund clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone, io.github.apexdevtools.standardtypes.System.Boolean preserveReadonlyTimestamps, io.github.apexdevtools.standardtypes.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
