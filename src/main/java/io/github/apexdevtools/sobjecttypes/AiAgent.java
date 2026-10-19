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
public class AiAgent extends SObject {
	public static SObjectType$<AiAgent> SObjectType;
	public static SObjectFields$<AiAgent> Fields;

	public String AgentType;
	public String Capabilities;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Definition;
	public String Description;
	public String DeveloperName;
	public String ExternalName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String Provider;
	public String Skills;
	public String Status;
	public Datetime SystemModstamp;
	public String Url;

	public ConversationEntry[] ConversationEntries;
	public ConversationParticipant[] ConversationParticipants;

	public AiAgent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AiAgent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AiAgent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AiAgent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AiAgent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
