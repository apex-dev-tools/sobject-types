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
public class FlowOrchestrationVersionChangeEvent extends SObject {
	public static SObjectType$<FlowOrchestrationVersionChangeEvent> SObjectType;
	public static SObjectFields$<FlowOrchestrationVersionChangeEvent> Fields;

	public Id ActivatedById;
	public User ActivatedBy;
	public Datetime ActivatedDate;
	public Decimal ApiVersion;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id FlowOrchestrationId;
	public FlowOrchestration FlowOrchestration;
	public Id Id;
	public Boolean IsOverridable;
	public Boolean IsTemplate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String OrchestrationType;
	public Id OverriddenById;
	public FlowOrchestration OverriddenBy;
	public Id OverriddenOrchestrationId;
	public FlowOrchestration OverriddenOrchestration;
	public String ReplayId;
	public String RunInMode;
	public Id SourceTemplateId;
	public FlowOrchestration SourceTemplate;
	public String Status;
	public String TriggerObjectOrEventLabel;
	public Integer VersionNumber;

	public FlowOrchestrationVersionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationVersionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationVersionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationVersionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationVersionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
