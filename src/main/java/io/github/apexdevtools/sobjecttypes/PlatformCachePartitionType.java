/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PlatformCachePartitionType extends SObject {
	public static SObjectType$<PlatformCachePartitionType> SObjectType;
	public static SObjectFields$<PlatformCachePartitionType> Fields;

	public Integer AllocatedCapacity;
	public Integer AllocatedPartnerCapacity;
	public Integer AllocatedPurchasedCapacity;
	public Integer AllocatedTrialCapacity;
	public String CacheType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id PlatformCachePartitionId;
	public PlatformCachePartition PlatformCachePartition;
	public Datetime SystemModstamp;

	public PlatformCachePartitionType clone$() {throw new java.lang.UnsupportedOperationException();}
	public PlatformCachePartitionType clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PlatformCachePartitionType clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PlatformCachePartitionType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PlatformCachePartitionType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
