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
public class YearlyUsageTrkgDataGapChangeEvent extends SObject {
	public static SObjectType$<YearlyUsageTrkgDataGapChangeEvent> SObjectType;
	public static SObjectFields$<YearlyUsageTrkgDataGapChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal DataGapPercent;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Id SourceObjectId;
	public SObject SourceObject;
	public Id StnryAssetEnvrSrcId;
	public StnryAssetEnvrSrc StnryAssetEnvrSrc;
	public String Type;
	public String UsageType;
	public String Year;

	public YearlyUsageTrkgDataGapChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public YearlyUsageTrkgDataGapChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public YearlyUsageTrkgDataGapChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public YearlyUsageTrkgDataGapChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public YearlyUsageTrkgDataGapChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
