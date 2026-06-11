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
public class DecisionTableParameter extends SObject {
	public static SObjectType$<DecisionTableParameter> SObjectType;
	public static SObjectFields$<DecisionTableParameter> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public Id DecisionTableId;
	public DecisionTable DecisionTable;
	public String DomainObject;
	public String FieldName;
	public String FieldPath;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsGroupByField;
	public Boolean IsRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Operator;
	public Integer Sequence;
	public String SortType;
	public Datetime SystemModstamp;
	public String Usage;

	public PricingProcedureOutputMap[] DecisionOutputColumn;

	public DecisionTableParameter clone$() {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableParameter clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableParameter clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableParameter clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableParameter clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
