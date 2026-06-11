/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class StandardShippingRate extends SObject {
	public static SObjectType$<StandardShippingRate> SObjectType;
	public static SObjectFields$<StandardShippingRate> Fields;

	public String ConditionFactor;
	public Decimal ConditionRangeMax;
	public Decimal ConditionRangeMin;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Decimal Price;
	public Id ShippingCarrierMethodId;
	public ShippingCarrierMethod ShippingCarrierMethod;
	public Id ShippingZoneId;
	public ShippingRateArea ShippingZone;
	public Datetime SystemModstamp;
	public Integer TransitTimeMax;
	public Integer TransitTimeMin;
	public String TransitTimeUnit;
	public String WeightUnit;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public StandardShippingRate clone$() {throw new java.lang.UnsupportedOperationException();}
	public StandardShippingRate clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public StandardShippingRate clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public StandardShippingRate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public StandardShippingRate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
