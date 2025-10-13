/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AirTravelEnrgyUseChangeEvent extends SObject {
	public static SObjectType$<AirTravelEnrgyUseChangeEvent> SObjectType;
	public static SObjectFields$<AirTravelEnrgyUseChangeEvent> Fields;

	public Id AirTravelEmssnFctrId;
	public AirTravelEmssnFctr AirTravelEmssnFctr;
	public String CalculationDetail;
	public Date CarbonFootprintReportDate;
	public Decimal Ch4PassengerKmInKgCo2e;
	public Decimal Ch4PassengerMileInKgCo2e;
	public Object ChangeEventHeader;
	public Decimal Co2PassengerKmInKg;
	public Decimal Co2PassengerMileInKg;
	public String CostCenter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DestinationCity;
	public String DestinationCountry;
	public Date EndDate;
	public String HaulLength;
	public Id Id;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal N2oPassengerKmInKgCo2e;
	public Decimal N2oPassengerMileInKgCo2e;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Id Scope3CrbnFtprntId;
	public Scope3CrbnFtprnt Scope3CrbnFtprnt;
	public Decimal Scope3EmissionsInTco2e;
	public Id Scope3EmssnSrcId;
	public Scope3EmssnSrc Scope3EmssnSrc;
	public Decimal SegmentDistance;
	public Decimal SegmentDistanceInMiles;
	public String SegmentDistanceUnit;
	public String SourceCity;
	public String SourceCountry;
	public Date StartDate;
	public Decimal SuplScope3Emissions;
	public Id SupplierId;
	public Supplier Supplier;
	public String TravelerBaseCity;
	public String TravelerBaseCountry;
	public String TravelerName;
	public Decimal VendorProvidedEmissionsInTco2e;

	public AirTravelEnrgyUseChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AirTravelEnrgyUseChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AirTravelEnrgyUseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AirTravelEnrgyUseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AirTravelEnrgyUseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
