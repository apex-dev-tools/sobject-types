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
public class ShippingConfigurationSet extends SObject {
	public static SObjectType$<ShippingConfigurationSet> SObjectType;
	public static SObjectFields$<ShippingConfigurationSet> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDefault;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Integer ProcessTime;
	public String ProcessTimeUnit;
	public Datetime SystemModstamp;
	public Id TargetRecordId;
	public WebStore TargetRecord;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ShippingConfigurationSetShare[] Shares;
	public ShippingRateGroup[] ShippingRateGroups;

	public ShippingConfigurationSet clone$() {throw new java.lang.UnsupportedOperationException();}
	public ShippingConfigurationSet clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ShippingConfigurationSet clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ShippingConfigurationSet clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ShippingConfigurationSet clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
