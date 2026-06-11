/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class VoiceCall extends SObject {
	public static SObjectType$<VoiceCall> SObjectType;
	public static SObjectFields$<VoiceCall> Fields;

	public Id ActivityId;
	public Task Activity;
	public Datetime CallConnectDateTime;
	public String CallDisposition;
	public Integer CallDurationInSeconds;
	public Datetime CallEndDateTime;
	public String CallOrigin;
	public Id CallRecordingId;
	public VoiceCallRecording CallRecording;
	public Datetime CallStartDateTime;
	public String CallType;
	public String CallerIdType;
	public String ConferenceKey;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyCode;
	public String FromPhoneNumber;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsDiarizationOptIn;
	public Boolean IsRecorded;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MediaProviderId;
	public CallCoachingMediaProvider MediaProvider;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Decimal Price;
	public Id RelatedRecordId;
	public Name RelatedRecord;
	public String SourceType;
	public Datetime SystemModstamp;
	public String ToPhoneNumber;
	public String TranscribedLanguage;
	public Id UserId;
	public User User;
	public String VendorCallKey;
	public String VendorParentCallKey;
	public String VendorType;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContactRequest[] ContactRequests;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ConversationEntry[] ConversationEntries;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EngagementAttendee[] EngagementAttendees;
	public EngagementTopic[] EngagementTopics;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public VoiceCallFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public VoiceCallShare[] Shares;
	public SharingRecordCollectionItem[] SharingRecordCollectionItems;

	public VoiceCall clone$() {throw new java.lang.UnsupportedOperationException();}
	public VoiceCall clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public VoiceCall clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public VoiceCall clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public VoiceCall clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
