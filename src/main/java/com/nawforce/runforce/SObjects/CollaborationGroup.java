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
public class CollaborationGroup extends SObject {
	public static SObjectType$<CollaborationGroup> SObjectType;
	public static SObjectFields$<CollaborationGroup> Fields;

	public Id AnnouncementId;
	public Announcement Announcement;
	public com.nawforce.runforce.System.String BannerPhotoUrl;
	public com.nawforce.runforce.System.Boolean CanHaveGuests;
	public com.nawforce.runforce.System.String CollaborationType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String FullPhotoUrl;
	public com.nawforce.runforce.System.String GroupEmail;
	public com.nawforce.runforce.System.Boolean HasPrivateFieldsAccess;
	public Id Id;
	public com.nawforce.runforce.System.String InformationBody;
	public com.nawforce.runforce.System.String InformationTitle;
	public com.nawforce.runforce.System.Boolean IsArchived;
	public com.nawforce.runforce.System.Boolean IsAutoArchiveDisabled;
	public com.nawforce.runforce.System.Boolean IsBroadcast;
	public Datetime LastFeedModifiedDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public com.nawforce.runforce.System.String MediumPhotoUrl;
	public com.nawforce.runforce.System.Integer MemberCount;
	public com.nawforce.runforce.System.String Name;
	public Id OwnerId;
	public User Owner;
	public com.nawforce.runforce.System.String SmallPhotoUrl;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public LightningOnboardingConfig[] ChatterGroup;
	public CollaborationGroupRecord[] CollaborationGroupRecords;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CollaborationGroupFeed[] Feeds;
	public CollaborationGroupMemberRequest[] GroupMemberRequests;
	public CollaborationGroupMember[] GroupMembers;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;

	public CollaborationGroup clone$() {throw new java.lang.UnsupportedOperationException();}
	public CollaborationGroup clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationGroup clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationGroup clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationGroup clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
