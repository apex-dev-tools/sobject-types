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
public class PartyProfileAddressChangeEvent extends SObject {
	public static SObjectType$<PartyProfileAddressChangeEvent> SObjectType;
	public static SObjectFields$<PartyProfileAddressChangeEvent> Fields;

	public Address Address;
	public String AddressType;
	public Object ChangeEventHeader;
	public String City;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String GeocodeAccuracy;
	public Id Id;
	public Boolean IsPrimaryAddress;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal Latitude;
	public Decimal Longitude;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PartyProfileId;
	public PartyProfile PartyProfile;
	public String PostalCode;
	public String ReplayId;
	public String State;
	public String StateCode;
	public String Street;
	public Date ValidityEndDate;
	public Date ValidityStartDate;

	public PartyProfileAddressChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PartyProfileAddressChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PartyProfileAddressChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PartyProfileAddressChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PartyProfileAddressChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
