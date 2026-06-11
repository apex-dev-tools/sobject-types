/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ForecastingColumnDefinition extends SObject {
	public static SObjectType$<ForecastingColumnDefinition> SObjectType;
	public static SObjectFields$<ForecastingColumnDefinition> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id ForecastingTypeId;
	public ForecastingType ForecastingType;
	public String Formula;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String ReferenceField;
	public String ResultField;
	public Datetime SystemModstamp;

	public ForecastingColumnDefinitionLocalization[] Localization;

	public ForecastingColumnDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public ForecastingColumnDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingColumnDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingColumnDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingColumnDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
