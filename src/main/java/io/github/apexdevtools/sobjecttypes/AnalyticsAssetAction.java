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
public class AnalyticsAssetAction extends SObject {
	public static SObjectType$<AnalyticsAssetAction> SObjectType;
	public static SObjectFields$<AnalyticsAssetAction> Fields;

	public String ActionType;
	public Id AssetId;
	public SObject Asset;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventType;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;
	public Decimal Version;

	public AnalyticsAssetAction clone$() {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsAssetAction clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsAssetAction clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsAssetAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsAssetAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
