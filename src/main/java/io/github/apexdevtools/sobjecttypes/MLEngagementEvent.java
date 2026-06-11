/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class MLEngagementEvent extends SObject {
	public static SObjectType$<MLEngagementEvent> SObjectType;
	public static SObjectFields$<MLEngagementEvent> Fields;

	public String ClientSession;
	public String Cloud;
	public String ContextId;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CustomFields;
	public String Entity;
	public String EntityType;
	public String EventIdentifier;
	public String EventName;
	public String EventUuid;
	public String Feature;
	public String LoggedAt;
	public String LoggerAppName;
	public String LoggerName;
	public String Org;
	public String PageContext;
	public String PageUrl;
	public String ReplayId;
	public Integer Score;
	public String Type;
	public Id UserId;
	public User User;
	public Decimal Value;

	public MLEngagementEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MLEngagementEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MLEngagementEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MLEngagementEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MLEngagementEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
