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
public class ContentDocument extends SObject {
	public static SObjectType$<ContentDocument> SObjectType;
	public static SObjectFields$<ContentDocument> Fields;

	public Id ArchivedById;
	public User ArchivedBy;
	public Date ArchivedDate;
	public Id ContentAssetId;
	public ContentAsset ContentAsset;
	public Datetime ContentModifiedDate;
	public Integer ContentSize;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String FileExtension;
	public String FileType;
	public Id Id;
	public Boolean IsArchived;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LatestPublishedVersionId;
	public ContentVersion LatestPublishedVersion;
	public Id OwnerId;
	public User Owner;
	public Id ParentId;
	public ContentWorkspace Parent;
	public String PublishStatus;
	public String SharingOption;
	public String SharingPrivacy;
	public Datetime SystemModstamp;
	public String Title;

	public NetworkActivityAudit[] AuditableEntities;
	public AuthorizationFormText[] AuthorizationFormTexts;
	public ContentDistribution[] ContentDistributions;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ContentVersion[] ContentVersions;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ContentDocumentFeed[] Feeds;
	public ContentDocumentHistory[] Histories;
	public NetworkActivityAudit[] ParentEntities;
	public TopicAssignment[] TopicAssignments;

	public ContentDocument clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentDocument clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocument clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocument clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocument clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
