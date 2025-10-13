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
public class Scope3EmssnSrcChangeEvent extends SObject {
	public static SObjectType$<Scope3EmssnSrcChangeEvent> SObjectType;
	public static SObjectFields$<Scope3EmssnSrcChangeEvent> Fields;

	public Id AirTravelEmssnFctrId;
	public AirTravelEmssnFctr AirTravelEmssnFctr;
	public String BusinessRegion;
	public Object ChangeEventHeader;
	public String City;
	public String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id FrgtHaulingEmssnFctrId;
	public FrgtHaulingEmssnFctr FrgtHaulingEmssnFctr;
	public Id GroundTravelEmssnFctrId;
	public GroundTravelEmssnFctr GroundTravelEmssnFctr;
	public Id HotelStayEmssnFctrId;
	public HotelStayEmssnFctr HotelStayEmssnFctr;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentEmissionSourceId;
	public Scope3EmssnSrc ParentEmissionSource;
	public String PostalCode;
	public Id RentalCarEmssnFctrId;
	public RentalCarEmssnFctr RentalCarEmssnFctr;
	public String ReplayId;
	public String Scope3EmissionSourceType;
	public String State;

	public Scope3EmssnSrcChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public Scope3EmssnSrcChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Scope3EmssnSrcChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Scope3EmssnSrcChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Scope3EmssnSrcChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
