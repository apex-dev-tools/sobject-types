/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;

@SuppressWarnings("unused")
public class ConversationDefinitionSessionEngagement extends SObject {
	public static SObjectType$<ConversationDefinitionSessionEngagement> SObjectType;
	public static SObjectFields$<ConversationDefinitionSessionEngagement> Fields;

	public Id ConversationEngagementId;
	public Name ConversationEngagement;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id SessionId;
	public ConversationDefinitionSession Session;
	public Datetime SystemModstamp;

	public ConversationDefinitionSessionEngagement clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConversationDefinitionSessionEngagement clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConversationDefinitionSessionEngagement clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConversationDefinitionSessionEngagement clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConversationDefinitionSessionEngagement clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
