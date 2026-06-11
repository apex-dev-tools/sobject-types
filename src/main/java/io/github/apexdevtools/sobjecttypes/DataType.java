/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class DataType extends SObject {
	public static SObjectType$<DataType> SObjectType;
	public static SObjectFields$<DataType> Fields;

	public String ContextServiceDataTypeId;
	public String ContextWsdlDataTypeId;
	public String DeveloperName;
	public String DurableId;
	public Id Id;
	public Boolean IsComplex;

	public DataType clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataType clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataType clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
