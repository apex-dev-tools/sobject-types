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
public class ScratchOrgInfo extends SObject {
	public static SObjectType$<ScratchOrgInfo> SObjectType;
	public static SObjectFields$<ScratchOrgInfo> Fields;

	public com.nawforce.runforce.System.String AdminEmail;
	public com.nawforce.runforce.System.String AuthCode;
	public com.nawforce.runforce.System.String ConnectedAppCallbackUrl;
	public com.nawforce.runforce.System.String ConnectedAppConsumerKey;
	public com.nawforce.runforce.System.String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String DeletedBy;
	public Date DeletedDate;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.Integer DurationDays;
	public com.nawforce.runforce.System.String Edition;
	public com.nawforce.runforce.System.String ErrorCode;
	public Date ExpirationDate;
	public com.nawforce.runforce.System.String Features;
	public com.nawforce.runforce.System.Boolean HasSampleData;
	public Id Id;
	public com.nawforce.runforce.System.String Instance;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.String Language;
	public Date LastLoginDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public com.nawforce.runforce.System.String LoginUrl;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.String Namespace;
	public com.nawforce.runforce.System.String OrgName;
	public Id OwnerId;
	public Name Owner;
	public com.nawforce.runforce.System.String Package2AncestorIds;
	public com.nawforce.runforce.System.String Release;
	public com.nawforce.runforce.System.String ScratchOrg;
	public com.nawforce.runforce.System.String SignupCountry;
	public com.nawforce.runforce.System.String SignupEmail;
	public com.nawforce.runforce.System.String SignupInstance;
	public com.nawforce.runforce.System.String SignupLanguage;
	public com.nawforce.runforce.System.Integer SignupTrialDays;
	public com.nawforce.runforce.System.String SignupUsername;
	public com.nawforce.runforce.System.String SourceOrg;
	public com.nawforce.runforce.System.String Status;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String Username;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ScratchOrgInfoFeed[] Feeds;
	public ScratchOrgInfoHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ScratchOrgInfoShare[] Shares;

	public ScratchOrgInfo clone$() {throw new java.lang.UnsupportedOperationException();}
	public ScratchOrgInfo clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ScratchOrgInfo clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ScratchOrgInfo clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ScratchOrgInfo clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
