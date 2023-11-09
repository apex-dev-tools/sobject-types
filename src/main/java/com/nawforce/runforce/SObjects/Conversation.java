/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Conversation extends SObject {
	public static SObjectType$<Conversation> SObjectType;
	public static SObjectFields$<Conversation> Fields;

	public Id ConversationChannelId;
	public SObject ConversationChannel;
	public String ConversationIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EndTime;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Datetime StartTime;

	public ContextParamMap[] ContextParamMaps;
	public ConversationEntry[] ConvEntries;
	public ConversationEntry[] ConversationEntries;
	public ConversationParticipant[] ConversationParticipants;

	public Conversation clone$() {throw new java.lang.UnsupportedOperationException();}
	public Conversation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Conversation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Conversation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Conversation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
