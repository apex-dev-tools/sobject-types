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
public class BldgSizeCategoryChangeEvent extends SObject {
	public static SObjectType$<BldgSizeCategoryChangeEvent> SObjectType;
	public static SObjectFields$<BldgSizeCategoryChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal MaximumSize;
	public Decimal MaximumSizeInSqft;
	public Decimal MinimumSize;
	public Decimal MinimumSizeInSqft;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public String SizeUnit;

	public BldgSizeCategoryChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public BldgSizeCategoryChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BldgSizeCategoryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BldgSizeCategoryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BldgSizeCategoryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
