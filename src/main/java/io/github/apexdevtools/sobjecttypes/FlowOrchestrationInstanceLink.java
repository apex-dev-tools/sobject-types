/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class FlowOrchestrationInstanceLink extends SObject {
	public static SObjectType$<FlowOrchestrationInstanceLink> SObjectType;
	public static SObjectFields$<FlowOrchestrationInstanceLink> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id FlowOrchestrationInstanceId;
	public FlowOrchestrationInstance FlowOrchestrationInstance;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ReferenceRecordId;
	public ServiceAppointment ReferenceRecord;
	public Datetime SystemModstamp;

	public FlowOrchestrationInstanceLinkShare[] Shares;

	public FlowOrchestrationInstanceLink clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationInstanceLink clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationInstanceLink clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationInstanceLink clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowOrchestrationInstanceLink clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
