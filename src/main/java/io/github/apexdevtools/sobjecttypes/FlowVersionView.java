/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class FlowVersionView extends SObject {
	public static SObjectType$<FlowVersionView> SObjectType;
	public static SObjectFields$<FlowVersionView> Fields;

	public Decimal ApiVersion;
	public Decimal ApiVersionRuntime;
	public Boolean AreMetricsLoggedToDataCloud;
	public String CapabilityType;
	public String CapacityCategory;
	public String Description;
	public String DurableId;
	public String FlowDefinitionViewId;
	public Id Id;
	public Boolean IsSwingFlow;
	public Boolean IsTemplate;
	public String Label;
	public Datetime LastModifiedDate;
	public String ProcessType;
	public String RunInMode;
	public String Status;
	public Integer VersionNumber;

	public FlowTestResult[] FlowTestResults;
	public FlowVariableView[] Variables;

	public FlowVersionView clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowVersionView clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowVersionView clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowVersionView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowVersionView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
