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
public class ForecastingTypeSource extends SObject {
	public static SObjectType$<ForecastingTypeSource> SObjectType;
	public static SObjectFields$<ForecastingTypeSource> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id ForecastingSourceDefinitionId;
	public ForecastingSourceDefinition ForecastingSourceDefinition;
	public Id ForecastingTypeId;
	public ForecastingType ForecastingType;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Id ParentSourceDefinitionId;
	public ForecastingSourceDefinition ParentSourceDefinition;
	public String RelationField;
	public Integer SourceGroup;
	public Datetime SystemModstamp;

	public ForecastingTypeSource clone$() {throw new java.lang.UnsupportedOperationException();}
	public ForecastingTypeSource clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingTypeSource clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingTypeSource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingTypeSource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
