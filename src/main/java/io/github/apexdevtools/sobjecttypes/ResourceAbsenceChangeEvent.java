/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ResourceAbsenceChangeEvent extends SObject {
	public static SObjectType$<ResourceAbsenceChangeEvent> SObjectType;
	public static SObjectFields$<ResourceAbsenceChangeEvent> Fields;

	public String AbsenceNumber;
	public Address Address;
	public String ApprovalStatus;
	public Object ChangeEventHeader;
	public String City;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime End;
	public String GeocodeAccuracy;
	public Id Id;
	public Boolean IsAbsenceTravelFromHomeBase;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal Latitude;
	public Decimal Longitude;
	public String PostalCode;
	public String ReplayId;
	public Id ResourceId;
	public ServiceResource Resource;
	public Datetime Start;
	public String State;
	public String StateCode;
	public String Street;
	public String Type;

	public ResourceAbsenceChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ResourceAbsenceChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ResourceAbsenceChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ResourceAbsenceChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ResourceAbsenceChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
