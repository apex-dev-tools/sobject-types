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
public class CrbnCreditAllocItemChangeEvent extends SObject {
	public static SObjectType$<CrbnCreditAllocItemChangeEvent> SObjectType;
	public static SObjectFields$<CrbnCreditAllocItemChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CrbnCreditAllocId;
	public CrbnCreditAlloc CrbnCreditAlloc;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id EmissionsActivityId;
	public EmissionsActivity EmissionsActivity;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Decimal NetEmssnInTco2e;
	public String ReplayId;
	public Decimal TotalCrbnCrAllocInTco2e;
	public Decimal TotalEmssnInTco2e;

	public CrbnCreditAllocItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CrbnCreditAllocItemChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CrbnCreditAllocItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CrbnCreditAllocItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CrbnCreditAllocItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
