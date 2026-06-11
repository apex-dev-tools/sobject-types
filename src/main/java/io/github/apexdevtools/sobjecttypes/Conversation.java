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
	public Integer EndTimeMilliSecs;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Datetime StartTime;
	public Integer StartTimeMilliSecs;

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
