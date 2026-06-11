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
public class CurrencyType extends SObject {
	public static SObjectType$<CurrencyType> SObjectType;
	public static SObjectFields$<CurrencyType> Fields;

	public Decimal ConversionRate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Integer DecimalPlaces;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsCorporate;
	public String IsoCode;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;

	public CurrencyType clone$() {throw new java.lang.UnsupportedOperationException();}
	public CurrencyType clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CurrencyType clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CurrencyType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CurrencyType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
