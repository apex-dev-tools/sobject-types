/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class SecurityDefenseActionEvent extends SObject {
	public static SObjectType$<SecurityDefenseActionEvent> SObjectType;
	public static SObjectFields$<SecurityDefenseActionEvent> Fields;

	public String ActionName;
	public Datetime CreatedDate;
	public Datetime DetectedAt;
	public String EntityIdentifier;
	public String EventIdentifier;
	public String EventUuid;
	public Datetime ExecutedAt;
	public String ReplayId;
	public String Status;

	public SecurityDefenseActionEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SecurityDefenseActionEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SecurityDefenseActionEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SecurityDefenseActionEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SecurityDefenseActionEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
