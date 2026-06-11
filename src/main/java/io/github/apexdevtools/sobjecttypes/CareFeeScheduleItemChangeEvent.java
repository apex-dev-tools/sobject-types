/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class CareFeeScheduleItemChangeEvent extends SObject {
	public static SObjectType$<CareFeeScheduleItemChangeEvent> SObjectType;
	public static SObjectFields$<CareFeeScheduleItemChangeEvent> Fields;

	public String CareFeeScheduleItemKey;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal FacilityPrice;
	public Id FeeScheduleDefinitionId;
	public FeeScheduleDefinition FeeScheduleDefinition;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Decimal NonFacilityPrice;
	public String ProcedureCodeDescription;
	public Id ProcedureCodeId;
	public CodeSetBundle ProcedureCode;
	public String ReplayId;

	public CareFeeScheduleItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareFeeScheduleItemChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareFeeScheduleItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareFeeScheduleItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareFeeScheduleItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
