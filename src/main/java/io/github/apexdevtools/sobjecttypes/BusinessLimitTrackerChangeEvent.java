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
public class BusinessLimitTrackerChangeEvent extends SObject {
	public static SObjectType$<BusinessLimitTrackerChangeEvent> SObjectType;
	public static SObjectFields$<BusinessLimitTrackerChangeEvent> Fields;

	public Id BusinessLimitSpecificationId;
	public BusinessLimitSpecification BusinessLimitSpecification;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LimitKey;
	public String Name;
	public String ReplayId;
	public Integer UsageValue;

	public BusinessLimitTrackerChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public BusinessLimitTrackerChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLimitTrackerChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLimitTrackerChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLimitTrackerChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
