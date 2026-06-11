/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Long;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class RetentionStoreUsage extends SObject {
	public static SObjectType$<RetentionStoreUsage> SObjectType;
	public static SObjectFields$<RetentionStoreUsage> Fields;

	public String AttributeDetail;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MetricType;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String RetentionType;
	public Datetime SystemModstamp;
	public String UnitOfMeasure;
	public Long Usage;
	public Datetime UsageDateTime;

	public RetentionStoreUsageShare[] Shares;

	public RetentionStoreUsage clone$() {throw new java.lang.UnsupportedOperationException();}
	public RetentionStoreUsage clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RetentionStoreUsage clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RetentionStoreUsage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RetentionStoreUsage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
