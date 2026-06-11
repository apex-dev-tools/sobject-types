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
public class CrbnCreditAllocChangeEvent extends SObject {
	public static SObjectType$<CrbnCreditAllocChangeEvent> SObjectType;
	public static SObjectFields$<CrbnCreditAllocChangeEvent> Fields;

	public Decimal AllocatedCarbonCrCost;
	public Id AnnualEmssnInventoryId;
	public AnnualEmssnInventory AnnualEmssnInventory;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Decimal NetEmissionsInTco2e;
	public Decimal NetScope1EmssnInTco2e;
	public Decimal NetScope2EmssnInTco2e;
	public Decimal NetScope3EmssnInTco2e;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Decimal Scp1CrbnCrAllocInTco2e;
	public Decimal Scp2CrbnCrAllocInTco2e;
	public Decimal Scp3CrbnCrAllocInTco2e;
	public Decimal TotalCrbnCrAllocInTco2e;
	public Decimal TotalEmssnInTco2e;
	public Decimal TotalScope1EmssnInTco2e;
	public Decimal TotalScope2EmssnInTco2e;
	public Decimal TotalScope3EmssnInTco2e;
	public String Year;

	public CrbnCreditAllocChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CrbnCreditAllocChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CrbnCreditAllocChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CrbnCreditAllocChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CrbnCreditAllocChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
