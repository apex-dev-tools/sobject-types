/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ActiveScratchOrg extends SObject {
	public static SObjectType$<ActiveScratchOrg> SObjectType;
	public static SObjectFields$<ActiveScratchOrg> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Edition;
	public Date ExpirationDate;
	public String Features;
	public Boolean HasSampleData;
	public Id Id;
	public Boolean IsDeleted;
	public Date LastLoginDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String Namespace;
	public String OrgName;
	public Id OwnerId;
	public Name Owner;
	public String ScratchOrg;
	public Id ScratchOrgInfoId;
	public ScratchOrgInfo ScratchOrgInfo;
	public String SignupEmail;
	public String SignupInstance;
	public Integer SignupTrialDays;
	public String SignupUsername;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ActiveScratchOrgFeed[] Feeds;
	public ActiveScratchOrgHistory[] Histories;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ActiveScratchOrgShare[] Shares;

	public ActiveScratchOrg clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActiveScratchOrg clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActiveScratchOrg clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActiveScratchOrg clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActiveScratchOrg clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
