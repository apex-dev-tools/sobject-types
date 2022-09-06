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
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ActiveScratchOrgShare[] Shares;

	public ActiveScratchOrg clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActiveScratchOrg clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActiveScratchOrg clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActiveScratchOrg clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActiveScratchOrg clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
