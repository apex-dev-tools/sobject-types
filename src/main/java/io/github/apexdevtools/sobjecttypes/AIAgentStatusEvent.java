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
public class AIAgentStatusEvent extends SObject {
	public static SObjectType$<AIAgentStatusEvent> SObjectType;
	public static SObjectFields$<AIAgentStatusEvent> Fields;

	public String AgentDescription;
	public String AgentDeveloperName;
	public String AgentIdentifier;
	public String AgentName;
	public String AgentVersionIdentifier;
	public String AiAgentEventType;
	public String AiAgentIdentifier;
	public String AiAgentName;
	public String ConsumerAiAgentIdentifier;
	public String ConsumerBotDefinitionIdentifier;
	public String ConsumerOrgIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public Boolean IsAgentActive;
	public String OrgIdentifier;
	public String ProviderAiAgentIdentifier;
	public String ProviderBotDefinitionIdentifier;
	public String ProviderOrgIdentifier;
	public String ReplayId;

	public AIAgentStatusEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AIAgentStatusEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AIAgentStatusEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AIAgentStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AIAgentStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
