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
public class HotelStayEmssnFctrChangeEvent extends SObject {
	public static SObjectType$<HotelStayEmssnFctrChangeEvent> SObjectType;
	public static SObjectFields$<HotelStayEmssnFctrChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EmissionFactorDataSource;
	public String EmissionFactorUpdateYear;
	public String ExternalIdentifier;
	public Decimal HotelStayEmssnInKgCo2eNight;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ReferenceDataLoadLogId;
	public ReferenceDataLoadLog ReferenceDataLoadLog;
	public String ReplayId;
	public Boolean ShouldLockDtastUpdtForRec;

	public HotelStayEmssnFctrChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public HotelStayEmssnFctrChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HotelStayEmssnFctrChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HotelStayEmssnFctrChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HotelStayEmssnFctrChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
