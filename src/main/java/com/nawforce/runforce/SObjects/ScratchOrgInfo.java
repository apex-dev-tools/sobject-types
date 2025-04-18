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
public class ScratchOrgInfo extends SObject {
	public static SObjectType$<ScratchOrgInfo> SObjectType;
	public static SObjectFields$<ScratchOrgInfo> Fields;

	public String AdminEmail;
	public String AuthCode;
	public String ConnectedAppCallbackUrl;
	public String ConnectedAppConsumerKey;
	public String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DeletedBy;
	public Date DeletedDate;
	public String Description;
	public Integer DurationDays;
	public String Edition;
	public String ErrorCode;
	public Date ExpirationDate;
	public String Features;
	public Boolean HasSampleData;
	public Id Id;
	public String Instance;
	public Boolean IsDeleted;
	public String Language;
	public Date LastLoginDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LoginUrl;
	public String Name;
	public String Namespace;
	public String OrgName;
	public Id OwnerId;
	public Name Owner;
	public String Package2AncestorIds;
	public String Release;
	public String ScratchOrg;
	public String SignupCountry;
	public String SignupEmail;
	public String SignupInstance;
	public String SignupLanguage;
	public Integer SignupTrialDays;
	public String SignupUsername;
	public String SourceOrg;
	public String Status;
	public Datetime SystemModstamp;
	public String Username;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ScratchOrgInfoFeed[] Feeds;
	public ScratchOrgInfoHistory[] Histories;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ScratchOrgInfoShare[] Shares;

	public ScratchOrgInfo clone$() {throw new java.lang.UnsupportedOperationException();}
	public ScratchOrgInfo clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ScratchOrgInfo clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ScratchOrgInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ScratchOrgInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
