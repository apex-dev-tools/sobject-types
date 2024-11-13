/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class FlowOrchestration extends SObject {
	public static SObjectType$<FlowOrchestration> SObjectType;
	public static SObjectFields$<FlowOrchestration> Fields;

	public Id ActiveVersionId;
	public FlowOrchestrationVersion ActiveVersion;
	public String ApiName;
	public Integer ApiVersion;
	public Integer AverageRunTime;
	public Decimal CompletionRate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Integer FailedRunCount;
	public Id Id;
	public String InstalledPackageName;
	public Boolean IsCitizenEnabled;
	public Boolean IsDeleted;
	public Boolean IsOverridable;
	public Boolean IsTemplate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String ManageableState;
	public String Name;
	public String NamespacePrefix;
	public String OrchestrationDefinition;
	public String OrchestrationLabel;
	public String OrchestrationType;
	public Id OverriddenById;
	public FlowOrchestration OverriddenBy;
	public Id OverriddenOrchestrationId;
	public FlowOrchestration OverriddenOrchestration;
	public Integer RunCount;
	public Id SourceTemplateId;
	public FlowOrchestration SourceTemplate;
	public String Status;
	public Datetime SystemModstamp;
	public String TriggerType;

	public FlowOrchestrationVersion[] FlowOrchestrationVersions;

	public FlowOrchestration clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestration clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestration clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestration clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestration clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
