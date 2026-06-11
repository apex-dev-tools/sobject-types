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
public class GroundTravelEmssnFctrChangeEvent extends SObject {
	public static SObjectType$<GroundTravelEmssnFctrChangeEvent> SObjectType;
	public static SObjectFields$<GroundTravelEmssnFctrChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyCode;
	public String CurrencyIsoCode;
	public String DistanceUnit;
	public String EmissionFactorDataSource;
	public String EmissionFactorUpdateYear;
	public String ExternalIdentifier;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Decimal PersCarEmssnInKgCh4DstnUnit;
	public Decimal PersCarEmssnInKgCo2DstnUnit;
	public Decimal PersCarEmssnInKgCo2eDstnUnit;
	public Decimal PersCarEmssnInKgN2oDstnUnit;
	public Id ReferenceDataLoadLogId;
	public ReferenceDataLoadLog ReferenceDataLoadLog;
	public String ReplayId;
	public Boolean ShouldLockDtastUpdtForRec;
	public Decimal TaxiEmssnInKgCh4DstnUnit;
	public Decimal TaxiEmssnInKgCo2DstnUnit;
	public Decimal TaxiEmssnInKgCo2eDstnUnit;
	public Decimal TaxiEmssnInKgN2oDstnUnit;
	public Decimal TaxiRateForDstnUnit;
	public Decimal TrainEmssnInKgCh4DstnUnit;
	public Decimal TrainEmssnInKgCo2DstnUnit;
	public Decimal TrainEmssnInKgCo2eDstnUnit;
	public Decimal TrainEmssnInKgN2oDstnUnit;
	public Decimal TrainRateForDstnUnit;

	public GroundTravelEmssnFctrChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public GroundTravelEmssnFctrChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GroundTravelEmssnFctrChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GroundTravelEmssnFctrChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GroundTravelEmssnFctrChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
