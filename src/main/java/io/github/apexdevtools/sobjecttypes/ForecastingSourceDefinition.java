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
public class ForecastingSourceDefinition extends SObject {
	public static SObjectType$<ForecastingSourceDefinition> SObjectType;
	public static SObjectFields$<ForecastingSourceDefinition> Fields;

	public String CategoryField;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DateField;
	public String DeveloperName;
	public String FamilyField;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String MeasureField;
	public String SourceObject;
	public Datetime SystemModstamp;
	public String Territory2Field;
	public String UserField;

	public ForecastingSourceDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public ForecastingSourceDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingSourceDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingSourceDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingSourceDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
