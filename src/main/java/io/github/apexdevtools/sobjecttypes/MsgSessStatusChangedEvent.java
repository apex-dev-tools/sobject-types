/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class MsgSessStatusChangedEvent extends SObject {
	public static SObjectType$<MsgSessStatusChangedEvent> SObjectType;
	public static SObjectFields$<MsgSessStatusChangedEvent> Fields;

	public String Channel;
	public String ChannelAddressIdentifier;
	public String Conversation;
	public String ConversationIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EndTime;
	public String EventUuid;
	public String MessagingEndUser;
	public String MessagingSessionStatusEndedBy;
	public String PreviousSessionStatus;
	public String ReplayId;
	public String Session;
	public String SessionOrigin;
	public String SessionStatus;
	public Datetime StartTime;

	public MsgSessStatusChangedEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MsgSessStatusChangedEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MsgSessStatusChangedEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MsgSessStatusChangedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MsgSessStatusChangedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
