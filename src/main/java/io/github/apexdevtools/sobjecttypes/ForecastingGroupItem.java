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
public class ForecastingGroupItem extends SObject {
	public static SObjectType$<ForecastingGroupItem> SObjectType;
	public static SObjectFields$<ForecastingGroupItem> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Integer DisplayPosition;
	public Id ForecastingGroupId;
	public ForecastingGroup ForecastingGroup;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String SourceValueApiName;
	public String SourceValueLabel;
	public String SourceValueTranslatedLabel;
	public Datetime SystemModstamp;

	public ForecastingGroupItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public ForecastingGroupItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingGroupItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingGroupItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingGroupItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
