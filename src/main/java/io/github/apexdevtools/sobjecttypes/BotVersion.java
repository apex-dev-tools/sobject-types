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
public class BotVersion extends SObject {
	public static SObjectType$<BotVersion> SObjectType;
	public static SObjectFields$<BotVersion> Fields;

	public String BillingMode;
	public Id BotDefinitionId;
	public BotDefinition BotDefinition;
	public String CopilotPrimaryLanguage;
	public String CopilotSecondaryLanguages;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Status;
	public Datetime SystemModstamp;
	public String ToneType;
	public Integer VersionNumber;

	public ConversationDefinitionDialog[] ConversationDefinitionDialogs;

	public BotVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public BotVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BotVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BotVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BotVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
