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
public class ConversationDefinitionSession extends SObject {
	public static SObjectType$<ConversationDefinitionSession> SObjectType;
	public static SObjectFields$<ConversationDefinitionSession> Fields;

	public String ChannelType;
	public Id ConversationDefinitionId;
	public BotVersion ConversationDefinition;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ExternalSessionKey;
	public Boolean HasErrorLogs;
	public Integer Hour;
	public Id Id;
	public String IntegrationName;
	public String IntegrationType;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Mode;
	public Integer SessionDuration;
	public String SessionEndType;
	public Datetime SessionStartTime;
	public String SessionStatus;
	public String SessionTransferResult;
	public String SessionTransferTargetType;
	public String SessionTransferType;
	public Datetime SystemModstamp;
	public Boolean WasSessionEngaged;

	public ConvDefSessionMetric[] ConvDefSessionMetrics;
	public ConversationDefinitionSessionEngagement[] ConversationEngagements;

	public ConversationDefinitionSession clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConversationDefinitionSession clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConversationDefinitionSession clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConversationDefinitionSession clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConversationDefinitionSession clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
