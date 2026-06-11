/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class DatacloudAddress extends SObject {
	public static SObjectType$<DatacloudAddress> SObjectType;
	public static SObjectFields$<DatacloudAddress> Fields;

	public String AddressLine1;
	public String AddressLine2;
	public String City;
	public String Country;
	public String CurrencyIsoCode;
	public String ExternalId;
	public String GeoAccuracyCode;
	public String GeoAccuracyNum;
	public Id Id;
	public String Latitude;
	public String Longitude;
	public String PostalCode;
	public String State;

	public DatacloudAddress clone$() {throw new java.lang.UnsupportedOperationException();}
	public DatacloudAddress clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudAddress clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudAddress clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudAddress clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
