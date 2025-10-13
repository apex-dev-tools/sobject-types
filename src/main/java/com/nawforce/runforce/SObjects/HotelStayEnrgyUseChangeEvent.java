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
public class HotelStayEnrgyUseChangeEvent extends SObject {
	public static SObjectType$<HotelStayEnrgyUseChangeEvent> SObjectType;
	public static SObjectFields$<HotelStayEnrgyUseChangeEvent> Fields;

	public String CalculationDetail;
	public Date CarbonFootprintReportDate;
	public Object ChangeEventHeader;
	public String CostCenter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal EmissionFctrKgCo2eRoomPerNight;
	public Date EndDate;
	public String HotelCity;
	public String HotelCountry;
	public String HotelName;
	public Id HotelStayEmssnFctrId;
	public HotelStayEmssnFctr HotelStayEmssnFctr;
	public Id Id;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Decimal RoomCount;
	public String RoomType;
	public Id Scope3CrbnFtprntId;
	public Scope3CrbnFtprnt Scope3CrbnFtprnt;
	public Decimal Scope3EmissionsInTco2e;
	public Id Scope3EmssnSrcId;
	public Scope3EmssnSrc Scope3EmssnSrc;
	public Date StartDate;
	public Decimal StayNightsCount;
	public Decimal SuplScope3Emissions;
	public Id SupplierId;
	public Supplier Supplier;
	public String TravelerName;

	public HotelStayEnrgyUseChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public HotelStayEnrgyUseChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HotelStayEnrgyUseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HotelStayEnrgyUseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HotelStayEnrgyUseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
