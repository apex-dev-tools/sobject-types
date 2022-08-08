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
public class ActiveScratchOrg extends SObject {
	public static SObjectType$<ActiveScratchOrg> SObjectType;
	public static SObjectFields$<ActiveScratchOrg> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String Edition;
	public Date ExpirationDate;
	public com.nawforce.runforce.System.String Features;
	public com.nawforce.runforce.System.Boolean HasSampleData;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Date LastLoginDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.String Namespace;
	public com.nawforce.runforce.System.String OrgName;
	public Id OwnerId;
	public Name Owner;
	public com.nawforce.runforce.System.String ScratchOrg;
	public Id ScratchOrgInfoId;
	public ScratchOrgInfo ScratchOrgInfo;
	public com.nawforce.runforce.System.String SignupEmail;
	public com.nawforce.runforce.System.String SignupInstance;
	public com.nawforce.runforce.System.Integer SignupTrialDays;
	public com.nawforce.runforce.System.String SignupUsername;
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
	public ActiveScratchOrg clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActiveScratchOrg clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActiveScratchOrg clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActiveScratchOrg clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
