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
public class RuleLibraryVersion extends SObject {
	public static SObjectType$<RuleLibraryVersion> SObjectType;
	public static SObjectFields$<RuleLibraryVersion> Fields;

	public String ApiName;
	public Id CloneSourceRuleLibVerId;
	public RuleLibraryVersion CloneSourceRuleLibVer;
	public String ContextDefinitionName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime EndDateTime;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id RuleLibraryDefVersionId;
	public RuleLibraryDefVersion RuleLibraryDefVersion;
	public Id RuleLibraryId;
	public RuleLibrary RuleLibrary;
	public Datetime StartDateTime;
	public String Status;
	public Datetime SystemModstamp;
	public Integer VersionNumber;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public RuleLibraryVersionFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public RuleLibraryVersionHistory[] Histories;
	public RevenueTransactionErrorLog[] PrimaryRevenueTransactionErrorLogs;

	public RuleLibraryVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public RuleLibraryVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RuleLibraryVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RuleLibraryVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RuleLibraryVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
