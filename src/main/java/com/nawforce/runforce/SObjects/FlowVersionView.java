/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class FlowVersionView extends SObject {
	public static SObjectType$<FlowVersionView> SObjectType;
	public static SObjectFields$<FlowVersionView> Fields;

	public Decimal ApiVersion;
	public Decimal ApiVersionRuntime;
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
