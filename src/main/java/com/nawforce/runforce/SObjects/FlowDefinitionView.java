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
public class FlowDefinitionView extends SObject {
	public static SObjectType$<FlowDefinitionView> SObjectType;
	public static SObjectFields$<FlowDefinitionView> Fields;

	public String ActiveVersionId;
	public String ApiName;
	public Integer ApiVersion;
	public String Builder;
	public String Description;
	public String DurableId;
	public String Environments;
	public Boolean HasAsyncAfterCommitPath;
	public Id Id;
	public String InstalledPackageName;
	public Boolean IsActive;
	public Boolean IsOutOfDate;
	public Boolean IsOverridable;
	public Boolean IsSwingFlow;
	public Boolean IsTemplate;
	public String Label;
	public String LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LatestVersionId;
	public String ManageableState;
	public String NamespacePrefix;
	public String OverriddenById;
	public String OverriddenFlowId;
	public String ProcessType;
	public String RecordTriggerType;
	public String SourceTemplateId;
	public String TriggerObjectOrEventId;
	public String TriggerObjectOrEventLabel;
	public Integer TriggerOrder;
	public String TriggerType;
	public Integer VersionNumber;

	public FlowTestResult[] FlowTestResults;
	public FlowTestView[] FlowTestViews;
	public FlowVersionView[] Versions;

	public FlowDefinitionView clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowDefinitionView clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowDefinitionView clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowDefinitionView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowDefinitionView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
