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
public class OtherEmssnFctrSetItemChangeEvent extends SObject {
	public static SObjectType$<OtherEmssnFctrSetItemChangeEvent> SObjectType;
	public static SObjectFields$<OtherEmssnFctrSetItemChangeEvent> Fields;

	public Decimal CalorificValue;
	public String CalorificValueUnit;
	public Decimal Ch4EmissionFactor;
	public String Ch4EmissionFactorUnit;
	public Object ChangeEventHeader;
	public Decimal Co2EmissionFactor;
	public String Co2EmissionFactorUnit;
	public Decimal Co2eEmissionFactorInTco2eGj;
	public Decimal Co2eEmissionFactorInTco2eMwh;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ExternalIdentifier;
	public String FuelType;
	public Id FuelTypeRefId;
	public FuelType FuelTypeRef;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal N2oEmissionFactor;
	public String N2oEmissionFactorUnit;
	public String Name;
	public Id ParentEmissionFactorId;
	public OtherEmssnFctrSet ParentEmissionFactor;
	public Id ReferenceDataLoadLogId;
	public ReferenceDataLoadLog ReferenceDataLoadLog;
	public String ReplayId;
	public Boolean ShouldLockDtastUpdtForRec;
	public Decimal SuppliedEmissionsFactor;
	public String SuppliedEmissionsFactorUnit;

	public OtherEmssnFctrSetItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public OtherEmssnFctrSetItemChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OtherEmssnFctrSetItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OtherEmssnFctrSetItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OtherEmssnFctrSetItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
