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
public class AirTravelEmssnFctrChangeEvent extends SObject {
	public static SObjectType$<AirTravelEmssnFctrChangeEvent> SObjectType;
	public static SObjectFields$<AirTravelEmssnFctrChangeEvent> Fields;

	public Decimal Ch4PsgrKmLongHaulInKgCo2e;
	public Decimal Ch4PsgrKmMediumHaulInKgCo2e;
	public Decimal Ch4PsgrKmShortHaulInKgCo2e;
	public Decimal Ch4PsgrMileLongHaulInKgCo2e;
	public Decimal Ch4PsgrMileMediumHaulInKgCo2e;
	public Decimal Ch4PsgrMileShortHaulInKgCo2e;
	public Object ChangeEventHeader;
	public Decimal Co2PsgrKmLongHaulInKg;
	public Decimal Co2PsgrKmMediumHaulInKg;
	public Decimal Co2PsgrKmShortHaulInKg;
	public Decimal Co2PsgrMileLongHaulInKg;
	public Decimal Co2PsgrMileMediumHaulInKg;
	public Decimal Co2PsgrMileShortHaulInKg;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DistanceUnit;
	public String EmissionFactorDataSource;
	public String EmissionFactorUpdateYear;
	public String ExternalIdentifier;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal LongHaulMinimumDistance;
	public Decimal MediumHaulMaximumDistance;
	public Decimal N2oPsgrKmLongHaulInKgCo2e;
	public Decimal N2oPsgrKmMediumHaulInKgCo2e;
	public Decimal N2oPsgrKmShortHaulInKgCo2e;
	public Decimal N2oPsgrMileLongHaulInKgCo2e;
	public Decimal N2oPsgrMileMediumHaulInKgCo2e;
	public Decimal N2oPsgrMileShortHaulInKgCo2e;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ReferenceDataLoadLogId;
	public ReferenceDataLoadLog ReferenceDataLoadLog;
	public String ReplayId;
	public Decimal ShortHaulMaximumDistance;
	public Boolean ShouldLockDtastUpdtForRec;

	public AirTravelEmssnFctrChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AirTravelEmssnFctrChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AirTravelEmssnFctrChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AirTravelEmssnFctrChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AirTravelEmssnFctrChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
