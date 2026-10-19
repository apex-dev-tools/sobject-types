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
public class ConvDefDialogHourlyMetric extends SObject {
	public static SObjectType$<ConvDefDialogHourlyMetric> SObjectType;
	public static SObjectFields$<ConvDefDialogHourlyMetric> Fields;

	public String Article;
	public String ArticleName;
	public String BotDefinitionName;
	public String ChannelType;
	public Id ConversationDefinitionId;
	public BotVersion ConversationDefinition;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DialogDefinitionId;
	public ConversationDefinitionDialog DialogDefinition;
	public String DialogDefinitionName;
	public String DialogEntryPoint;
	public String GoalName;
	public Integer Hour;
	public Id Id;
	public String IntegrationName;
	public String IntegrationType;
	public String IntentLabel;
	public Boolean IsDeleted;
	public Boolean IsSuccessful;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime MetricDateTime;
	public String MetricType;
	public String Name;
	public Id ParentId;
	public ConvDefDialogDailyMetric Parent;
	public String ParentSessionKey;
	public String SessionEndType;
	public String SessionTransferType;
	public String StaticChoiceValue;
	public Datetime SystemModstamp;
	public Integer Value;

	public ConvDefDialogHourlyMetric clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConvDefDialogHourlyMetric clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConvDefDialogHourlyMetric clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConvDefDialogHourlyMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConvDefDialogHourlyMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
