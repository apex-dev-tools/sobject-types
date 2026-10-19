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
public class McpServerConfigurationEvent extends SObject {
	public static SObjectType$<McpServerConfigurationEvent> SObjectType;
	public static SObjectFields$<McpServerConfigurationEvent> Fields;

	public String Action;
	public String ActionBy;
	public Datetime ActionDate;
	public String AddedBy;
	public Datetime AddedDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventIdentifier;
	public String EventUuid;
	public String ReplayId;
	public String RiskScore;
	public String ServerName;
	public String ServerUrl;
	public String Tenant;
	public Integer ToolCount;
	public String Tools;

	public McpServerConfigurationEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public McpServerConfigurationEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public McpServerConfigurationEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public McpServerConfigurationEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public McpServerConfigurationEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
