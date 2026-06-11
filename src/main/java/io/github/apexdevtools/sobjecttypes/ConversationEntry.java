/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ConversationEntry extends SObject {
	public static SObjectType$<ConversationEntry> SObjectType;
	public static SObjectFields$<ConversationEntry> Fields;

	public Id ActorId;
	public Name Actor;
	public String ActorName;
	public String ActorType;
	public Integer ClientDuration;
	public Datetime ClientTimestamp;
	public Id ConversationEntityId;
	public Conversation ConversationEntity;
	public Id ConversationId;
	public Name Conversation;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EntryEndTime;
	public Datetime EntryTime;
	public Integer EntryTimeMilliSecs;
	public String EntryType;
	public Boolean HasAttachments;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Message;
	public Datetime MessageDeliverTime;
	public String MessageIdentifier;
	public Datetime MessageReadTime;
	public Datetime MessageSendTime;
	public String MessageStatus;
	public String MessageStatusCode;
	public Integer Seq;
	public Datetime ServerReceivedTimestamp;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ConvEntryRelatedRecordCopy[] ConvEntryRelatedRecordCopies;

	public ConversationEntry clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConversationEntry clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConversationEntry clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConversationEntry clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConversationEntry clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
