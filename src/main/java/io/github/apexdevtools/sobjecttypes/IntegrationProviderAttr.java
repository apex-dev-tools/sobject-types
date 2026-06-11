/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class IntegrationProviderAttr extends SObject {
	public static SObjectType$<IntegrationProviderAttr> SObjectType;
	public static SObjectFields$<IntegrationProviderAttr> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public Datetime DateTimeValue;
	public Date DateValue;
	public String Description;
	public String DeveloperName;
	public Decimal DoubleValue;
	public Id Id;
	public Integer IntegerValue;
	public Id IntegrationProviderDefId;
	public IntegrationProviderDef IntegrationProviderDef;
	public Boolean IsDeleted;
	public Boolean IsRequired;
	public Boolean IsTrueOrFalseValue;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Decimal PercentageValue;
	public String StringValue;
	public Datetime SystemModstamp;

	public IntegrationProviderAttr clone$() {throw new java.lang.UnsupportedOperationException();}
	public IntegrationProviderAttr clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IntegrationProviderAttr clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IntegrationProviderAttr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IntegrationProviderAttr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
