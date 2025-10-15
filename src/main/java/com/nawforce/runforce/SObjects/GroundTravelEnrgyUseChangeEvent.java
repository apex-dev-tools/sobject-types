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
public class GroundTravelEnrgyUseChangeEvent extends SObject {
	public static SObjectType$<GroundTravelEnrgyUseChangeEvent> SObjectType;
	public static SObjectFields$<GroundTravelEnrgyUseChangeEvent> Fields;

	public String CalculationDetail;
	public Date CarbonFootprintReportDate;
	public Decimal Ch4EmissionsInKg;
	public Object ChangeEventHeader;
	public Decimal Co2EmissionsInKg;
	public String CostCenter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyCode;
	public String CurrencyIsoCode;
	public Decimal Distance;
	public String DistanceUnit;
	public Date EndDate;
	public String ExpenseType;
	public Id GroundTravelEmssnFctrId;
	public GroundTravelEmssnFctr GroundTravelEmssnFctr;
	public Id Id;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal N2oEmissionsInKg;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PcmtEmssnFctrSetItemId;
	public PcmtEmssnFctrSetItem PcmtEmssnFctrSetItem;
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
	public String TravelerName;
	public Decimal TripCost;

	public GroundTravelEnrgyUseChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public GroundTravelEnrgyUseChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GroundTravelEnrgyUseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GroundTravelEnrgyUseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GroundTravelEnrgyUseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
