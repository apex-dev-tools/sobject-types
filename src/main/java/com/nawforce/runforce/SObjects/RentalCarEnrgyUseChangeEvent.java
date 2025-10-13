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
public class RentalCarEnrgyUseChangeEvent extends SObject {
	public static SObjectType$<RentalCarEnrgyUseChangeEvent> SObjectType;
	public static SObjectFields$<RentalCarEnrgyUseChangeEvent> Fields;

	public String CalculationDetail;
	public Date CarbonFootprintReportDate;
	public Decimal Ch4EmissionsInKg;
	public Object ChangeEventHeader;
	public Decimal Co2EmissionsInKg;
	public String CostCenter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal Distance;
	public String DistanceUnit;
	public Date EndDate;
	public Decimal FuelEfficiencyInLkm;
	public Decimal FuelEfficiencyInMpg;
	public String FuelType;
	public Id Id;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal N2oEmissionsInKg;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String RentalCarCompanyCode;
	public String RentalCarCompanyName;
	public Id RentalCarEmssnFctrId;
	public RentalCarEmssnFctr RentalCarEmssnFctr;
	public String ReplayId;
	public Id Scope3CrbnFtprntId;
	public Scope3CrbnFtprnt Scope3CrbnFtprnt;
	public Decimal Scope3EmissionsInTco2e;
	public Id Scope3EmssnSrcId;
	public Scope3EmssnSrc Scope3EmssnSrc;
	public String Scope3GhgCategory;
	public Date StartDate;
	public Decimal SuplScope3Emissions;
	public Id SupplierId;
	public Supplier Supplier;
	public Decimal TotalFuelConsumptionInGal;
	public Decimal TotalFuelConsumptionInLiter;
	public String TravelerName;
	public Decimal VendorProvidedEmissionsInTco2e;

	public RentalCarEnrgyUseChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public RentalCarEnrgyUseChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RentalCarEnrgyUseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RentalCarEnrgyUseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RentalCarEnrgyUseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
