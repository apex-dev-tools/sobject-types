/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ConversationDefinitionEventLog extends SObject {
	public static SObjectType$<ConversationDefinitionEventLog> SObjectType;
	public static SObjectFields$<ConversationDefinitionEventLog> Fields;

	public String Action;
	public String ChannelType;
	public Id ConversationDefinitionId;
	public BotVersion ConversationDefinition;
	public String ConversationTurn;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DialogDefinitionId;
	public ConversationDefinitionDialog DialogDefinition;
	public Integer Duration;
	public Datetime EventDateTime;
	public String EventDetails;
	public String EventLabel;
	public String EventTarget;
	public String EventTargetType;
	public String EventTimestamp;
	public String EventUuid;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsSuccessful;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LogLevel;
	public String LogType;
	public Integer NumTokens;
	public Id ParentId;
	public ConversationDefinitionSession Parent;
	public String Planner;
	public Id PreviousEventLogId;
	public ConversationDefinitionEventLog PreviousEventLog;
	public String PreviousEventLogUuid;
	public String StepType;
	public Datetime SystemModstamp;
	public String User;

	public ConversationDefinitionEventLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConversationDefinitionEventLog clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConversationDefinitionEventLog clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConversationDefinitionEventLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConversationDefinitionEventLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
