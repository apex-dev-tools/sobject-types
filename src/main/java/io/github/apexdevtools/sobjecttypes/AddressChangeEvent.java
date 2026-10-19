/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.eventbus.ChangeEventHeader;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AddressChangeEvent extends SObject {
	public static SObjectType$<AddressChangeEvent> SObjectType;
	public static SObjectFields$<AddressChangeEvent> Fields;

	public Address Address;
	public String AddressType;
	public ChangeEventHeader ChangeEventHeader;
	public String City;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String DrivingDirections;
	public String GeocodeAccuracy;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal Latitude;
	public String LocationType;
	public Decimal Longitude;
	public String Name;
	public Id ParentId;
	public Location Parent;
	public String PostalCode;
	public String ReplayId;
	public String State;
	public String StateCode;
	public String Street;
	public String TimeZone;

	public AddressChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AddressChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AddressChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AddressChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AddressChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
