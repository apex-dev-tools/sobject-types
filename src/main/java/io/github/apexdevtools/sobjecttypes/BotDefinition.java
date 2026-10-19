/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class BotDefinition extends SObject {
	public static SObjectType$<BotDefinition> SObjectType;
	public static SObjectFields$<BotDefinition> Fields;

	public String AgentTemplate;
	public String AgentType;
	public String BotSource;
	public Id BotUserId;
	public User BotUser;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Datetime SystemModstamp;
	public String Type;

	public BotVersion[] BotVersions;
	public ConversationEntry[] ConversationEntries;
	public ConversationParticipant[] ConversationParticipants;
	public FlowRecord[] Flows;
	public SetupEntityAccess[] SetupEntityAccessItems;

	public BotDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public BotDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BotDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BotDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BotDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
