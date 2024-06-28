/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ShippingRateArea extends SObject {
	public static SObjectType$<ShippingRateArea> SObjectType;
	public static SObjectFields$<ShippingRateArea> Fields;

	public String Countries;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Regions;
	public Id ShippingRateGroupId;
	public ShippingRateGroup ShippingRateGroup;
	public Datetime SystemModstamp;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public StandardShippingRate[] StandardShippingRates;

	public ShippingRateArea clone$() {throw new java.lang.UnsupportedOperationException();}
	public ShippingRateArea clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ShippingRateArea clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ShippingRateArea clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ShippingRateArea clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
