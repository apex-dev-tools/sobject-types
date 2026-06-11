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
public class LocationChangeEvent extends SObject {
	public static SObjectType$<LocationChangeEvent> SObjectType;
	public static SObjectFields$<LocationChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Object ChangeEventHeader;
	public Date CloseDate;
	public Date ConstructionEndDate;
	public Date ConstructionStartDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Time DefaultPickupTime;
	public Integer DefaultProcessingTime;
	public String DefaultProcessingTimeUnit;
	public String Description;
	public String DrivingDirections;
	public Integer EarliestPickupTimeOffset;
	public String Email;
	public String ExternalReference;
	public String Fax;
	public Id FulfillingBusinessHoursId;
	public BusinessHours FulfillingBusinessHours;
	public Id FulfillingOperationalHoursId;
	public OperatingHours FulfillingOperationalHours;
	public Id Id;
	public Boolean IsEligibleForPickup;
	public Boolean IsInventoryLocation;
	public Boolean IsMobile;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer LatestPickupTimeOffset;
	public Decimal Latitude;
	public Location Location;
	public Integer LocationLevel;
	public String LocationType;
	public Id LogoId;
	public ContentAsset Logo;
	public Decimal Longitude;
	public String Mobile;
	public String Name;
	public Date OpenDate;
	public Id OwnerId;
	public User Owner;
	public Id ParentLocationId;
	public Location ParentLocation;
	public String Phone;
	public Integer PickupProcessingTime;
	public String PickupProcessingTimeUnit;
	public Date PossessionDate;
	public Date RemodelEndDate;
	public Date RemodelStartDate;
	public String ReplayId;
	public Id RootLocationId;
	public Location RootLocation;
	public Boolean ShouldSyncWithOci;
	public String TimeZone;
	public Id VisitorAddressId;
	public Address VisitorAddress;

	public LocationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LocationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LocationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LocationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LocationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
