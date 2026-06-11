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
public class WorkRewardFundType extends SObject {
	public static SObjectType$<WorkRewardFundType> SObjectType;
	public static SObjectFields$<WorkRewardFundType> Fields;

	public io.github.apexdevtools.standardtypes.System.String CodeValidationPattern;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public io.github.apexdevtools.standardtypes.System.String CreditSystem;
	public io.github.apexdevtools.standardtypes.System.String CurrencyCode;
	public io.github.apexdevtools.standardtypes.System.String CurrencyIsoCode;
	public Id Id;
	public io.github.apexdevtools.standardtypes.System.Boolean IsActive;
	public io.github.apexdevtools.standardtypes.System.Boolean IsDeleted;
	public io.github.apexdevtools.standardtypes.System.Boolean IsPredefined;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public io.github.apexdevtools.standardtypes.System.String Name;
	public Id OwnerId;
	public Name Owner;
	public io.github.apexdevtools.standardtypes.System.String RedemptionDisclaimer;
	public io.github.apexdevtools.standardtypes.System.String RedemptionInfo;
	public io.github.apexdevtools.standardtypes.System.String RedemptionUrl;
	public Datetime SystemModstamp;
	public io.github.apexdevtools.standardtypes.System.Integer UploadCodeColumn;
	public io.github.apexdevtools.standardtypes.System.Integer UploadValueColumn;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WorkRewardFundTypeFeed[] Feeds;
	public WorkRewardFundTypeHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public WorkRewardFund[] RewardFunds;
	public WorkRewardFundTypeShare[] Shares;

	public WorkRewardFundType clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkRewardFundType clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkRewardFundType clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkRewardFundType clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone, io.github.apexdevtools.standardtypes.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkRewardFundType clone$(io.github.apexdevtools.standardtypes.System.Boolean preserveId, io.github.apexdevtools.standardtypes.System.Boolean isDeepClone, io.github.apexdevtools.standardtypes.System.Boolean preserveReadonlyTimestamps, io.github.apexdevtools.standardtypes.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
