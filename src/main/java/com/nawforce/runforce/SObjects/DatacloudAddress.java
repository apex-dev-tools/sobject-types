/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

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

	public DatacloudAddress clone$() {throw new UnsupportedOperationException();}
	public DatacloudAddress clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public DatacloudAddress clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public DatacloudAddress clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public DatacloudAddress clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
