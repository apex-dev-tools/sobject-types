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
public class CollaborationGroup extends SObject {
	public static SObjectType$<CollaborationGroup> SObjectType;
	public static SObjectFields$<CollaborationGroup> Fields;

	public Id AnnouncementId;
	public Announcement Announcement;
	public String BannerPhotoUrl;
	public Boolean CanHaveGuests;
	public String CollaborationType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String FullPhotoUrl;
	public String GroupEmail;
	public Boolean HasPrivateFieldsAccess;
	public Id Id;
	public String InformationBody;
	public String InformationTitle;
	public Boolean IsArchived;
	public Boolean IsAutoArchiveDisabled;
	public Boolean IsBroadcast;
	public Datetime LastFeedModifiedDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String MediumPhotoUrl;
	public Integer MemberCount;
	public String Name;
	public Id NetworkId;
	public Network Network;
	public Id OwnerId;
	public User Owner;
	public String SmallPhotoUrl;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public LightningOnboardingConfig[] ChatterGroup;
	public CollaborationGroupRecord[] CollaborationGroupRecords;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CollaborationGroupFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CollaborationGroupMemberRequest[] GroupMemberRequests;
	public CollaborationGroupMember[] GroupMembers;
	public NetworkActivityAudit[] ParentEntities;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;

	public CollaborationGroup clone$() {throw new java.lang.UnsupportedOperationException();}
	public CollaborationGroup clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationGroup clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationGroup clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationGroup clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
