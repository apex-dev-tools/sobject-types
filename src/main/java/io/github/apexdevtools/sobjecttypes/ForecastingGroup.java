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
public class ForecastingGroup extends SObject {
	public static SObjectType$<ForecastingGroup> SObjectType;
	public static SObjectFields$<ForecastingGroup> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Integer DisplayPosition;
	public Id ForecastingTypeId;
	public ForecastingType ForecastingType;
	public String GroupField;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String SourceObject;
	public Datetime SystemModstamp;

	public ForecastingGroup clone$() {throw new java.lang.UnsupportedOperationException();}
	public ForecastingGroup clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingGroup clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingGroup clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingGroup clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
