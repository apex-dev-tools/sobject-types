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
public class VideoCall extends SObject {
	public static SObjectType$<VideoCall> SObjectType;
	public static SObjectFields$<VideoCall> Fields;

	public Datetime AcceptanceTimeStamp;
	public Id ConsentedUserId;
	public User ConsentedUser;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Integer DurationInSeconds;
	public Datetime EndDateTime;
	public Id EventId;
	public Event Event;
	public String ExternalId;
	public Id HostId;
	public User Host;
	public Id Id;
	public Integer IntelligenceScore;
	public Boolean IsCallCoachingIncluded;
	public Boolean IsDeleted;
	public Boolean IsDiarizationOptIn;
	public Boolean IsRecorded;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String MeetingType;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id RelatedRecordId;
	public Name RelatedRecord;
	public Datetime StartDateTime;
	public Datetime SystemModstamp;
	public String TranscribedLanguage;
	public String UsageType;
	public String VendorMeetingKey;
	public String VendorMeetingUuid;
	public String VendorName;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public VideoCallFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public VideoCallShare[] Shares;
	public SharingRecordCollectionItem[] SharingRecordCollectionItems;
	public VideoCallRecording[] VideoCallRecords;
	public VideoCallParticipant[] VideoCalls;

	public VideoCall clone$() {throw new java.lang.UnsupportedOperationException();}
	public VideoCall clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public VideoCall clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public VideoCall clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public VideoCall clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
