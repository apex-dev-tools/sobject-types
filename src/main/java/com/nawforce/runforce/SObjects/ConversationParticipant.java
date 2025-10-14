/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ConversationParticipant extends SObject {
	public static SObjectType$<ConversationParticipant> SObjectType;
	public static SObjectFields$<ConversationParticipant> Fields;

	public String AppType;
	public Id ConversationId;
	public Conversation Conversation;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Datetime JoinedTime;
	public Integer JoinedTimeMilliSecs;
	public Datetime LastActiveTime;
	public Integer LastActiveTimeMilliSecs;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LeftTime;
	public Integer LeftTimeMilliSecs;
	public String Name;
	public String ParticipantContext;
	public String ParticipantDisplayName;
	public Id ParticipantEntityId;
	public Name ParticipantEntity;
	public String ParticipantKey;
	public String ParticipantRole;

	public ContextParamMap[] ContextParamMaps;
	public ConversationEntry[] ConversationEntries;

	public ConversationParticipant clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConversationParticipant clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConversationParticipant clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConversationParticipant clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConversationParticipant clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
