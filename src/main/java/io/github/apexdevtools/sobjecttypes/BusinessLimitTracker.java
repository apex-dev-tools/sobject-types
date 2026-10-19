/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class BusinessLimitTracker extends SObject {
	public static SObjectType$<BusinessLimitTracker> SObjectType;
	public static SObjectFields$<BusinessLimitTracker> Fields;

	public Id BusinessLimitSpecificationId;
	public BusinessLimitSpecification BusinessLimitSpecification;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LimitKey;
	public String Name;
	public Datetime SystemModstamp;
	public Integer UsageValue;

	public BusinessLimitPendingTrxn[] BusinessLimitPendingTrxnBusinessLimitTracker;

	public BusinessLimitTracker clone$() {throw new java.lang.UnsupportedOperationException();}
	public BusinessLimitTracker clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLimitTracker clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLimitTracker clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLimitTracker clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
